import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int pid;
	double price;
	String pname;
	
	
	Product(int pid, String pname, double price){
		
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
}
public class FilterDemo {

	public static void main(String[] args) {
			List <Product>productList=new ArrayList<Product>();
			
			productList.add(new Product(1, "Sony Laptop", 22000));
			productList.add(new Product(2, "Lenevo Laptop", 32000));
			productList.add(new Product(3, "Hp Laptop", 20000));
			productList.add(new Product(4, "Aser Laptop", 18000));
			productList.add(new Product(5, "Apple Laptop", 90000));
		
			List <Product>filteredProduct=new ArrayList<Product>();
			
			filteredProduct = productList.stream().filter(n->n.price>20000).collect(Collectors.toList());
			
			for(Product p:filteredProduct) {
				
				System.out.println(p.pid+ " " + p.pname+" "+p.price);
				
			}
			System.out.println("============");
			
			productList.stream().filter(nm->nm.price>20000).forEach(prd->System.out.println(prd.pid+ " " + prd.pname+" "+prd.price));
			
	}

}
