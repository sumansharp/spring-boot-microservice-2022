import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Limit_Count {

	public static void main(String[] args) {

		List<String> vehicles=Arrays.asList("car","bus","truck","bus","bus","car","car");
		//distinct()
		vehicles.stream()
			.distinct()
			.forEach(nm->System.out.println(nm));
		
		System.out.println("=====================");
		
		//count()
		
		System.out.println(vehicles.stream().count());
		
		//limit
		
		System.out.println(vehicles.stream().limit(3).collect(Collectors.toList()));
	}

}
