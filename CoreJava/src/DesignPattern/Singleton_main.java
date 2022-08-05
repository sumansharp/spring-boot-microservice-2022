package DesignPattern;

public class Singleton_main {

	
	public static void main(String[] args) {
		Singleton01 x= new Singleton01().get_instance();
		Singleton01 y= new Singleton01().get_instance();
		Singleton01 z= new Singleton01().get_instance();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		if(x==y  && y==z) {
			System.out.println("three Objects point to the same memory location");
		}
		

	}

}
