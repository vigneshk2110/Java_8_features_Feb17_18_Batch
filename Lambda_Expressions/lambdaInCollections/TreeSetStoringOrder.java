package lambdaInCollections;
import java.util.*;

public class TreeSetStoringOrder {
	public static void main(String[] args) {
		
//		TreeSet stores the object in a sorted form 
//		Order of storing can be defined by lambda Function
		
		TreeSet<Integer> h = new TreeSet<Integer>((o1, o2) -> 
		(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		h.add(850);
		h.add(235);
		h.add(1080);
		h.add(15);
		h.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + h);
		
		TreeSet<Integer> h1 = new TreeSet<>((s1, s2) ->
		(s1>s2) ? 1: (s1<s2)? -1 :0);
		h1.add(850);
		h1.add(235);
		h1.add(1080);
		h1.add(15);
		h1.add(5);
		System.out.println("Elements of the TreeSet after" + " sorting are: " + h1);
		
		
	}
}
