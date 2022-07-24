package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead  extends BaseClass{
	
	
			
	@When("Click on {string} link")
	public void clickHyperLink(String text) {
		driver.findElement(By.linkText(text)).click();

	}
	
	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {
		boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		if(displayed) {
			System.out.println(pageName+" is displayed");
		}
		else {
			System.out.println(pageName+" is not displayed");
		}	
			
		
		
		
	}

}













