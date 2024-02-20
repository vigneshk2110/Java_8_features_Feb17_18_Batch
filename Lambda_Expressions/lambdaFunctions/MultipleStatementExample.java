package lambdaFunctions;

public class MultipleStatementExample {
	public static void main(String[] args) {
		MultipleStatement ms = s ->{
			System.out.print("Hello, " + s + ". \n");
			System.out.println("Welcome to java,");
			System.out.println("Have a joyful learning!!! ");
		};
		
		ms.say("Rocky");
		ms.saying();
		MultipleStatement.telling();
	}

}
