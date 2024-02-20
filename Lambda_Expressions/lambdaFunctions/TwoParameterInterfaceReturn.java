package lambdaFunctions;

@FunctionalInterface
public interface TwoParameterInterfaceReturn {
	int age(int num , int num1);
	
	default void print() {
		System.out.println("default print method of TwoParameterInterfaceReturn");
	}
	
	static void print1() {
		System.out.println("Static print1 method of TwoParameterInterfaceReturn");
	}
}
