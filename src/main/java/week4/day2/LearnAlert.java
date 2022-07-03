package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	
	
	
	// Handling the alert - Switch the context from the web page to alert
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	
	alert.sendKeys("IIT");
	Thread.sleep(2000);
	alert.accept();
	
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
