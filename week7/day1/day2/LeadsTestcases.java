package week7.day2;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

public class LeadsTestcases {
	
	//belongs to smoke
	@Test(groups = "smoke")
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();
	}
	
	@Test(groups = {"functional","regression"}, dependsOnGroups = "smoke")
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
	
	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	
	@Test(groups = "regression", dependsOnGroups = "smoke")
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
	
	@Test(groups = "smoke")
	public void deleteLead() {
		System.out.println("Delete Lead");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
