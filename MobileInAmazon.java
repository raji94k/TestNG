package testNGbeforeMethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MobileInAmazon extends AmazonCommonCode{

	@Test
	public void mobile() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//div[@aria-label='mobile under 10000']")).click();
		

	}

}
