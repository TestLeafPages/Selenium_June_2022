package week3.day1;

public class MyAsserts {
public static void main(String[] args) {
	
	MyAsserts obj = new MyAsserts();
	
//	String[] array = {"Balaji","Vijay","Abhi",123,true,'A'};
	
	Object[] array = {123,-123,12.003,true,'A',"String"};
	GrandParent gp = new GrandParent();
	gp.adayarBunglow();
	
	Father father = new Father();
	father.benz();
	father.boatClubDuplex();
	father.adayarBunglow();
	
	ITGuys it = new ITGuys();
	it.apartment();
	
	it.benz();
	it.boatClubDuplex();
	
	it.adayarBunglow();
	
	gp.behaviour();
	father.behaviour();
	it.behaviour();
	
	
	
	
	
	
	
	
}
}
