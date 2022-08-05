
public class String_number_removal {

	public static void main(String[] args) {
	
		String st= "suman5 is7 my8 name";
		char ch[]=st.toCharArray();
		int n=st.length();
		String mod_str="";
		for(int i=0; i<n; ++i) {
			if(!Character.isDigit(ch[i])) {
				mod_str = mod_str+ch[i];
			}
		}
		System.out.print(mod_str);

	}

}
