import java.util.List;
import java.util.LinkedList;

public class LinkedList01 {


	    public static void main(String[] args) {
	        // Creating list using the LinkedList class
	        List<Integer> numbers = new LinkedList<>();

	        // Add elements to the list
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        System.out.println("List: " + numbers);

	        // Access element from the list
	        int number = numbers.get(2);
	        System.out.println("Accessed Element: " + number);

	        // Using the indexOf() method
	        int index = numbers.indexOf(2);
	        System.out.println("Position of 2 is " + index);

	        // Remove element from the list
	        int removedNumber = numbers.remove(1);
	        System.out.println("Removed Element: " + removedNumber);
	        
	        //print after removing 
	        System.out.println("List: " + numbers);
	    }
	}
