
public class String_Spl_Char_removal {

	public static void main(String[] args) {
		String st= " ^My%name$is 5suman6 kumar";
		st = st.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(st);

	}

}
