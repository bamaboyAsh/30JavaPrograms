package coding.inteview.programs;
import java.util.Scanner;

public class SquareOfSubmatrixHighestSumBoundaryElements 
{

	public static void main(String[] args) 
	{
		//1. taking input from user.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Height");
		int height= sc.nextInt();
		
		System.out.println("Enter Width");
		int width= sc.nextInt();
		
		//closing Scanner
				sc.close();
		
		//2. Taking a default 2D array input
		int arr [][] = 
			   {{2,0,6,1,2,5},
				{1,0,5,0,1,3},
				{3,0,1,2,4,1},
				{0,1,3,1,1,9},
				{4,1,0,8,5,2},
				{0,1,0,1,2,3},
				{6,5,3,1,0,2},
				{0,0,1,6,0,4}};
		
		//iterating the 2D array using for each loop
		for(int i[]: arr)
		{
			for(int j: i)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		//3. now creating a Subarray from the user input for height and width.
		
		//row= width and height = height. and printing the sum of it
		
		int result=0;
		for(int row=0; row<width; row++)
		{
			
			for(int col=0; col<height; col++)
				{
					
					System.out.printf("%s",arr[row][col]);
					result = result+arr[row][col];
				}
			
			System.out.println("");
		}
		System.out.println("Sum of the SubArray= " +result);
		
		
		//4. Finding all possible SubArray of the given height and width of an array.
		
		//implementing a logic to print all the SubArrays in the given input.
		
		int length;
		length=arr.length;
		
		System.out.println(length);
		
		
		int count=0;
		
		while(count<length)
		{
			for(int row=0+count; row<width; row++)
			{
				
				for(int col=0+count; col<height; col++)
					{
						
						System.out.printf("%s",arr[row][col]);
						result = result+arr[row][col];
					}
					
				System.out.println("");
			}
			count++;
		}
		/*
		 for (int startPoint = 0; startPoint <width ; startPoint++) 
		 {
	            //group sizes
	            for (int grps = startPoint; grps <=height ; grps++) {
	                
	            	for(int i= startPoint; i<grps; i++)
	            	{
		                for (int j = startPoint ; j < grps ; j++) {
		                	System.out.printf("%s",arr[i][j]);
		                }
		            	
		                System.out.println();
	            	}
	            }	
			}
		*/
		
	}

	
}