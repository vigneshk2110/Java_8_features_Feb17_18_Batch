package lambdaFunctions;

@FunctionalInterface
public interface TwoParameterInterface {
	void age(int num , int num1);
	
	default void print() {
		System.out.println("default print method of TwoParameterInterface");
	}
	
	static void print1() {
		System.out.println("Static print1 method of TwoParameterInterface");
	}
}
