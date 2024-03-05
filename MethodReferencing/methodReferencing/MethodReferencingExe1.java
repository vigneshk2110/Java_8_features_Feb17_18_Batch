package methodReferencing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MethodReferencingExe1 {
//	Method references are a special type of lambda expressions. 
//	They’re often used to create simple lambda expressions by referencing existing methods.
//
//	There are four kinds of method references:
//
//	Static methods
//	Instance methods of particular objects
//	Instance methods of an arbitrary object of a particular type
//	Constructor
	
//	Reference to a Static Method
	public static void main(String[] args) {
		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		
		System.out.println(messages.get(0));
		System.out.println(capitalize(messages.get(0)));
		
		System.out.println(messages);
		
//		for (String string : messages) {
//			capitalize(string);
//		}
		
		for (int i = 0; i < messages.size(); i++) {
			messages.set(i, capitalize(messages.get(i)));
		}
//		messages.forEach(MethodReferencingExe1::capitalize);
		System.out.println(messages);
		
	}
	
	public static String capitalize(String s) {
		
		if(s.charAt(0) >=97 && s.charAt(0) <=122) {
			char replaced = (char) (s.charAt(0)-32);		
			return replaced +"" + s.substring(1);
		}
		
		return s;
		
		
	}
}
