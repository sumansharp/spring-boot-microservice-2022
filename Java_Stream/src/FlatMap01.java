import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap01 {

	public static void main(String[] args) {
		//Example of map()
		
		List<Integer> numList=Arrays.asList(2,4,5,6,2,3,6);
		numList.stream().map(n->n+3).collect(Collectors.toList()).forEach(nm-> System.out.println(nm));
	
		
		//Example of flatMap()
		List<Integer> lst1=Arrays.asList(1,2);
		List<Integer> lst2=Arrays.asList(3,4);
		List<Integer> lst3=Arrays.asList(5,6);
		List<Integer> lst4=Arrays.asList(7,8);
		
		List<List<Integer>> finalList=Arrays.asList(lst1,lst2,lst3,lst4);
		
		System.out.println("=========Adding 2 in each number=========");
		finalList.stream()
			.flatMap(n->n.stream())
			.map(x->x+2)
			.collect(Collectors.toList())
			.forEach(nm->System.out.print(nm));
		
		System.out.println("==================");
		
		List<Integer> finaResult=finalList.stream()
		.flatMap(n->n.stream())
		.collect(Collectors.toList());
		
		System.out.println(finaResult);
	}

}
