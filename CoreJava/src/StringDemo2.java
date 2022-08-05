import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class StringDemo2 {

	public static void main(String[] args) {
		
		Hashtable<Character,Integer> ht=new Hashtable<Character,Integer>();
		String st="My name is Suman";
		String str= st.toLowerCase();
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {	ht.put(str.charAt(i), 0);}
		Set<Character> keys= ht.keySet();
		
		for(char key:keys)
		{
			for(int i=0; i<str.length(); i++)
			{
				if(key==str.charAt(i)) {
			ht.put(key,ht.get(key)+1);
				}
			}
			}
			
		System.out.println(ht);
	}

}
