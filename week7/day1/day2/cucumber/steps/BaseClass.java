package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver; // driver is null
	
	
	@BeforeMethod
	public void preCondition() {
		//open chromebrowse
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //session id
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//load application
		driver.get("http://leaftaps.com/opentaps");
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	

}
