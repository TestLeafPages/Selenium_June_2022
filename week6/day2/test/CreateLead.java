package testcase;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setExcelfile() {
		filename="CreateLead";
	}
	
	
	@Test(dataProvider="fetchValues")
	public void runCreateLead(String Cname,String fname,String lname,String phno) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	
	/*
	 * String[][] values=new String[2][4];
	 * 
	 * values[0][0]="TestLeaf"; values[0][1]="Hari"; values[0][2]="R";
	 * values[0][3]="99";
	 * 
	 * values[1][0]="TestLeaf"; values[1][1]="Vidya"; values[1][2]="R";
	 * values[1][3]="909";
	 */	
	
	
	
}






