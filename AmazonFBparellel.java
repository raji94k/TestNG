package testNGparallel;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFBparellel {

	@Test
	public void Amazon() {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		//driver.close();


	}

}
