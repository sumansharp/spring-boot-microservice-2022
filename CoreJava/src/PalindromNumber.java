
public class PalindromNumber {

	public static void main(String[] args) {
		int num=2662;
		int Originalnum = num;
		int reverseNum=0;
		int remainder;
		while(num !=0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num /= 10;
		}
		if(Originalnum == reverseNum) {
			System.out.println(Originalnum +" is palindrom.");
		}else {
			System.out.println(Originalnum +" is not palindrom.");
		}
	}

}
