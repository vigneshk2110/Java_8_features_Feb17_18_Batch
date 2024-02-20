package lambdaFunctions;

public class OneParameterInterfaceExample {
	public static void main(String[] args) {
		OneParameterInterface opi = n-> System.out.println(n);
		
		opi.age(25);
		opi.print();
		OneParameterInterface.print1();
	}
}
