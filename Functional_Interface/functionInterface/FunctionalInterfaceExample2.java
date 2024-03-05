package functionInterface;

import java.util.function.*;

// Implementing using Anonymous inner class

public class FunctionalInterfaceExample2 {
	public static void main(String[] args) {
		Function<Integer, String> innerClass = new Function<Integer, String>(){
			  public String apply(Integer t) {
			    return Integer.toString(t*t);
			  }
			};
			System.out.println(innerClass.apply(3));
	}
}
