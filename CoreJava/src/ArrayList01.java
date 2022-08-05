import java.util.ArrayList;
import java.util.HashSet;

	public class ArrayList01 {

	  public static void main(String[] args) {

	    // create a set
		 HashSet<String> vowels = new HashSet<>();
		  
	    //ArrayList<String> vowels = new ArrayList<>();
	    vowels.add("a");
	    vowels.add("e");
	    vowels.add("i");
	    vowels.add("i");
	    vowels.add("o");
	    vowels.add("u");

	    // create an arraylist
	    ArrayList<String> alphabets = new ArrayList<>();

	    // add all elements of set to arraylist
	    alphabets.addAll(vowels);
	    System.out.println("ArrayList: " + alphabets);
	    
	    alphabets.set(2, "i");
	    alphabets.set(3, "o");
	    alphabets.set(4, "u");
	    System.out.println("ArrayList after setting value: " + alphabets);
	    // below will through  java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
	    //alphabets.remove(5);
	  }
	}

	// Output: ArrayList: [a, e, i]