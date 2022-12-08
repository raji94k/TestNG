package testNGbeforeMethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WatchInAmazon extends AmazonCommonCode {

	@Test
	public void watch() {

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");

		driver.findElement(By.xpath("//div[@aria-label='watches for men']")).click();


	}

}
