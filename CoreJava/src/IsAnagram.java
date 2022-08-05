

public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("Slientr", "Listeen"));
	}//END of Main function
	
	public static boolean isAnagram(String st, String st1) {
		
		st=st.toLowerCase(); st1=st1.toLowerCase();
		int count[]=new int[26];
		boolean bool=false;
		if(st.length()==st1.length()) {
			bool=true;
			for(int i=0; i<st.length(); i++) {
				int index=st.charAt(i) -'a';
				count[index]++;
				int index1=st1.charAt(i)-'a';
				count[index1]--;
			}
			for(int i=0; i<count.length; i++) {
				if(count[i] !=0) {
					bool=false;
					break;
				}
			}
		}else {
			bool=false;
		}
		return bool;
	}


}
