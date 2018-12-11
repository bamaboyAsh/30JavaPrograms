package coding.inteview.programs;
//Write a Java program that accepts three integers from the user and return 
//true if two or more of them (integers ) have the same rightmost digit. 
//The integers are non-negative.

import java.util.Scanner;

public class Numbers2 {

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
				

				if(x%10 == y%10 || y%10==z%10|| z%10==x%10)
				{
					System.out.println("true");
				}
				else
				{
					System.out.println("False");
				}
				
				
	}

}
/*OutPut:
 Enter 1st number
20
Enter 2nd number
12
Enter 3rd number
30
true


Enter 1st number
5
Enter 2nd number
10
Enter 3rd number
15
true

 */