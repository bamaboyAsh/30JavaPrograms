package coding.inteview.programs;

import java.util.Scanner;

public class RouteRabbitInterviewProgram 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n= sc.nextInt();
		int [] A= new int[n];
		
		System.out.println("Enter "+n+" elements in an array");
		
		for(int i = 0; i<n; i++)
		{
			A[i]= sc.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println(A[i]);
		}
		
		//to find the duplicate values of an array
		int []k= new int[n];
		for(int i: A)
		{
			for(int j=i; j<n; j++)
			{
				if(j!=A[i+1])
				{ 
					System.out.println(j);
				}
				
				
			}
		}
	}	
	

}
