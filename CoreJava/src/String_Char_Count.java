
public class String_Char_Count {

	public static void main(String[] args) {
		int count[]= new int[256];
		String st= "My name is suman kumar";
		for(int i=0; i<st.length(); i++) { count[st.charAt(i)]++;}
		
		char ch[]=new char[st.length()];
		for(int i=0; i<st.length(); i++) {
			ch[i]=st.charAt(i);
			int searchChar=0;
			
			for(int j=0; j<=i; j++) {
				if(st.charAt(i)==ch[j]) {
					searchChar++;
				}
			}
			if(searchChar==1) {
				System.out.println("Number of "+st.charAt(i)+ " is : "+ count[st.charAt(i)]);
			}
		}

	}

}
