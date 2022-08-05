package DesignPattern;

class Singleton01 {
	private static Singleton01 single_instance=null;
	
	public String st;
	
	 Singleton01() {
		st="Singleton object is initiated";
		//System.out.println(st);
	}
	
	public static Singleton01 get_instance() {
		if(single_instance == null) {
			single_instance = new Singleton01();
		}
			return single_instance;
		
	}

}
