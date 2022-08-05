package SerializationConcept;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student implements Serializable{
	 int roll;
	 String name;
	public Student(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
	}
	 
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public  HashMap<Integer, String> getStudentMap(HashMap<Integer, String> hm){
		List<Map.Entry<Integer, String>> list=new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());		
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){
			public int compare(Map.Entry<Integer, String>o1, Map.Entry<Integer, String>o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		HashMap<Integer, String> sortedMp=new LinkedHashMap<Integer, String>();
		list.forEach(e -> {
			sortedMp.put(e.getKey(), e.getValue());
			});
		return sortedMp;
	}

}
