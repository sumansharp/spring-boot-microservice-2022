
public class String_Word_Count {

	public static void main(String[] args) {
		
			String st="suman is working for coming for manish is for coming on for";
			String st1="is";
			int count =0;
			if(st.contains(st1)) {
				count++;
			for(int i=0; i<st.length(); i++) {
				st=st.substring(st.indexOf(st1)+st1.length(), st.length());
				if(st.contains(st1)) {
					count++;
				}
				
			}
		}else {
			System.out.println("There is no "+st1+ " in given string");
		}
			
			System.out.println(count);
	}

}
