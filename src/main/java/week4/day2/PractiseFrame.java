package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	
	// Switching the context inside a frame
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//li[text()='Item 3']")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Download")).click();
	
	
	
	
}
}
