package coding.inteview.programs;
//Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.*;

public class CapitalizeTheFirstLetter {

	public static void main(String[] args) {
		// creating scanner obj to take input form console. hence system.in
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input a Sentence: ");
	     
		 String line = sc.nextLine();
		 
		 sc.close();
		 
		 String upper_case_line = ""; 
	     
		 //Creating scanner obj to use scanner to scan the sentence and use special methods on string
		 Scanner lineScan = new Scanner(line); 
		
		 //iterating the string one by one
		 while(lineScan.hasNext())
		{
			String word= lineScan.next();
			
			//appending the string one by one and starting from index 0 to all the substring 1 and putting whitespace in it.
			upper_case_line += Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
			
		}
		 //at the end we have to print the complete string with the help of trim method we eliminate whitespace at the start and end
		System.out.println(upper_case_line.trim());
}

}
