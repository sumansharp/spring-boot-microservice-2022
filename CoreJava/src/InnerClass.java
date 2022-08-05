

public class InnerClass {

	public void write() {
		System.out.println("Writing pages.");
	}
	class Inner{
		 public void wirte() {
			 System.out.println("Writing pages from Inner class");
		 }
	}
	public static void main(String[] args) {

		InnerClass out=new InnerClass();
		out.write();
		InnerClass.Inner inner=out.new Inner();
		inner.wirte();

	}

}
