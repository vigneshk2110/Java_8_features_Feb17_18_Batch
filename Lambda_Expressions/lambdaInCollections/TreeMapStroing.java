package lambdaInCollections;

import java.util.*;

public class TreeMapStroing {
	public static void main(String[] args) {
		
//		TreeMap stores the object in a sorted form of their key 
//		Order of storing can be defined by lambda Function
		
		TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> 
		(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		m.put(1, "Apple");
		m.put(4, "Mango");
		m.put(5, "Orange");
		m.put(2, "Banana");
		m.put(3, "Grapes");
		System.out.println("Elements of the TreeMap " + 
		"after sorting are : " + m);
	}
}
