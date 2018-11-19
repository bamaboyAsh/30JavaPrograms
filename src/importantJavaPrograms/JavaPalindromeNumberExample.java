package importantJavaPrograms;

/*
This program shows how to check for in the given list of numbers
whether each number is palindrome or not
*/

public class JavaPalindromeNumberExample 
{

	public static void main(String[] args) 
	{
		//array of numbers to be checked
		int numbers[] = new int[] {121,13,34,11,22,54};
		
		//iterate through the numbers
		for(int i=0; i<numbers.length; i++ )
		{
			int number= numbers[i];
			int reversedNumber = 0;
			int temp=0;
		
			/*
			 * If the number is equal 
			 * to it's reversed number, then the given number is palindorme number.
			 * 
			 * for ex 141 is a palindrome number while 15 is not.
			 */
			
			//reverse the number
			
			while(number>0)
			{
				temp = number%10;
				number = number/10;
				reversedNumber= reversedNumber * 10+ temp;
			}
			if(numbers[i] == reversedNumber)
				 System.out.println(numbers[i] + " is a palindrome");
				 else
				 System.out.println(numbers[i] + " not a palindrome ");
		}
		
	}

}


/* Output = 121 is a palindrome
13 not a palindrome 
34 not a palindrome 
11 is a palindrome
22 is a palindrome
54 not a palindrome 
*/