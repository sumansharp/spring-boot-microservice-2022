import java.util.ArrayList;
import java.util.List;

public class Reduce_StringReverse {

	public static void main(String[] args) {
		String st="Suman Kumar ";
		List<String> str=new ArrayList<String>();
		
		for(int i=0; i<st.length(); i++) {
			str.add(String.valueOf(st.charAt(i)));
			}
		//System.out.println(str);

		str.stream()
			.reduce((value,combinedValue)-> {return combinedValue+value;} )
			.stream().forEach(nm->System.out.println(nm));
		
	}

}
