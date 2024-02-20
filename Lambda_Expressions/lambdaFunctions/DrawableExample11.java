package lambdaFunctions;

public class DrawableExample11 {
	
	public static void main(String[] args) {
		
		Drawable d1 = () -> 	System.out.println("I am implemented by "
							+ "functional interface without "
							+ "the need of implementing class");
				
			
		
		d1.draw(); // Implemented using Functional Interface
		d1.shape(); // Default method
		Drawable.shape1();
		
	}

}
