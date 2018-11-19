/*
This program shows how to calculate
Factorial of a number.
*/



/* Definition of a Factorial number 
 * For an integer n greater than or equal to 1, 
the factorial is the product of all integers 
less than or equal to n but greater than or equal to 1.
*/


/*
 * Factorial of any number is! n.
 * For example, factorial of 4 is 4*3*2*1.
 */

package importantJavaPrograms;

public class FactorialOfANumber 
{

	public static void main(String[] args) 
	{
		int number = 10;
		int factorial = number;
		
		for(int i=(number -1); i>1; i--)
		{
			factorial=factorial* i;
		}
		System.out.println("Factorial of a number is"+factorial);
	}
	
	
	/* Output 
	*/
}
