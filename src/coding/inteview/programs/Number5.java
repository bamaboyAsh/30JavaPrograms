package coding.inteview.programs;

import java.util.Scanner;

//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
public class Number5 {

	public static void main(String[] args) {
		 	Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int a = in.nextInt();  
			System.out.print("Input the second number: ");
			int b = in.nextInt(); 
			
			//logic is divide the 2 numbers store it in divided variable
			// then use result var to store the subtraction of the first number form division * 2nd var
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result); 
	}

}
