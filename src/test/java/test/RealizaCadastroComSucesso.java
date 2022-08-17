package test;

import static core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import page.LoginPage;
import page.ProfilePage;
import page.RegisterPage;

public class RealizaCadastroComSucesso {
	
	private LoginPage login;
	private RegisterPage register;
	private ProfilePage profile;

	@Before
	public void inicio() {

		getDriver().get("https://demoqa.com/login");
		login = new LoginPage();
		register = new RegisterPage();
		profile = new ProfilePage();

	}
		
	@Test
	public void testRealizarCadastro() throws Exception {

		String user = "ATester"+System.nanoTime();
		String senha = "Test@123";
				
		login.sendScrool(500);
		login.clicarBotaoNewUser();
		register.setNome("Allan");
		register.setSobreNome("Tester");
		register.setUsuario(user);
		register.setSenha(senha);
		login.sendScrool(500);
		register.clicarRecaptch();
		register.processandoRecaptcha();
		register.clicarBotaoRegister();
		register.alertOk();
		register.clicarBotaoBackToLogin();
		login.setUsuario(user);
		login.setSenha(senha);
		login.clicarBotaoLogin();
		profile.validarUsuarioLogado(user);


	}

}
