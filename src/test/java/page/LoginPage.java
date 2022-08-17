package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.JavascriptExecutor;

import core.DSL;

public class LoginPage {

	private DSL dsl;

	public LoginPage() {
		dsl = new DSL();
	}

		
	public void setUsuario(String usuario) {
		dsl.digitarCampo("userName", usuario);
	}

	public void setSenha(String senha) {
		dsl.digitarCampo("password", senha);
	}

	public void clicarBotaoLogin() {
		dsl.clicarBotao("login");
	}
	
	public void clicarBotaoNewUser() {
		dsl.clicarBotaoXpath("//*[@id=\"userForm\"]/div[4]/div[2]");
	}
	
	
	public void sendScrool(int scrool){
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript("window.scrollBy(0,"+scrool+")", "");
		
	}

	public void setNome(String nome) {
		dsl.digitarCampo("firstname", nome);
		
	}

	public void setSobreNome(String sobrenome) {
		dsl.digitarCampo("lastname", sobrenome);
	}

		
	public void clicarRecaptch() throws Exception {
		dsl.elementoVisivel("g-recaptcha");
		dsl.clicarBotao("g-recaptcha");
	}

	
	public void clicarBotaoRegister() {
		dsl.clicarBotao("register");
	}
	
	public void clicarBotaoBackToLogin() {
		dsl.clicarBotao("backToLogin");
	}
	
	
	// mensagem esperada
		public void assertMensagem(String mensagem) throws Exception {
			dsl.assertEqualsXpath(mensagem, "//*[.='Pedido realizado com sucesso!']");
		}

}
