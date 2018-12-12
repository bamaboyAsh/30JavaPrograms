package coding.inteview.programs;

import java.util.Scanner;

//Write a Java program that accepts two integer values between 25 to 75 \
//and return true if there is a common digit in both numbers

public class Numbers4 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first num between 25-75");
		int num1= in.nextInt();
		System.out.println("Enter the second num between 25-75");
		int num2=in.nextInt();
		
		System.out.println(common_digit(num1, num2));
	}
	
	public static boolean common_digit(int x, int y)
	{
		if(x<25 && y>75)
		{
			return false;
		}
		
		int p= x%10;
		int q= y%10;
		
		x/=10;
		y/=10;
		
		return (x==y || x==p|| p==y|| p==y);
		
		
		
		
	}

}
