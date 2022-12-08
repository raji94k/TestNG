package testNgGroups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusLogIn {

	@Test(groups = "lux")
	public void redbus() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.findElement(By.id("dest")).sendKeys("Pondy");

		driver.findElement(By.id("src")).sendKeys("chennai");

	}

}
