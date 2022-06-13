package week1.day2;

public class LearnMethods {
// accessmodifier returnType methodName(args){content of the method}
// No return value is there -> void
// If you have a returnType decided -> anything as areturntype
// methodName -> start with lower case and continue with camel case
// args -> arguments - parameters - input to method

	public static void main(String[] args) {
		// Syntax to create object for a class
		// ClassName object = new ClassName();
		LearnMethods obj = new LearnMethods();
		obj.printMyName();
		int vehicleNumber = obj.getVehicleNumber();
		System.out.println(vehicleNumber);
		System.out.println(obj.getVehicleNumber());
		String vehicleColor = obj.getVehicleColor();
		System.out.println(vehicleColor);
		int sum = obj.addTwoNumbers(5,6);
		System.out.println(sum);
	}
	public void printMyName() {
		System.out.println("Testleaf");
	}
	
	private int getVehicleNumber() {
		int number = 2818;
		return number;
	}
	
	String getVehicleColor() {
		String color = "Silver Grey";
		return color;
	}
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}
	public double subTwoNumbers(double a, double b) {
		return a-b;
	}
	
	
	
	
	
	
	
}
