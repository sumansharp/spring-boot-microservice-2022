
public class String_word_reverse {

	public static void suman() {
		System.out.println("This is from Child Class");
	}
	
	public static void main(String[] args) {
		String st= "My name is suman";
		String sb="";
		String sb1="";
		int stlength=0;
		for(int i=0; i<st.length(); i++) {
			
			sb +=st.charAt(i);
			if(st.charAt(i)==' ') {
					
					for(int j=sb.length()-1; j>=0; --j) {
					 sb1 +=sb.charAt(j);
					System.out.print(sb1+ " ");
					stlength =i;
					sb1="";
					}
					
				sb=""; 
			}
			
		}		
		 for(int k=st.length()-1; k>=stlength; --k ) { 
			   sb1 +=st.charAt(k); 
		 }
		  System.out.print(sb1);
		 
		}
	
	
}
