

import java.util.SortedSet;
import java.util.TreeSet;

//								Printing Duplicate character in given string.
//								==============================================
public class String_Duplicate_Char {

	public static void main(String[] args) {
		String st="suman is my name";
		SortedSet<String> sb=new TreeSet<String>();
		for(int i=0; i<st.length(); i++) {
			if(!(st.indexOf(st.charAt(i))==st.lastIndexOf(st.charAt(i)))) {
				
				sb.add(String.valueOf(st.charAt(i)));
			}
		}
		System.out.println(sb);

	}

}
