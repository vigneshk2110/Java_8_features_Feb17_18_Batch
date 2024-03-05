package streamAPI;

import java.util.*;
import java.util.stream.Stream;

public class Stream1Creation {
	
//		uses of Stream in Java are mentioned below:
//
//		Stream API is a way to express and process collections of objects.
//		Enable us to perform operations like filtering, mapping,reducing and sorting.
	
	public static void main(String[] args) {
		
//		Empty Stream	
//		use of the empty() method upon creation is 
//		to avoid returning null for streams with no element
		
		Stream<Integer> intStream = Stream.empty();
		intStream.forEach(i -> System.out.println(Math.pow(i, 2)));
		
		
//		Stream with List or Any Collection
		String[] charStrArray = {"a", "b", "c"};
		List<String> strList = Arrays.asList(charStrArray);
		Stream<String> streamStr = strList.stream();
		streamStr.forEach(s -> System.out.println(s));
		
//		AnotherWay  --> streamOf()
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(s -> System.out.println(s));
		
//		Stream of Array
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(s -> System.out.println(s));
		
//		Part of Array as a Stream object
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(s -> System.out.println(s));
		
//		Stream.builder()  --> Can add any no of object to the Stream
		Stream<String> streamBuilder =
				  Stream.<String>builder().add("a").add("b").add("c").build();
		streamBuilder.forEach(s -> System.out.println(s));
		
//		for (int j = 0; j < 10; j++) {
//			int randomNum = (int)(Math.random() * 100);
//			System.out.println(randomNum);
//		}
		
		Stream<Integer> streamBuilderInt =
				  Stream.<Integer>builder().add((int)(Math.random() * 100)).add((int)(Math.random() * 100)).add((int)(Math.random() * 100)).build();
		streamBuilderInt.forEach(s -> System.out.println(s));
	}
}
