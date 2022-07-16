package LearnAttributes;

import org.testng.annotations.Test;

public class Attributes1 {

	
	@Test(invocationCount=4,threadPoolSize=2,invocationTimeOut=1000)
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("CreateLead");
		
	}
	@Test()
	public void deleteLead() {
		System.out.println("Delete Lead");
		
	}
	
	@Test(enabled=false)
	public void editLead() {
		System.out.println("Edit Lead");
		
	}
	@Test(priority=4)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
		
	}
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login");
	}
	
	
}
