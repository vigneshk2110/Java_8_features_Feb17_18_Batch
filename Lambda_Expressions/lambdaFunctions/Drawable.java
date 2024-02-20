package lambdaFunctions;


@FunctionalInterface
interface Drawable{
	
	void draw();
	
	default void shape() {
		System.out.println("I am inside default Shape Method");
	}
	
	static void shape1() {
		System.out.println("I am inside Static Shape1 Method");
	}
}
