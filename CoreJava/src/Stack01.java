
import java.util.Stack;

public class Stack01 {

	    public static void main(String[] args) {
	        Stack<String> animals= new Stack<>();

	        // Add elements to Stack
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");
	        System.out.println("Initial Stack: " + animals);

	        // Remove element stacks
	        //String element = animals.pop();
	        System.out.println("Removed Element: " + animals.pop()+","+ animals.pop());
	    }
	}