package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); // passing index since only one frame in the page
		
		//Step1: locate the WebElement
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		//Step2: create object for Actions class
		Actions builder = new Actions(driver);
		
		//Step3: Use appropriate method from Actions
		builder.dragAndDrop(source, target).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
