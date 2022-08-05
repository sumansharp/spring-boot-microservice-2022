import java.util.Arrays;
import java.util.Collections;
public class Sorting_01 {

	public static void main(String[] args) {
		
	       Integer num[]= {20,12,24,54,45,67,89,9,5,4};
	       Arrays.sort(num);
	       System.out.println("After sort(Ascending): "+ Arrays.toString(num));
	       
	       Arrays.sort(num, Collections.reverseOrder());
	       System.out.println("After sort(Descending): "+ Arrays.toString(num));
	       
	       
	       String arr[] = { "Ganesh","suman","boy","Amit","Madhur" };
	       
	       Arrays.sort(arr);
	       System.out.println("After sort(Ascending): "+ Arrays.toString(arr));
	     
	       Arrays.sort(arr, Collections.reverseOrder());
	       System.out.println("After sort(Descending): "+ Arrays.toString(arr));
	    }
	}

