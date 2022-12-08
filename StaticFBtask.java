package testNgParameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaticFBtask extends StaticBaseCode{

	@Test
	public void fb() {
		
		WebElement value = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text = value.getText();

		System.out.println(text.substring(4)); //SUB STRING (part of the string)


	}

}
