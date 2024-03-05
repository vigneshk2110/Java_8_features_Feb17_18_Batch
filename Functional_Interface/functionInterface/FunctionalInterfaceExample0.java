package functionInterface;

import java.util.function.Function;

//a function which takes in one argument and produces a result. 
//Hence this functional interface takes in 2 generics namely as follows:
//  R apply(T t)
//	T: denotes the type of the input argument
//	R: denotes the return type of the function

//The Function interface consists of the following 4 methods 
//as listed which are later discussed as follows:
//
//	apply()
//	andThen()
//	compose()
//	identity()

// Implementing the Function interface with a class and 
//giving an implementation for the apply method

public class FunctionalInterfaceExample0 implements Function<Integer, String>{

	@Override
	public String apply(Integer t) {		
		return String.valueOf(t*t);
	}
	
	public static void main(String[] args) {
		Function<Integer, String> fun = new FunctionalInterfaceExample0();
		String result = fun.apply(154);
		
		System.out.println(result);
	}
	
}
