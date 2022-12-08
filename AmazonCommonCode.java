package testNGbeforeMethod;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCommonCode {

	ChromeDriver driver;
	WebDriverWait wait;

	@BeforeMethod

	public void commoncode() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

	}
	/*@AfterMethod
	public void closetab() {
		driver.close();	
	}*/
}
