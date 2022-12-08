package testNGdependsONmethod;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test(dependsOnMethods ="testNGdependsONmethod.FlipKart.flipkart")
	public void amazon() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");


	}

}
