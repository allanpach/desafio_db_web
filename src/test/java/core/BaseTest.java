package core;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	@After
	public void finalizar() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File arquivo = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("." + File.separator + "ScreenShots" + File.separator
				+ testName.getMethodName() + "_" + DSL.timestamp() + ".png"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		
		}

	}

	@Rule
	public TestName testName = new TestName();

}
