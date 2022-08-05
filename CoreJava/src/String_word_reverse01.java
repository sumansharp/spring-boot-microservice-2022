
public class String_word_reverse01 {

	public static void suman() {
		System.out.println("This is from Child Class");
	}
	
	public static void main(String[] args) {
		String st= "My name is suman";
		 String st1[]=split(st, ' ');
		 char temp;
		 for(String s: st1) {
			 int start=0, end=s.length()-1;
			 char ch[]=s.toCharArray();
			 while(start < end) {
				temp=ch[start];
				ch[start]=ch[end];
				ch[end] = temp;
				start++; end--;
				
			 }
			 System.out.print(String.valueOf(ch)+ " ");
		 }
		 
		}
	
	public static String[] split(String st, char splitBy) {
		String sb="";
		int count=0;
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)==splitBy) {
				count++;
				}
		}
		String st_01[]=new String[count+1];
		for(int i=0; i<st_01.length; i++) {
			st_01[i]="";
		}
		count=0;
		for(int i=0; i<st.length(); i++) {
			st_01[count] +=st.charAt(i);
			if(st.charAt(i)==splitBy) {
				count++;
				}
		}
		
		return st_01;
	}
}
