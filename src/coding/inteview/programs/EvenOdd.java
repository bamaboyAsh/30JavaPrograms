package coding.inteview.programs;

import java.util.Scanner;

//Write a Java program to accept a number and check the number is even or not. 
//Prints 1 if the number is even or 0 if the number is odd.

public class EvenOdd {

	
	static int check(int input)
	{
		
		if(input%2==0)
		{
			return 1;
		}
		else
		return 0;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check");
		int input= sc.nextInt();
		
		sc.close();
		System.out.println(check(input));
	}

}
