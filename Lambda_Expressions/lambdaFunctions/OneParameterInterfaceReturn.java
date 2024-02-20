package lambdaFunctions;

@FunctionalInterface
public interface OneParameterInterfaceReturn {
	
	int age(int num);
	
	default void print() {
		System.out.println("default print method of OneParameterInterfaceReturn");
	}
	
	static void print1() {
		System.out.println("Static print1 method of OneParameterInterfaceReturn");
	}

}
