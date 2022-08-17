package suit;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.RealizaCadastroComSucesso;
import test.AcessaEbookDaLivraria;
import test.RealizaCadastroComPasswordNumerico;

@RunWith(Suite.class)
@SuiteClasses({
	
	RealizaCadastroComSucesso.class,
	RealizaCadastroComPasswordNumerico.class,
	AcessaEbookDaLivraria.class

})

public class SuitTest {
	@AfterClass
	public static void finalizarTudo() {
		killDriver();
		getDriver().quit();
	}

}
