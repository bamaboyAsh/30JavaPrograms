package onlyArrays;

public class AverageValueOfAnArray {

	public static void main(String[] args) 
	{
	//calculate average value of an array
		
		int [] a= {2,23,12,14,16,75,3,4,5,323,213,251};
		int sum=0;
		double average=0;
		int count = a.length;
		//calculating sum of array
		
		for(int i=0; i<count;i++)
		{
			sum+=i;
			
		}
		average= sum/count;
		
		System.out.println(average);
	}

}
