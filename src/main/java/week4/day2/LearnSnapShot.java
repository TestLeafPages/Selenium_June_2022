package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapShot {
public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Element Screen shot
//		WebElement element = driver.findElement(By.tagName("img"));
		WebElement element = driver.findElement(By.xpath("//section[@class='innerblock123']"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/IMG003.png");
		FileUtils.copyFile(source, dest);
		
		/*
		// Full page screen shot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/IMG001.png");
		FileUtils.copyFile(source, dest);
		*/
}
}
