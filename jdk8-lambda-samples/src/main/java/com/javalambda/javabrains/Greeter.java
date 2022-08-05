package com.javalambda.javabrains;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreetings helloworldgreeting=new HelloWorldGreetings();
		greeter.greet(helloworldgreeting);
		//or
		helloworldgreeting.perform();
		//or below Lambda expression:
		String s = "From Lambda expression";
		Greeting myLambdaFuntion =() -> System.out.println(s);
		myLambdaFuntion.perform();
		
		//or Anonymous class
		Greeting inner= new Greeting(){
			
			public void greetingfrominner() {
				System.out.println("Comming from Inner Greeting class One!");
			}
			public void perform() {
				System.out.println("Comming from Inner Greeting class Two!");
			}
		};
		
		greeter.greet(inner);
		
		
		
		

	}

}



