package predicateLearning;

import java.util.function.Predicate;

// Predicate Chaining with "and" Method
public class PredicateInterfaceExample4 {
	
	public static void main(String[] args) {
		Predicate<Integer> isAdult = age -> age >= 18;
		Predicate<Integer> notASeniorCitizen = age -> age < 60;
		
		Predicate<Integer> combinedPredicateForAge = isAdult.and(notASeniorCitizen);
        
		System.out.println(combinedPredicateForAge.test(25));
		System.out.println(combinedPredicateForAge.test(65));
		
		
		int []array = {10, 12, 14, 16, 19, 22, 24, 35, 47, 54, 61, 69, 78, 90};
		
		for (int i : array) {
			System.out.println(i + " --> " + combinedPredicateForAge.test(i));
		}
		
		System.out.println("----------------------"
				+ "----------------------------------------------------");
		
		Predicate<Integer> isMedium = size -> size > 10;
		Predicate<Integer> isLarge = size -> size > 20;
		
		Predicate<Integer> notSmallOnlyLarge = isMedium.and(isLarge);
		
		System.out.println(notSmallOnlyLarge.test(25));
		System.out.println(notSmallOnlyLarge.test(5));
		
		for (int i : array) {
			System.out.println(i + " --> " + notSmallOnlyLarge.test(i));
		}
		
		
	}

}
