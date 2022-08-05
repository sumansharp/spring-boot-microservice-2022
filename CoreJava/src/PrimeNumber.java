
public class PrimeNumber {
		public static boolean isPrimeNum(int n) {
			int num=n/2;
			boolean bool=true;
			for(int i=2; i<=num; i++) {
				if(n % i==0) {
					bool=false;
					}
			}
			return bool;
		}
	public static void main(String[] args) {
		int givennum=5;
		if(isPrimeNum(givennum)) {
			System.out.println(givennum+" is prime number");
		}else {
			System.out.println(givennum+" is not a prime number");
		}
		
}//END for main
}//End of Class