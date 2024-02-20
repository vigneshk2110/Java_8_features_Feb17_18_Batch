package lambdaFunctions;

public class TwoParameterInterfaceExample {
	public static void main(String[] args) {
		TwoParameterInterface tpi = (n,m) -> System.out.println(n+m);
		
		tpi.age(10, 20);
		tpi.print();
		TwoParameterInterface.print1();
	}
}
