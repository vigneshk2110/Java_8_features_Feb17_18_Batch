package predicateLearning;

import java.util.function.Predicate;

//Implemented the test method of Predicate interface with a help of class

//Predicate in Java 8 combined with lambda expressions provide an intuitive 
//way of programming.
//You get a more readable code with Predicates that is easy to manage and maintain.

//Predicate interface is highly flexible for composing new predicates 
//using existing ones.

//Logical operations on Predicates like OR, NOT, AND & NOT can be done 
//using or, not, and & negate methods respectively.

//The isEqual method is used to generate a Predicate that checks for 
//equality with objects and values.

//Functionally filtering a collection using Predicates with streams is very easy.

//Easily add a lot of dynamic behaviour in less code.

public class PredicateInterfaceExample1 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t > 0;
	}

	public static void main(String[] args) {

		boolean ans = new PredicateInterfaceExample1().test(10);
		System.out.println(ans);

		ans = new PredicateInterfaceExample1().test(-10);
		System.out.println(ans);
	}

}
