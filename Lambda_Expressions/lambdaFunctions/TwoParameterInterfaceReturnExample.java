package lambdaFunctions;

public class TwoParameterInterfaceReturnExample {
	public static void main(String[] args) {
		TwoParameterInterfaceReturn tpir = (n, m) -> m+n;
		
		System.out.println(tpir.age(10,23));
		tpir.print();
		TwoParameterInterfaceReturn.print1();
	}
}
