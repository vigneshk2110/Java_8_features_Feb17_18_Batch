package supplierInterface;

import java.util.Random;
import java.util.function.Supplier;

//Supplier is a functional interface that produces results without accepting any inputs. 
//The results produced each time can be the same or different. 

public class SupplierExample1 implements Supplier<Integer> {

// The interface contains one method, get.
	public Integer get() {

		return new Random().nextInt();
	}

	public static void main(String[] args) {

		SupplierExample1 se = new SupplierExample1();
		System.out.println(se.get());
	}

}
