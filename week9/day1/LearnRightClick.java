package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//Step1: locate the WebElement
		WebElement eleMobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		//Step2: create object for Actions class
		Actions builder = new Actions(driver);
		
		//Step3: Use appropriate method from Actions
	//	builder.moveToElement(eleMobiles).contextClick().perform(); //perform() at the end of all actions is mandatory
		
		builder
		.contextClick(eleMobiles)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
