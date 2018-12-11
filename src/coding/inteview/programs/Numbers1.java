package coding.inteview.programs;

import java.util.Scanner;

/*
 Write a Java program that accepts three integers from the user and return true if the second number 
 is greater than first number and third number is greater than second number. 
If "abc" is true second number does not need to be greater than first number.

 */
public class Numbers1 {

	public static void main(String[] args) {
		
		//Accept 3 integers
		
		int x,y,z;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		x= sc.nextInt();
		System.out.println("Enter 2nd number");
		y=sc.nextInt();
		System.out.println("Enter 3rd number");
		z=sc.nextInt();
		
		System.out.print("The result is: "+abc(x, y, z,true));
		System.out.print("\n");
		
		sc.close();
		
		
	}
	static boolean abc(int p, int q, int r, boolean xyz)
	{
		if(xyz)
		
			return (r>q);
		return(q > p && r > q);
		
	}

}
