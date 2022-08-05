import java.util.Stack;
import java.util.ArrayList;

public class StringReverse01 {

	public static void main(String[] args) {
		Stack<Character> ch = new Stack<>();
		String name = "My name is Suman";
		for(int i=0; i<name.length(); i++) {
			//System.out.print(name.charAt(i));
			ch.push(name.charAt(i));
			}
		
		
		String st="";
		int j=ch.size();
		for(int i=0; i<j; i++){
			st=st+ch.pop();
			//st.add(ch.pop());
		}
		System.out.println("Reverse String: "+st);
		
		//====================================2nd way=====================
		
		String str = "You are very good guy";
		String reverseStr = "";
	    
	    for (int i = (str.length() - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	    System.out.println(reverseStr);
		
	}

}
