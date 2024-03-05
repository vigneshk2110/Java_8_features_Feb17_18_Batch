package methodReferencing;

import java.util.*;

public class MethodReferencingExe4 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		
		System.out.println(numbers);
		
//		Collections.sort(numbers, (a, b) -> a.compareTo(b));
		
		Collections.sort(numbers, Integer::compareTo);
		
//		Collections.reverse(numbers);
		
		System.out.println(numbers);
	}
}