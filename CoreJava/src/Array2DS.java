
public class Array2DS {
	static int hourglassSum(int[][] arr) {
		
		int row= arr.length;
		int cols = arr[0].length;
		int max_sum=0;
		
		for(int i=0; i <row - 2; i++) {
			for(int j=0; i<cols -2; j++) {
				
				int sum= (arr[i][j] + arr[i][j+1] +arr[i][j+2]) + (arr[i+1][j+1]) + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
			 max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
