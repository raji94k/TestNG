package testNgParameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBaseCode {

	ChromeDriver driver;
	WebDriverWait wait;

	@Parameters({"url","id","pass"})
	@BeforeMethod

	public void commoncode(String url, String id, String pass) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']")).sendKeys("id");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")).click();


	}
	/*
	@AfterMethod
	public void closetab() {
		driver.close();	
	}*/

}


