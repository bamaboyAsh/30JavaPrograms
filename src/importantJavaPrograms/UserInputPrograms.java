package importantJavaPrograms;

import java.util.Scanner;

public class UserInputPrograms {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height and width for the block respectivly" );
		int height= sc.nextInt();
		int width= sc.nextInt();
		
		for (int i=1; i<=height; i++)
		{
			for(int j=1; j<=width; j++)
			{
				System.out.print("B");
			}
			System.out.println("");
		}

	}

}
