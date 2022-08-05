import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List <String>vehicle=Arrays.asList("bus","Car","cycle","train");
		List <String>vehicleListUpperCase= new ArrayList<String>();
		
		for(String st:vehicle) {
			String str;
			vehicleListUpperCase.add(st.toUpperCase());
		}
		System.out.println(vehicleListUpperCase);
		System.out.println("==============");
		
		vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList())
			.forEach(nm->System.out.println(nm));
		
	}

}
