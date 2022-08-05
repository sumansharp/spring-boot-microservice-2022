import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
public class ArmStrongNumberExample {
	  
	static List<Integer> getArmStr(int ar){
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0; i<=ar; i++) {
		int temp=0, last=0, digits=0, sum=0;
		
		temp=i;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=i;
		while(temp>0) {
			last= temp % 10;
			sum += Math.pow(last, digits);
			temp /=10;
		}
		if(i==sum) {
			arr.add(i);
		}
		}
		return arr;
	}
	public static void main(String[] args) {
		int num =1000000;
		System.out.print("ArmStrong no :"+getArmStr(num));

	}
	
}