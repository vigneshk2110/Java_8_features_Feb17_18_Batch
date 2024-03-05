package predicateLearning;

import java.util.function.Predicate;

// Predicate implementation with Method Referencing using another Static method
public class PredicateInterfaceExample3 {
	
	static boolean isEligible(int age) {
		return age>18;
	}
	
	public static void main(String[] args) {
		Predicate<Integer> predicate = PredicateInterfaceExample3::isEligible;
		
		boolean result = predicate.test(19);
		System.out.println(result);
		
		result = predicate.test(9);
		System.out.println(result);
		
		int []array = {10, 12, 14, 16, 19, 22, 24};
		
		for (int i : array) {
			result = predicate.test(i);
			System.out.println(i + " --> " + result);
		}
		
	}

}
