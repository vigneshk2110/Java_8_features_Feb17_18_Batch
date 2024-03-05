package methodReferencing;

import java.util.*;

public class MethodReferencingExe2 {
//	Instance methods of particular objects

	public static void main(String[] args) {
		// Creating an empty ArrayList of user-defined type
        // List of person
        List<Person> personList = new ArrayList<>();
 
        // Adding elements to above List
        // using add() method
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
 
        // Using static method reference to
        // sort array by name
        Collections.sort(personList, MethodReferencingExe2::compareByName);
 
        // Display message only
        System.out.println("Sort by name :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
 
        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, MethodReferencingExe2::compareByAge);
 
        // Display message only
        System.out.println("Sort by age :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
		
	}
	
	// Method 1
    // Static method to compare with name
    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }
 
    // Method 2
    // Static method to compare with age
    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }
		
}

class Person {
	 
    private String name;
    private Integer age;
 
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Getter
    public Integer getAge() { return age; }
    public String getName() { return name; }
}
