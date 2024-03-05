package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3Creation {
	public static void main(String[] args) {

//		Filter & 

		Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("c"));
//		FindAny()
		Optional<String> anyElement = stream.findAny();
		System.out.println(anyElement);

//				FindFirst()

		List<String> elements = Stream.of("a", "b", "c").filter(element -> element.contains("b"))
				.collect(Collectors.toList());
		Optional<String> anyElement1 = elements.stream().findAny();
		System.out.println(anyElement1);
		Optional<String> firstElement = elements.stream().findFirst();
		System.out.println(firstElement);

//			Stream Pipeline
		Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);
		onceModifiedStream.forEach(s -> System.out.println(s));
		
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		long size = list.stream().skip(1)
		  .map(element -> element.substring(0, 3)).sorted().count();
		
		System.out.println(size);
		
//		The correct and most convenient way to use streams is by a stream pipeline, which is 
//		a chain of the stream source, intermediate operations, and a terminal operation:
	}
}
