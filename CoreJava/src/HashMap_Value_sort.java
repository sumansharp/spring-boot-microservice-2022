import java.util.*;
import java.lang.*;
import java.util.Map.Entry;
public class HashMap_Value_sort {

	public static HashMap<Integer, String> sortBy(HashMap<Integer, String> hm){
			
			List<Map.Entry<Integer, String>> list= new LinkedList<Map.Entry<Integer, String>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer, String>>(){
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer,String> o2) {
				return(o1.getValue()).compareTo(o2.getValue());
			}
			
		});
		
		HashMap<Integer, String> temp= new LinkedHashMap<Integer, String>();
		for(Map.Entry<Integer, String> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		//list.forEach(e ->{
		//	sortedHM.put(e.getKey(), e.getValue());
		//});
		return temp;
		}

		public static void main(String[] args) {
			HashMap<Integer, String> hm= new HashMap<Integer, String>();
			hm.put(44,"M");
		    hm.put(99,"I");
		    hm.put(88,"X");
			hm.put(22,"A");
		    hm.put(55,"B");
		    hm.put(33,"Z");
		    
		    
		    Map<Integer, String> hm1= sortBy(hm);
		    
		    for(Map.Entry<Integer, String> en : hm1.entrySet()) {
		    	System.out.println("Key =" + en.getKey() + ", Value= "+ en.getValue());
		    }
	    }
	}


