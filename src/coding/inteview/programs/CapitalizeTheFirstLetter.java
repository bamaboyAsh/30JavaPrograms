package coding.inteview.programs;
//Write a Java program to capitalize the first letter of each word in a sentence.

import java.util.*;

public class CapitalizeTheFirstLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
	     
		 String line = sc.nextLine();
		 
		 sc.close();
		 
		 String upper_case_line = ""; 
	       Scanner lineScan = new Scanner(line); 
		while(lineScan.hasNext())
		{
			String word= lineScan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0))+ word.substring(1)+" ";
			
		}
		System.out.println(upper_case_line.trim());
}

}
