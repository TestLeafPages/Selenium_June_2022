package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClickAndHold {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0); // passing index since only one frame in the page
		
		//Step1: locate the WebElement
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
			
		//Step2: create object for Actions class
		Actions builder = new Actions(driver);
		
		//Step3: Use appropriate method from Actions
		builder.clickAndHold(item1).moveToElement(item4).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
