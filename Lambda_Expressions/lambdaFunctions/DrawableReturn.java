package lambdaFunctions;


@FunctionalInterface
public interface DrawableReturn {
	
	String draw();
	
	default void shape() {
		System.out.println("I am inside default "
				+ "Shape Method of Drawable Return Interface");
	}
	
	static void shape1() {
		System.out.println("I am inside Static "
				+ "Shape1 Method Drawable Return Interface");
	}

}
