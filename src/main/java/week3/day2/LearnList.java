package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	/**
	 * Collection -> Interface
Collections -> Class

List -> Interface
ArrayList -> Implementation class

List<Generic> obj = new ArrayList<>();

()-> method
{} -> block
[] -> array
<> -> collections

Genere -> Can not be a primitive data type
int -> Integer
float -> Float
double -> Double
char -> Character
boolean -> Boolean
long -> Long
short -> Short
String


2 Properties of List
-> List allows duplicate values
-> Maintains the insertion order


	 * @param args
	 */
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Vishnu");
	list.add("Suraj");
	list.add("Priya");
	list.add("Thanga");
	list.add("Priya");
	list.add("Purush");
	list.add("Varada Rajan");
	
	list.add(1, "Karthik");
	list.set(0, "Charan");
	list.remove(5);
	System.out.println(list);
	int size = list.size();
	System.out.println("Size of the list "+size);
	for (int i = 0; i < list.size(); i++) {
		String string = list.get(i);
		System.out.println(string);
	}
	
	System.out.println("**********************");
	
	Collections.sort(list);
	
	for(String testleaf:list) {
		System.out.println(testleaf);
	}
	
	
	
	
	
	list.clear();
	list.isEmpty();
	boolean contains = list.contains("Charan");
	
	
	
	
	
	
	
	
}
}
