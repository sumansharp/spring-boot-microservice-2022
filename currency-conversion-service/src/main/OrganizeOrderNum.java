import java.util.*;

public class OrganizeOrderNum {
	
	static int[] getOrganizedValue(int[] num,int[] op) {
		int index[] = new int[num.length];
		int n =num.length;
		Arrays.sort(num);
		
		int i=0, j=n-1, k=0;
		while(i<=j && k<=n-2) {
			
			if(op[i]=='<') {
				index[k] =num[i++];
			}else {
				index[k] = num[j--];
			}
			k++;
		}
		
		index[n-1]=num[i];
		return index;
		
	}
	
	public static void main(String []args) {
		int num[] = {5,3,7,8,9,0};
		int  op[] = {'<','>','<','>','<'};
		int result[]=getOrganizedValue(num,op);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			
		}
	}
}
