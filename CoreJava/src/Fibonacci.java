 
public class Fibonacci{
	
	
	public static void main(String []args) {
		
		int n=10, t1=0, t2=1;
		System.out.println("Fibonacci for "+n+" : ");
		for(int i=0; i<n; ++i) {
			System.out.print(t1+ "+");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			
		}
		
	}
}