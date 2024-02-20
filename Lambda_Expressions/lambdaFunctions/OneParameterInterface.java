package lambdaFunctions;


@FunctionalInterface
public interface OneParameterInterface {
	
	void age(int num);
	
	default void print() {
		System.out.println("default print method of OneParameterInterface");
	}
	
	static void print1() {
		System.out.println("Static print1 method of OneParameterInterface");
	}

}
