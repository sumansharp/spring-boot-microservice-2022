import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	int eid;
	String ename;
	String proj;
	String training;
	
	Employee(int eid, String ename, String proj, String training){
		this.eid=eid;
		this.ename=ename;
		this.proj=proj;
		this.training=training;
	}
}
public class FlatMap02 {

	public static void main(String[] args) {

		List<Employee> employees1=new ArrayList<Employee>();
		employees1.add(new Employee(101, "Ravi sinha", "TD BANK", "JAVA Stream"));
		employees1.add(new Employee(104, "Aiswarya", "Lumen", "IBM Infoserver"));
		employees1.add(new Employee(107, "Arhaan", "Sprint", "IBM CLOUD"));
		
		List<Employee> employees2=new ArrayList<Employee>();
		employees2.add(new Employee(102, "Akshata", "Sprint", "JAVA Stream"));
		employees2.add(new Employee(109, "aarti", "Lumen", "IBM Infoserver"));
		employees2.add(new Employee(106, "Dheeraj", "TD BANK", "JAVA Stream"));
		
		List<List<Employee>> allEmployee=Arrays.asList(employees1,employees2);
		
		System.out.println("employees selected for IBM INFOSERVER Training:");
		allEmployee.stream()
			.flatMap(emp->emp.stream())
			.filter(e->e.training.equals("JAVA Stream"))
			.collect(Collectors.toList())
			.forEach(elist-> System.out.println(elist.ename));
	}

}
