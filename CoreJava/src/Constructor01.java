
public class Constructor01 {
	
	
	private static String lastname;
	private String firstname;
	
	 public Constructor01() {
		firstname="Rupesh";
	}
	
	 public static void lastName() {
		 lastname="Gupta";
		}
	 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor01 cons = new Constructor01();
		Constructor01.lastName();
		System.out.println("First Name is "+ cons.firstname);
		System.out.println("Last Name is "+ cons.lastname);
	}

}
