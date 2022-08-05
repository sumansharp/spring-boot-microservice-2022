package SerializationConcept;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Deserialization {

	public static void main(String[] args) {
		try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("suman.txt"));
		
		HashMap<Integer, String> st=(HashMap<Integer, String>)in.readObject();
		
		st.forEach((key,value) ->{
			System.out.println("Roll: "+key+ " Name: "+value);
		});
//		for(Map.Entry<Integer, String> e: st.entrySet()) {
//			System.out.println("Roll: "+e.getKey()+ " Name: "+e.getValue());
//		}
		in.close();
		//System.out.println(in.readObject());
			
		
		}catch(Exception e) {
			
		}

	}

}
