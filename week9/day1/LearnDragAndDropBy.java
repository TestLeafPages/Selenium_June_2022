package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0); // passing index since only one frame in the page
		
		//Step1: locate the WebElement
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		Point location = item4.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		//Step2: create object for Actions class
		Actions builder = new Actions(driver);
		
		//Step3: Use appropriate method from Actions
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
