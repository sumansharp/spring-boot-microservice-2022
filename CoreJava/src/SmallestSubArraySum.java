public class SmallestSubArraySum{
	
	static int getSmallestArraySum(int[] arr, int x){
		int n =arr.length;
		int min_len= n+1;
		for(int start=0; start<n; start++) {
			int curr_sum=arr[start];
			if(curr_sum >x) {
				return 1;
			}
			for(int end=start+1; end<n; end++) {
				curr_sum +=arr[end];
				if(curr_sum >x && (end -start+1)<min_len) {
					min_len =end-start+1;
				}
			}
		}
		return min_len;
	}
	public static void main(String []args) {
		int arr[]= {30,21,22,11};
		int x = 59;
		int sum = getSmallestArraySum(arr, x);
		if(sum == arr.length+1) {
			System.out.print("Not Possible");
		}else {
			System.out.println("Smallest Sub Array sum: "+sum);
		}
	}
}