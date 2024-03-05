package predicateLearning;

import java.util.function.Predicate;


// Negating a Predicate by "negate" Method --> logically opposite Predicate.
public class PredicateInterfaceExample6 {
	public static void main(String[] args) {
		Predicate<Integer> ageGreaterThan18 = age -> age > 18;

//		logically opposite Predicate.
		System.out.println(ageGreaterThan18.negate().test(20));
		System.out.println(ageGreaterThan18.negate().test(13));
	
	}

}
