package test;

import static core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import page.LoginPage;
import page.RegisterPage;

public class RealizaCadastroComPasswordNumerico {
	

	private LoginPage login;
	private RegisterPage register;
	

	@Before
	public void inicio() {

		getDriver().get("https://demoqa.com/login");
		login = new LoginPage();
		register = new RegisterPage();
		
	}

	@Test
	public void testValidarSenha() throws Exception {

		login.sendScrool(500);
		login.clicarBotaoNewUser();
		register.setNome("Allan");
		register.setSobreNome("Tester");
		register.setUsuario("ATester");
		register.setSenha("12345");
		login.sendScrool(500);
		register.clicarRecaptch();
		register.processandoRecaptcha();
		register.clicarBotaoRegister();
		register.validarMensagem("Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer.");

	}	
	
}
