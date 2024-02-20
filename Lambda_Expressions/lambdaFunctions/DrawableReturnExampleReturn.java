package lambdaFunctions;

public class DrawableReturnExampleReturn {
	
	public static void main(String[] args) {
//		Return statement is implicit in the below notation
		DrawableReturn d = ()->"I am returned by functional interface without "
						+ "the need of implementing class";
				
	
		String result = d.draw(); // Implemented using Functional Interface
		System.out.println(result);
		d.shape(); // Default method
		DrawableReturn.shape1();
		
	}

}

