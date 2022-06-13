package week1.day2;

import java.util.Arrays;

public class LearnArrays {
public static void main(String[] args) {
	int[] ages = {18,19,20,21,22};
	int length = ages.length;
	System.out.println(length);
	for(int i = 0; i < length;i++) {
	System.out.println(ages[i]);
	}
	
	
	int[] ages1 = new int[5];
	ages1[0] = 54;
	ages1[1] = 33;
	ages1[2] = 65;
	ages1[3] = 54;
	ages1[4] = 20;
	System.out.println("---------------------------------");
	for(int i = 0; i < ages1.length;i++) {
		System.out.println(ages1[i]);
		}
		
	Arrays.sort(ages1);
	System.out.println("---------------------------------");

	for(int i = 0; i < ages1.length;i++) {
		System.out.println(ages1[i]);
		}
		System.out.println(ages1[5]);
	
}
}
