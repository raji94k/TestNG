package testNGparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBamazonParallel {

	@Test
	public void FaceBook () {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("raj");

		//driver.findElement(By.name("login")).click();

		driver.findElement(By.linkText("Create New Account")).click();
		
		//driver.close();


	}

}
