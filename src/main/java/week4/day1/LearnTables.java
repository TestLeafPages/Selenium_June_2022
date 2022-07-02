package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTables {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	
	List<String> list = new ArrayList<String>();
	/*
	// Getting the table from the web page
	WebElement elementTable = driver.findElement(By.tagName("table"));
	// Getting the rows from the table
	List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
	// Iterating the rows from the table
	for (int i = 1; i < rows.size(); i++) {
		// From the iteration getting each row
		WebElement eachRow = rows.get(i);
		// From each row getting all the columns in it
		List<WebElement> cols = eachRow.findElements(By.tagName("td"));
		// Iterating cols to get data out of it
		for (int j = 0; j < cols.size(); j++) {
			list.add(cols.get(j).getText());
		}
	}
	System.out.println(list); */
	
	
	
	
	// Getting the table from the web page
		WebElement elementTable = driver.findElement(By.tagName("table"));
		// Getting the rows from the table
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		// Iterating the rows from the table
		for (int i = 1; i < rows.size(); i++) {
			// From the iteration getting each row
			WebElement eachRow = rows.get(i);
			// From each row getting all the columns in it
			List<WebElement> cols = eachRow.findElements(By.tagName("td"));
			System.out.println(cols.get(0).getText());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
