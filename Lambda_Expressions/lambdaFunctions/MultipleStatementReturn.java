package lambdaFunctions;

@FunctionalInterface
public interface MultipleStatementReturn {
	
	String say(String message);
	
	default void saying() {
		System.out.println("Default method of Sayable Interface");
	}
	
	static void telling() {
		System.out.println("Static method of Sayable Interface");
	}

}
