

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String st="sumank isumanlfg";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<st.length(); i++) {
			if(st.indexOf(st.charAt(i))==st.lastIndexOf(st.charAt(i)) && st.charAt(i) !=' ') {
				sb.append(st.charAt(i));
			}
		}
		for(int i=0; i<1; i++) {
			System.out.println(sb);
			System.out.println(sb.charAt(i)+ " is first unique character");
			
		}

	}

}
