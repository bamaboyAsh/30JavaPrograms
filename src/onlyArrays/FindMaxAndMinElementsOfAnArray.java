package onlyArrays;

public class FindMaxAndMinElementsOfAnArray {

	public static void main(String[] args) {
		int []  a= {88,34,12,15,51,55,1,11,0};
		
		//find max and min
		int max=a[0], min=a[0];
		for(int i=0; i<a.length; i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
				else if(a[i]<min)
				{
					
					min=a[i];
				}
		}
		
		
		System.out.println("The max value is "+max+" and min vlaues is "+min);
	}

}
