
public class DuplicateChar{
	static int count[]=new int[256];
	static void allocateArray(String str) {
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
			}
	}
	static void printDuplicateChar(String str) {
		 allocateArray(str);
		for(int i=0; i<256; i++) {
			
			if(count[i] >1) {
				System.out.printf("%c, count= %d\n",i,count[i]);
			}
		}
	}
	public static void main(String []args) {
		
		String str= "Sujjiss";
		printDuplicateChar(str);
	}
}