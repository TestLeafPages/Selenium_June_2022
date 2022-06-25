package week3.day1;

public class Land implements HousePlan{

	public void buildBedroom(String a) {
		// TODO Auto-generated method stub
		
	}

	public void buildMasterBedroom() {
		// TODO Auto-generated method stub
		
	}
	
	public void buildKennel() {
		
	}
	
	public static void main(String[] args) {
		Land obj = new Land();
		obj.buildBedroom("1");
		obj.buildKennel();
		obj.buildMasterBedroom();
		// Scope restriction of an object
		HousePlan obj1 = new Land();
		obj1.buildBedroom("1");
		obj1.buildMasterBedroom();
		obj1.buildKennel();
	}
	
	
	
	
	
	
	
	

}
