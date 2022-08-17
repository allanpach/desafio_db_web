package core;

import static core.DriverFactory.getDriver;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

	public static String timestamp() {
		return new SimpleDateFormat("dd-MM-yyyy HH_mm_ss").format(new Date());
	}

	public void assertEqualsId(String texto, String idCampo) throws Exception {
		Assert.assertEquals(texto, obterTexto(By.id(idCampo)));
	}

	public void assertEqualsXpath(String texto, String path) throws Exception {
		Assert.assertEquals(texto, obterTexto(By.xpath(path)));
	}

	public String obterValorCampo(String idCampo) {
		return getDriver().findElement(By.id(idCampo)).getAttribute("value");

	}

	public String obterTexto(By by) throws Exception {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String idCampo) throws Exception {
		return obterTexto(By.id(idCampo));
	}

	public void clicarElemento(String idCampo) {
		getDriver().findElement(By.id(idCampo)).click();
	}

	public void clicarBotao(String idCampo) {
		getDriver().findElement(By.id(idCampo)).click();
	}

	public void clicarBotaoXpath(String pathCampo) {
		getDriver().findElement(By.xpath(pathCampo)).click();

	}

	public void clicarLink(String link) throws Exception {
		getDriver().findElement(By.linkText(link)).click();
	}

	public void elementoVisivel(String idElemento) throws Exception {
		getDriver().findElement(By.id(idElemento)).isDisplayed();
	}


	public void esperarElemento(By by) throws Exception {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void selecionarComboPeloTexto(String classElemento, String textoCampo) throws Exception {
		WebElement element = getDriver().findElement(By.className(classElemento));
		Select combo = new Select(element);
		combo.selectByVisibleText(textoCampo);

	}

	public void digitarCampo(String idCampo, String texto) {
		getDriver().findElement(By.id(idCampo)).sendKeys(texto);

	}

	/********* Frames e Janelas ************/

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void alertaConfirmed() {
		Alert alert = getDriver().switchTo().alert();
		alert.accept();

	}

	public void teste(String path) {
		getDriver().findElement(By.xpath(path)).click();

	}

}
