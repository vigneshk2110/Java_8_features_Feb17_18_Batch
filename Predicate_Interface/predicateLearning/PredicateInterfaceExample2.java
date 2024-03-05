package predicateLearning;

import java.util.function.Predicate;

//Implemented the test method of Predicate interface with Lambda functions

public class PredicateInterfaceExample2 {
	
	public static void main(String[] args) {
		Predicate<String> pr = s -> s.length()>=6;
		System.out.println(	pr.test("Vignesh"));
		System.out.println(	pr.test("Vicky"));
		
		String [] strArray = {"Hello", "hi", "Welcome", "MyDear"};
		
		for (String string : strArray) {
			System.out.println(string + " --> " +pr.test(string));
		}
		
	}
}
