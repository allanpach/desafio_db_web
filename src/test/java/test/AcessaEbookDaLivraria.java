package test;

import static core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import page.BookStorePage;
import page.LoginPage;
import page.ProfilePage;


public class AcessaEbookDaLivraria {

	private LoginPage login;
	private BookStorePage store;
	private ProfilePage profile;

	@Before
	public void inicio() {

		getDriver().get("https://demoqa.com/login");
		login = new LoginPage();
		store = new BookStorePage();
		profile = new ProfilePage();

	}

	@After
	public void finalizar() {
		getDriver().quit();
	}

	@Test
	public void testSelecionarLivro() throws Exception {

		String user = "ATester102386788980400";
		String senha = "Test@123";

		login.setUsuario(user);
		login.setSenha(senha);
		login.clicarBotaoLogin();
		profile.esperarUserVisivel();
		profile.validarUsuarioLogado(user);
		login.sendScrool(500);
		store.clicarLoja();
		store.setLivro("Git Pocket Guide");
		store.buscarLivro();
		store.selecionarLivro();
		store.validarAutor();
		store.validarISBN();
		login.sendScrool(500);
		store.adicionarLivro();
		store.alertOk();
		login.sendScrool(500);
		store.clicarPerfil();
		login.sendScrool(100);
		store.validarLivroAdd();

	}
}
