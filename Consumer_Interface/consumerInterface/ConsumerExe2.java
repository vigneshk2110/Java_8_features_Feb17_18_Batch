package consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExe2 {
//	 Accept
	public static void main(String[] args) {
		Consumer<Integer> display = n -> System.out.println(n);
		
		display.accept(10);
		
		List<Integer> listexe = Arrays.asList(10, 20, 30);
		
		listexe.forEach(display);
		
		Consumer<List<Integer>> modifyList = list ->{
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * 3);
			}
		};
		
		modifyList.accept(listexe);
		
		listexe.forEach(display);
		
	}
}
