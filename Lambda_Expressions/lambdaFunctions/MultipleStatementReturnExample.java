package lambdaFunctions;

public class MultipleStatementReturnExample {
	public static void main(String[] args) {
		MultipleStatementReturn msr = s -> {
			 String msg = "Hello, " + s + ". \n"+
					 "Welcome to Java Training.\n" +
					 "Have a Joyful Learning!!!";
			 return msg;
		};
		
		System.out.println(msr.say("karthik"));
		msr.saying();
		MultipleStatementReturn.telling();
	}

}
