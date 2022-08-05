
public class String_Remove_Consecutive_Char {

	public static void main(String[] args) {
		String st="sSssumm iiiis nott baad";
		st =st.toLowerCase();
		
		char ch[]=st.toCharArray();
		String mod_str=Character.toString(ch[0]);
		for(int i=1; i<=st.length()-1; i++) {
			
			if(!(ch[i-1] == ch[i])) {
				mod_str=mod_str+ch[i];
			}
			
		}
		System.out.print(mod_str);
	}

	

}
