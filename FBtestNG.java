package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBtestNG {

	@Test
	public void facebook() throws IOException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("raj");
			driver.findElement(By.id("pass")).sendKeys("raji");
			
			 File source = driver.getScreenshotAs(OutputType.FILE);
			    File destination = new File("./snap/snap2.png");
			    FileUtils.copyFile(source, destination );
			
			driver.close();

	}

}
