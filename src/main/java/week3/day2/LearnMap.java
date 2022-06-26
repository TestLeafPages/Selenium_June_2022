package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	/**
	 * 
Map - 2 Dimensional Collection
Key , Value
Map - Interface

HashMap - Random
TreeMap - ASCII
LinkedHashMap - Maintain the insertion order
Key -> Ordering is based on Key
Key -> unique
value -> Duplicate


Each Key,value pair is called as Entry
All the entries in the map is unique
Map contains Set<Entry>
	 * @param args
	 */
public static void main(String[] args) {
	// Store Employee ID and Employee Name
	Map<Integer, String> map = new HashMap<>();
	map.put(600564, "Logeshwari");
	map.put(632405, "Chandrababu");
	map.put(620002, "Balaji");
	map.put(620005, "Abhi");
	map.put(600044, "Priya");
	map.put(600091, "Aravind");
	map.put(620002, "Raja");
	map.put(600001, "Priya");
	System.out.println(map);
	String string = map.get(600001);
	System.out.println(string);
	
	Set<Integer> keySet = map.keySet();
	for (Integer eachKey : keySet) {
		System.out.println(eachKey+"->"+map.get(eachKey));
	}
	map.values();
	
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	
	for(Entry<Integer, String> eachEntry:entrySet) {
		System.out.println(eachEntry.getKey() +"->"+eachEntry.getValue());
	}
	
	boolean containsKey = map.containsKey(600001);
	boolean containsValue = map.containsValue("Priya");
	
	map.remove(600001);
	map.clear();
	map.isEmpty();
	
	
}
}
