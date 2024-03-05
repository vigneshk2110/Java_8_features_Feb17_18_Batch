package supplierInterface;

import java.util.function.Supplier;

public class SupplierExample2 {
//	Implementation using Lambda Functions
	public static void main(String[] args) {
		
		// This function returns a String.
		Supplier<String> sf = ()-> "String";
		// Print the String using get() 
		System.out.println(sf.get());
		
		// This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
        // Print the random value using get() 
        System.out.println(randomValue.get());
	}

}
