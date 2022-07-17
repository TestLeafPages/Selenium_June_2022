package LearnAttributes;

import org.testng.annotations.Test;

public class Learndependencies {

	@Test
	public void testB() throws Exception {
		System.out.println("Create Lead");
		
	}
	
	@Test(dependsOnMethods= {"testB"})
	public void testA() {
		System.out.println("EditLead");
	}
	//packagename.classname.methodname
	@Test(dependsOnMethods= {"LearnAttributes.Attributes1.login","testB"},alwaysRun=true)
	public void testC() {
		System.out.println("Delete Lead");
	}
	
}
