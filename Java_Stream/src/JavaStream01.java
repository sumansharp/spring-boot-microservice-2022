import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream01 {

	public static void main(String[] args) {
		List <Integer>numberList=Arrays.asList(2,3,12,14,15,17,18,19,21);
		List <Integer>evenNumberList= new ArrayList<Integer>();
		
//		for(int n:numberList)
//		{
//			if(n%2==0) {
//				System.out.println(n);
//			}
//		}
		
		evenNumberList = numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumberList);
		System.out.println("===========-1");
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("===========-2");
		
		numberList.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
