package predicateLearning;

import java.util.function.Predicate;
//isEqual, is used to check if an object is equal to another object 
//according to Object.equals(Object, Object)
public class PredicateInterfaceExample7 {
	public static void main(String[] args) {
		Predicate<String> testStringEquality = Predicate.isEqual("PI");

		System.out.println(testStringEquality.test("PIE"));
		System.out.println(testStringEquality.test("PI"));
	}
}
