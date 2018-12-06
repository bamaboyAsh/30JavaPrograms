
package onlyArrays;
import java.util.Arrays;
public class SortAnIntegerAndStringArray 
{

	public static void main(String[] args) 
	{
		// using default array of intergers to sort an interger array 
        int a[] = { 99,21,51,22,41,534,1235,5312,23,12,4,6 }; 
  
        // To sort the array using normal sort- 
        Arrays.sort(a);
  
        for(int i : a)
        {
        	System.out.println(i);
        }
        
        
        System.out.println("");
        System.out.println("");
        //using char array now to sort 
        
        String [] str= {"asbc", "sdac", "fasedsa", "sadaesa", "ereased"};

        Arrays.sort(str);
        for(String i: str)
        {
       
        	System.out.println(i);
        }
	}

}
