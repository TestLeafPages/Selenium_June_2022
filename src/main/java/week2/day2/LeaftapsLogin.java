package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsLogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	WebElement usernameElement = driver.findElement(By.id("username"));
	usernameElement.sendKeys("Demosalesmanager");
	
	WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
	passwordElement.sendKeys("crmsfa");
	
	WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	loginButton.click();
	
	WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
	crmsfaElement.click();
	
	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
	
	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();
	
	WebElement elementSourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
//	elementSourceDropDown.sendKeys("Employee");
	
	//Select class
	Select dd = new Select(elementSourceDropDown);
//	dd.selectByIndex(2);
//	dd.selectByVisibleText("Conference");
	dd.selectByValue("LEAD_CONFERENCE");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
