package lambdaFunctions;

public class OneParameterLambdaExpresionExample {
	public static void main(String[] args) {
		OneParameterInterfaceReturn opi = (n) -> n*2;
		int result = opi.age(10);
		System.out.println(result);
		
		opi.print();
		OneParameterInterfaceReturn.print1();
	}

}
