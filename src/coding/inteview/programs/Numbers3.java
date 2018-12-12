package coding.inteview.programs;

import java.util.Scanner;

/*
 * Write a Java program that accepts three integer 
 * values and return true if one of them is 20 or more less than one of the others
 */
public class Numbers3 {

	public static void main(String[] args) 
	{
		// take 3 integer as an input from user
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1= sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2= sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3=sc.nextInt();
		
		sc.close();
		
		//return true if one of them is 20 || more less than one another 
		
		 System.out.println((Math.abs(num1-num2) >= 20 || Math.abs(num2-num3) >= 20 || Math.abs(num3-num1) >= 20));
		
	}

}
