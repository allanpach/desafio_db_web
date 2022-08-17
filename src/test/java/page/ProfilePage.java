package page;

import org.openqa.selenium.By;

import core.DSL;

public class ProfilePage {

	private DSL dsl;

	public ProfilePage() {
		dsl = new DSL();
	}

	public void filtrarProdutosPorLowToHigh(String textoCampo) throws Exception {
		dsl.selecionarComboPeloTexto("product_sort_container", textoCampo);
	}

	public void selecionarProdutoSauceLabsOnesie() {
		dsl.clicarBotao("add-to-cart-sauce-labs-onesie");
	}

	public void selecionarProdutoTestAllTheThingsT_ShirtRed() {
		dsl.clicarBotao("add-to-cart-test.allthethings()-t-shirt-(red)");
	}

	public void irParaCarrinhoDeCompra() {
		dsl.clicarElemento("shopping_cart_container");
	}

	

	//---------------------------
	
	public void esperarUserVisivel() throws Exception {
		dsl.esperarElemento(By.id("userName-value"));
	}
	
	public void validarUsuarioLogado(String mensagem) throws Exception {
	
		dsl.assertEqualsId(mensagem,"userName-value");
	}
	
}
