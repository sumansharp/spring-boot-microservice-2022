import java.util.Arrays;

public class SecondSmallestArray{
	
	static void secondLargestNum(int[] num) {
		
		Arrays.sort(num);
		
		System.out.println("2nd Largest number is: " + num[num.length-2]);
		System.out.print("Largest number is : ");
		//if want to print Largest number
		 for(int i=num.length-1; i>=0; i--) {
			 System.out.print(num[i]);
		 }
	}
	
	public static void main(String []args) {
		
		int num[] = {23,34,21,76,87,11};
		int n=num.length;
		secondLargestNum(num);
	}
}