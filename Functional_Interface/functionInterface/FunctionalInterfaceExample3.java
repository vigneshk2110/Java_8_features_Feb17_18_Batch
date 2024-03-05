package functionInterface;

import java.util.function.Function;

public class FunctionalInterfaceExample3 {
	
//	andThen: Functions are applied from left to right. 
//	You call f1.andThen(f2), which means:
//
//		Apply f1 to the input value.
//		Take the result of f1 and pass it as input to f2.
	
	public static void main(String[] args) {
		// Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
 
        // Now treble the output of half function
        half = half.andThen(a -> 3 * a); // andThen() --> is a default method
 
        // Applying the function to get the result
        // and printing on console
        System.out.println(half.apply(10));
	}
	
}
