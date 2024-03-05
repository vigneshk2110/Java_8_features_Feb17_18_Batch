package streamAPI;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.*;

public class Stream2Creation {
	public static void main(String[] args) {
		
//		Creating infinite Stream		
		
		
//		generate() --> The generate() method accepts a Supplier<T> for element generation.
//		Create an infinite stream --> has to be arrested by limit method
//		Stream<String> streamGenerated =
//				  Stream.generate(() -> "New Element").limit(10);
//		streamGenerated.forEach(s -> System.out.println(s));
		
//		Stream.iterate()
//		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
//		The first element of the resulting stream is the first parameter of the iterate() method. When creating every following element, the specified function is applied to the previous element. 
//		In the example above the second element will be 42.
//		streamIterated.forEach(s -> System.out.println(s));
		
//		Primitive Stream
//		range(int startInclusive, int endExclusive) 
		IntStream intStream = IntStream.range(1, 3);
		intStream.forEach(s -> System.out.println(s));
		
//		rangeClosed(int startInclusive, int endInclusive) 
		LongStream longStream = LongStream.rangeClosed(1, 3);
		longStream.forEach(s -> System.out.println(s));
		
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(30);
		doubleStream.forEach(s -> System.out.println(s * 100));		
		
	}
}
