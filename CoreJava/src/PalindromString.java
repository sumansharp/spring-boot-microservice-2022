
public class PalindromString {

	public static void main(String[] args) {

		//String str= "MY name is Suman";
		String str= "Radar";
		String reverseStr="";
		for(int i=(str.length()-1); i>=0; --i) {
			reverseStr = reverseStr+(str.charAt(i));
		}
		
		System.out.println("Reverse String: "+reverseStr);
		System.out.print("Is this Palindrom String: ");
		if(str.toLowerCase().equals(reverseStr.toLowerCase())){
			System.out.println("yes");
		}else
		{
			System.out.println("No");
		}

	}


}
