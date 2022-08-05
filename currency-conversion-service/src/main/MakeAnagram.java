

public class MakeAnagram {
	
	static int delForAnagram(String a, String b) {
		int min_del =0 ;
		
		int a_char_freq[] = new int[26];
		int b_char_freq[] = new int[26];
		
		for(int i=0; i<a.length(); i++) {
			char curr_char = a.charAt(i);
			int char_to_int = (int)curr_char;
			int position = char_to_int - (int)'a';
			a_char_freq[position]++;
		}
		for(int i=0; i<b.length(); i++) {
			char curr_char = b.charAt(i);
			int char_to_int = (int)curr_char;
			int position = char_to_int - (int)'a';
			b_char_freq[position]++;
		}
		
		for(int i=0;  i<26; i++) {
			
			int difference = Math.abs(a_char_freq[i] - b_char_freq[i]);
			 min_del +=difference;
		}
		
		return min_del;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
