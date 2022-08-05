import java.util.Scanner;

public class ArrayManupulation {
	
	static long arrayManipulation(int n, int[][] queries) {
		
		long outputArray[] = new long[n+2];
		for(int i = 0; i<queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			outputArray[a] += k;
			outputArray[b+1] -= k;
		}
		long max = getMax(outputArray);
		return max;
	}

	private static long getMax(long[] inputArray) {
		long max = Long.MIN_VALUE;
		long sum = 0 ; 
		for(int i=0; i< inputArray.length; i++) {
			 sum +=inputArray[i];
			 max = Math.max(max, sum);
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int queries[][] = new int[m][3];
		
		for(int i=0; i < m; i++) {
			queries[i][0] = sc.nextInt();
			queries[i][1] = sc.nextInt();
			queries[i][2] = sc.nextInt();
		}
		long max = arrayManipulation(n, queries);
		System.out.println(max);
		
		

	}

}
