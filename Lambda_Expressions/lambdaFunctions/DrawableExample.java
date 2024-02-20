package lambdaFunctions;

public class DrawableExample {
	
	public static void main(String[] args) {
		
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("I am implemented by functional interface without "
						+ "the need of implementing class");
				
			}
		};
		
		d.draw(); // Implemented using Functional Interface
		d.shape(); // Default method
		Drawable.shape1();
		
	}

}

