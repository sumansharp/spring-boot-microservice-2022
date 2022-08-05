package SerializationConcept;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
public class Serialization_1 {

	public static void main(String[] args) {
		Student st=new Student(201, "Suman");
		try {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("suman.txt"));
		out.writeObject(st);
		out.flush();
		out.close();
		
		}catch(Exception ex) {
			
		}

	}

}
