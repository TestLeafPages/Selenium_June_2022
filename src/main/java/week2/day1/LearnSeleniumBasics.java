package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnSeleniumBasics {
	public static void main(String[] args) {
		// To Get Driver for execution
		//	WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		// To open a chrome browser
		//	ChromeDriver driver = new ChromeDriver();
		//	FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		// To load an URL
		
		System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		
		
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");

		// To maximize the opened browser
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		driver.manage().window().maximize();

		// To close the browser
		driver.close();

	}
}
