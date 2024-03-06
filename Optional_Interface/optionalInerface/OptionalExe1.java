package optionalInerface;

import java.util.Optional;

public class OptionalExe1 {
	
	// Driver code
    public static void main(String[] args)
    {
 
        // creating a string array
        String[] str = new String[5];
 
        // Setting value for 2nd index
        str[3] = "Classes are coming soon";
 
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[3]);
        System.out.println(value);
    }
}
