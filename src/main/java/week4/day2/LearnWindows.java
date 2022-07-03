package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		String currentWindowID = driver.getWindowHandle();
		System.out.println("Current Window Handle:");
		System.out.println(currentWindowID);
		System.out.println("===================================================");
		driver.findElement(By.id("home")).click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All Window Handles:");
		System.out.println(allWindows);
		List<String> list = new ArrayList<>(allWindows);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switch from win 0 -> win 1");
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switch from win 1 -> win 0");
		driver.switchTo().window(currentWindowID);
		System.out.println(driver.getCurrentUrl());

		

		
		
		
		
		
		driver.quit();
	}
}
