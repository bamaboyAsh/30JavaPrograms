package coding.inteview.programs;

import java.util.Scanner;

//Write a Java program to convert a string to an integer in Java

public class StringToInteger {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String input= sc.nextLine();
		sc.close();
		
		//Convert the input string to Integer.
		
		int result = Integer.parseInt(input);
		
		System.out.printf("The integer value is: %d", result);

	}

}
/*
Enter a String
25
The integer value is: 25
*/
