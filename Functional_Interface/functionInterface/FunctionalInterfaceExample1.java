package functionInterface;

import java.util.function.Function;

// Implementing apply method with Lambda expression
public class FunctionalInterfaceExample1 {
		
	// Main driver method
    public static void main(String args[]){
        // Function which takes in a number
        // and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        // Applying the function to get the result
        System.out.println(half.apply(10));
        
    }
}
