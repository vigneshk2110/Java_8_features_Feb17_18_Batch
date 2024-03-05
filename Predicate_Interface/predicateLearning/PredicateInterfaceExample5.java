package predicateLearning;

import java.util.function.Predicate;

//Predicate Chaining with "or" Method
public class PredicateInterfaceExample5 {
	public static void main(String[] args) {
		Predicate<String> startsWithA = str -> str.startsWith("A");
		Predicate<String> endsWithZ = str -> str.endsWith("Z");
		Predicate<String> startsWithAOrEndsWithZ = startsWithA.or(endsWithZ);
		
		System.out.println(startsWithAOrEndsWithZ.test("AtoZ"));
		System.out.println(startsWithAOrEndsWithZ.test("ABCDE"));
		System.out.println(startsWithAOrEndsWithZ.test("B2B"));
		
		Predicate<Integer> isMedium = size -> size > 10;
		Predicate<Integer> isLarge = size -> size > 20;
		
		Predicate<Integer> notSmall = isMedium.or(isLarge);
		
		System.out.println(notSmall.test(25));
		System.out.println(notSmall.test(5));
		
		int []array = {10, 12, 14, 16, 19, 22, 24, 35, 47, 54, 61, 69, 78, 90};
		
		for (int i : array) {
			System.out.println(i + " --> " + notSmall.test(i));
		}
	}
}
