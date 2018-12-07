package onlyArrays;

import java.util.Scanner;

public class InsertAnElementInArraytoASpecificIndex 
{

	static int inserElementinArray(int []a, int [] new_array, int num1, int index, int size)
	{
		for(int i=0; i<size; i++ )
		{
			if(i<index)
			{
				new_array[i]=a[i];
			}
			for(int i1=index+1;  i1<=size+1; i1++)
			{
				new_array[index]=a[i1];
			}
			
		}
		for(int i= index; i<size+1; i++)
		{
			new_array[i+1]=a[i];
		}
		return  size;
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
		int [] new_array= new int[size+1];
		size=(inserElementinArray(a,new_array, num1, index, size));
		
		for(int i=0; i<new_array.length; i++)
		{
			System.out.println(new_array[i]);
		}
		
		
	}

}
