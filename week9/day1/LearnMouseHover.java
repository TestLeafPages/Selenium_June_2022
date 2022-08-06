package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		//Step1: locate the WebElement
		WebElement eleMen = driver.findElement(By.xpath("//a[text()='Men']"));
		
		//Step2: create object for Actions class
		Actions builder = new Actions(driver);
		
		//Step3: Use appropriate method from Actions
		builder.moveToElement(eleMen).perform(); //perform() at the end of all actions is mandatory
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
