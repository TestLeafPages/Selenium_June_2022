package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	/**
	 * Set - Interface
Implementation classes of Set Interface
HashSet - Random Output
TreeSet - ASCII Ordered Output
LinkedHashSet - Maintains the insertion order

Set<generic> set = new Hashset<>();
Set<generic> set = new LinkedHashSet<>();
Set<generic> set = new TreeSet<>();

1. Set allows only Unique values
2. May / May not maintain the insertion order
based on the implementation class

Hashset is the fastest and efficient way to get data from set

HashSet: [Thomas, Ruba, Tamizh, Deepa, Deena, Mani, Abhi]
LHS:     [Ruba, Deena, Abhi, Thomas, Deepa, Mani, Tamizh]
TreeSet: [Abhi, Deena, Deepa, Mani, Ruba, Tamizh, Thomas]
set.get(0) -> Thomas or Ruba or Abhi

get() is not available in Set

If you want to add set -> list or list -> set or list -> list or
set -> set, add the collection in the constructor of another collection

	 * @param args
	 */
public static void main(String[] args) {
	Set<String> set = new TreeSet<>();
	set.add("Ruba");
	boolean mani1 = set.add("Mani");
	set.add("Deena");
	set.add("Abhi");
	set.add("Thomas");
	set.add("Deepa");
	boolean mani2 = set.add("Mani");
	set.add("Tamizh");
	System.out.println(set);
	System.out.println(mani1);
	System.out.println(mani2);
	
	for (String eachName : set) {
		System.out.println(eachName);
	}
	
//	List<String> list = new ArrayList<>(set);
	List<String> list = new ArrayList<>();
	list.addAll(set);
	System.out.println(list.get(0));
}
}
