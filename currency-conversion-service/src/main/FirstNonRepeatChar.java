import java.util.Arrays;

public class FirstNonRepeatChar{
	
	static int NO_OF_CHAR=256;
	static char count[] = new char[NO_OF_CHAR];
	 
	static void putCharInArray(String str) {
		
		for(int i=0; i<str.length(); i++) {
			
			count[str.charAt(i)]++;
			
				
		}
	}
	
	static int getIndexFirstNonRepeatChar(String str){
		putCharInArray(str);
		int index=-1;
		
		for(int i=0; i<str.length(); i++) {
			
			if(count[str.charAt(i)]== 1) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	
	public static void main(String []args) {
		String str="SumanjikaS";
		int index= getIndexFirstNonRepeatChar(str);
		
		System.out.println(index==-1 ? "Either String is blanck or all char are repeating" : "First Non repeating char is:" + str.charAt(index));
		
	}
}