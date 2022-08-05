

public class NumberNotAvailable {

	public static void main(String[] args) {
		//Find the all numbers in rang of 1-10 which not available in given array {2,5,6}
		int num[]= {2,5,6};
		boolean bool=true;
		for(int i=0; i<=10; i++) {
			bool=true;
			for(int j=1; j<num.length; j++) {
				if(num[j]==i) {
					bool=false;
					
				}
				
			}if(bool) {System.out.print(i+" ");}
		}

	}

}
