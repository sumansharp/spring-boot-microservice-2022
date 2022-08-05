package SerializationConcept;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Serialization01  {

	public static void main(String[] args) {
		try {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("suman.txt"));
		Student st=new Student();
		HashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		hm.put(21, "Manoj Negi");
		hm.put(22, "Suresh Kalga");
		hm.put(20, "suman Kumar");
		HashMap<Integer, String> hm1=st.getStudentMap(hm);
		//System.out.print(hm1);
		out.writeObject(hm1);
		out.flush();
		out.close();
		}catch(Exception e) {
			System.out.println("Exception occured");
		}

	}

}
