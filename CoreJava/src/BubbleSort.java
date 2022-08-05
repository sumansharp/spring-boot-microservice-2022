// Java program for implementation of Bubble Sort
class BubbleSort {
	
	
	public static void main(String args[])
	{
		int arr[]= {30,23,45,67,43,12,3,2,90,81,102};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j+1] = arr[j]+arr[j+1];
					arr[j]= arr[j+1] -arr[j];
					arr[j+1]=arr[j+1]-arr[j];
				}
			}
		}
		for(int n: arr) {
			System.out.print(n+ ", ");
		}
		
	}
}
