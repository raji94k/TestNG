package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBustestNG {

	@Test
	public void redbus() throws IOException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("dest")).sendKeys("Pondy");
			
			driver.findElement(By.id("src")).sendKeys("chennai");
			
			 File source = driver.getScreenshotAs(OutputType.FILE);
			    File destination = new File("./snap/snap4.png");
			    FileUtils.copyFile(source, destination );
			
			driver.close();
			

	}

}
