package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.manage().window().maximize();
	
	// Switching the context inside a frame
	WebElement frameElement = driver.findElement(By.xpath("(//iframe)[1]"));
	driver.switchTo().frame(frameElement);
	
	driver.findElement(By.id("Click")).click();
	
	// Switching the context from frame to main page
	driver.switchTo().defaultContent();
	
	
}
}
