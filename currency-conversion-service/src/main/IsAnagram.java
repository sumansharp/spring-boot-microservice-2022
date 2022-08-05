
public class IsAnagram {

	
	static boolean isAnagram(String str1, String str2) {
		 int str1_len = str1.length();
		 int str2_len = str2.length();
		 
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		 
		 if (str1_len != str2_len) return false;
		 
		 int char_freq[] = new int[26];
		 
		 for(int i=0; i<str1_len; i++) {
			 char curr_char = str1.charAt(i);
			 int index = curr_char - 'a';
			 char_freq[index]++;
		 }
		 
		 for(int i=0; i<str1_len; i++) {
			 char curr_char = str1.charAt(i);
			 int index = curr_char - 'a';
			 char_freq[index]--;
		 }
		 
		 for(int i=0; i<26; i++) {
			 
			 if(char_freq[i] != 0) {
				 return false;
			 }
		 }
		
		return true;
	}
	public static void main(String[] args) {
		String str1 = "CAB";
		String str2 = "DSA";
		
		boolean result= isAnagram(str1, str2);
		 System.out.print(result == true ? "It is anagram" : "It is not an Aanagram");

	}

}
