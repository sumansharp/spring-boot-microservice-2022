
public class String_RemoveDuplicate {

	public static void main(String[] args) {
		String st = "My name is suman kumar";
		System.out.print(removeDup(st));

	}
	
	public static StringBuilder removeDup(String st) {
		StringBuilder sb=new StringBuilder();
		char ch_arr[] =st.toCharArray();
		
		for(char ch: ch_arr ) {
			
			if(sb.indexOf(String.valueOf(ch)) == -1) {
				sb.append(ch);
			}
		}
		
		return sb;
	}

}