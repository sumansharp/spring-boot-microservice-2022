import java.util.*;
class Annotation01 {
	
		 //@SuppressWarnings("unchecked")
		  static void wordsList() {
		    ArrayList<String> wordList = new ArrayList<>();

		// This causes an unchecked warning
		    wordList.add("programiz"); 

		    System.out.println("Word list => " + wordList);
		  }

		  public static void main(String args[]) {
		    wordsList();
		  }
		}
