
public class DevideString {
	static void devideString(String str, int n) {
		int STRING_SIZE = str.length();
		int PART_SIZE;
		if(STRING_SIZE % n != 0) {
			System.out.println("String is not devidable");
		}
		
		PART_SIZE = STRING_SIZE / n ;
		
		for(int i=0; i<STRING_SIZE; i++) {
			
			if(i % PART_SIZE == 0) {
				System.out.println("");
			}
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String []args) {
		String str = "sumansumanSuman";
		devideString(str, 3);
	}
}