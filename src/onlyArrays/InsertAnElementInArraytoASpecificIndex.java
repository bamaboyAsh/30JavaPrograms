package onlyArrays;

import java.util.Scanner;

public class InsertAnElementInArraytoASpecificIndex 
{

	static int inserElementinArray(int []a, int num1, int index, int size)
	{
		int []new_array= new int [size+1];
		
		for(int i=0; i<size; i++ )
		return size;
	}
	
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5,6,7,8,9};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter an element to insert");
		int num1= sc.nextInt();
		
		System.out.println("Enter the index where you want to insert the element in the array");
		int index= sc.nextInt();
		int size=a.length;
		size=(inserElementinArray(a, num1, index, size));
	}

}
