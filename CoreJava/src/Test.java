import java.util.*;

public class Test {

	// This function prints frequencies of all elements 
    
  
    // Driver method to test above method 
    public static void main (String[] args) 
    { 
        String str = "This is my car.";
        String str1 = str.toLowerCase();
        String st;
        for(int i=0; i<str1.length(); i++) {
        st =Character.toString(str1.charAt(i));
        	if(i % 2 == 0) {
        	System.out.print(st.toUpperCase());
        }else {
        	System.out.print(st);
        	
        }
        }
        
    }
}
