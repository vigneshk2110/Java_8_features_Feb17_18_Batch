package consumerInterface;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerExe1 implements Consumer<Integer[]> {

//	a function which takes in one argument and produces a result without returning anything;

	public static void main(String[] args) {
		
		Consumer<Integer[]> intArray = new ConsumerExe1();
		Integer[] exe = {10, 23, 34, 45};
		System.out.println(Arrays.toString(exe));
		intArray.accept(exe);
		System.out.println(Arrays.toString(exe));
	}

	@Override
	public void accept(Integer[] t) {
		
		for (int i = 0; i < t.length; i++) {
			t[i] = t[i] * 2;
		}

	}

}
