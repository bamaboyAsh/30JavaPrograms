package onlyArrays;

public class SumOfArrays 
{

	public static void main(String[] args) 
	{
		
		int [] a = {2,3,5,1,2,12,123,5,4,12};
		int sum=0;
		//sum of array
		
		for(int i=0; i<a.length; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
