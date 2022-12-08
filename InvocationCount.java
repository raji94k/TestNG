package testNGparallel;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {

	@Test(invocationCount = 2)//Running TESTCASE 2 Times
	public void Amazon() {

		WebDriverManager.edgedriver().setup();

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		//driver.close();

	}

}
