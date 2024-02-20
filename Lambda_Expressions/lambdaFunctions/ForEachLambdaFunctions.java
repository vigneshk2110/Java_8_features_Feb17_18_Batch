package lambdaFunctions;

import java.util.*;

public class ForEachLambdaFunctions {
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		arrayList.add("6");
		arrayList.add("7");
		arrayList.add("8");
		arrayList.add("9");
		arrayList.add("10");
		
//		arrayList.forEach(str -> 
//		System.out.println(Integer.valueOf(str) + 10));
		
		
		Integer [] arr = {1,2,3,4,5};
		
		List<Integer> numList = Arrays.asList(arr);
		numList.forEach(n -> System.out.println((int)Math.pow(n, 2)));
		
	}

}
