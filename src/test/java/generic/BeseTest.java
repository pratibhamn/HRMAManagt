package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeseTest implements AutoConst {
	public static WebDriver driver;
	@BeforeMethod
	public void preCondtion() {		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		 driver=new ChromeDriver();		
		//System.setProperty(GECKO_KEY, GECKO_VALUE);
		 //driver=new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
