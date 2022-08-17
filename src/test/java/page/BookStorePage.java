package page;

import core.BasePage;

public class BookStorePage extends BasePage{

	

	public void setLivro(String nome) throws InterruptedException {
		Thread.sleep(2000);
		dsl.digitarCampo("searchBox", nome);

	}
	
	public void clicarLoja() {
		dsl.teste("//span[.='Book Store']");

	}
	
	public void buscarLivro() {
		dsl.clicarBotao("basic-addon2");

	}
	
	public void selecionarLivro() {
		dsl.clicarBotao("see-book-Git Pocket Guide");

	}
	
	
	public void validarAutor() throws Exception {
		dsl.assertEqualsXpath("Richard E. Silverman", "//label[.=\"Richard E. Silverman\"]");

	}
	public void validarISBN() throws Exception {
		dsl.assertEqualsXpath("9781449325862", "//label[.=\"9781449325862\"]");

	}
	
	public void adicionarLivro() {
		dsl.clicarBotaoXpath("//button[.='Add To Your Collection']");
System.out.println("adicionou livro");
	}
	
	
	public void retornarPerfil() {
		dsl.clicarBotao("addNewRecordButton");

	}
	
	public void alertOk() throws InterruptedException {
		Thread.sleep(2000);
		dsl.alertaConfirmed();
		System.out.println("clicou alert");
	}
	
	public void clicarPerfil() {
		dsl.teste("//span[.='Profile']");
		System.out.println("clicou perfil");

	}
	
	public void validarLivroAdd() throws Exception {
		Thread.sleep(2000);
		dsl.assertEqualsXpath("Git Pocket Guide", "//a[.=\"Git Pocket Guide\"]");

	}


}
