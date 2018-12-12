package com.w3package;

import java.util.Scanner;

public class Insert_a_word_in_middle_of_a_String {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//main string
		
		System.out.println("Enter the string");
		String main_string= sc.nextLine();
		//input word
		
		System.out.println("Enter the word you want to enter");
		String input= sc.nextLine();
		//index to input
		
		System.out.println("Enter the index you want to enter the word");
		int index= sc.nextInt();
		
		sc.close();
		
		System.out.println(main_string.substring(0, index) + input + main_string.substring(index-1));
		
	
	}

}
