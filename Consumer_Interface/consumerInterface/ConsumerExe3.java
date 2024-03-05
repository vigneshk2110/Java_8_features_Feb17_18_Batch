package consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExe3 {
//	 accept & andThen
	
	public static void main(String[] args) {
		Consumer<List<Integer>> display = list -> System.out.println(list);


		List<Integer> listexe = Arrays.asList(10, 20, 30);


		Consumer<List<Integer>> modifyList = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * 3);
			}
		};
		
		modifyList.andThen(display).accept(listexe);

		
	}
}
