package page;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.DSL;

public class RegisterPage {

	private DSL dsl;

	public RegisterPage() {
		dsl = new DSL();
	}

	public void setNome(String nome) {
		dsl.digitarCampo("firstname", nome);

	}

	public void setSobreNome(String sobrenome) {
		dsl.digitarCampo("lastname", sobrenome);
	}

	public void setUsuario(String usuario) {
		dsl.digitarCampo("userName", usuario);
	}

	public void setSenha(String senha) {
		dsl.digitarCampo("password", senha);
	}

	public void acessarUmFrame() throws InterruptedException {
		dsl.entrarFrame("google_esf");

	}

	public void sairDoFrame() throws InterruptedException {
		dsl.sairFrame();

	}

	public void clicarRecaptch() throws InterruptedException {
		Thread.sleep(2000);
		dsl.clicarBotao("g-recaptcha");

	}

	public void clicarBotaoRegister() {
		dsl.clicarBotao("register");
	}

	public void clicarBotaoBackToLogin() {
		dsl.clicarBotao("backToLogin");
	}

	public void validarMensagem(String mensagem) throws Exception {
		dsl.assertEqualsId(mensagem,"name");
	}

	public void alertOk() throws InterruptedException {
		Thread.sleep(1000);
		dsl.alertaConfirmed();
		
	}
	
	public void processandoRecaptcha() throws Exception {
		Thread.sleep(1000);			
			}
}
