package testNGsoftHardDependancy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftDependancy {

	@Test(dependsOnMethods = "testNGdependsONmethod.FlipKart.flipkart", alwaysRun = true)
	public void soft() {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("raji@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lux81484");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();


	}

}
