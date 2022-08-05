

public class FactorialNumber {

	public static void main(String[] args) {
		int num=5;
		int factorialNum=1;
		for(int i=1; i<=num; i++) {
			factorialNum *= i;
		}
		System.out.println(factorialNum);
	}

}
