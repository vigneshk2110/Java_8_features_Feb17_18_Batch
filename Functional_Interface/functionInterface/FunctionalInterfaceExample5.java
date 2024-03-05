package functionInterface;

import java.util.function.Function;

public class FunctionalInterfaceExample5 {
//	compose: Functions are applied from right to left. 
//	You call f1.compose(f2), which means:
//
//		Apply f2 to the input value.
//		Take the result of f2 and pass it as input to f1.
	public static void main(String[] args) {
		
		// Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
 
        // However treble the value given to half function
        half = half.compose(a -> 3 * a); // compose() -->  is a default method 
 
        // Applying the function to get the result
        System.out.println(half.apply(5));
        
	}
}
