package week1.day2;

public class LearnAccessModifer {
public static void main(String[] args) {
	LearnMethods obj = new LearnMethods();
	obj.printMyName();
//	obj.getVehicleNumber();
	String vehicleColor = obj.getVehicleColor();
	System.out.println(vehicleColor);
}
}
