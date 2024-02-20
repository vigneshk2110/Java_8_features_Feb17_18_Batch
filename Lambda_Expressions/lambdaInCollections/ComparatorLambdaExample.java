package lambdaInCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorLambdaExample {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 300f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			
//			return p1.name.compareTo(p2.name);
			
//			if(p1.price < p2.price) {
//				return 1;
//			}
//			return -1;
			
			if(p1.id < p2.id) {
				return -1;
			}
			return 1;
			
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}
