package onlyArrays;

public class CopyArrayByIteratingIt {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int [] new_array= new int[10];
		
		for(int i=0; i<a.length; i++)
		{
			new_array[i]= a[i];
		}
		
		for(int i=0; i<new_array.length; i++)
		{
			System.out.print(new_array[i]);
		}
	}

}
