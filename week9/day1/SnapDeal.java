package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		
		//Step1: Locate the Men's fashion
		WebElement mensFashion = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		WebElement eleWishList = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre']"));
		
		builder.moveToElement(eleWishList).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		
		
		
		
		
		
		
		

	}

}
