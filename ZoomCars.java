package testNgGroups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCars {

	@Test(groups = "lux")
	public void zoomcar() {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.zoomcar.com/");

		driver.manage().window().maximize();

	}

}
