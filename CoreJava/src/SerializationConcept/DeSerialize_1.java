package SerializationConcept;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerialize_1 {

	public static void main(String[] args) {
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream("suman.txt"));
			
			Student st=(Student)in.readObject();
			
			System.out.print("Roll: "+st.roll+" Name: "+st.name);
			
		}catch(Exception ex) {
			
		}
		
	}

}
