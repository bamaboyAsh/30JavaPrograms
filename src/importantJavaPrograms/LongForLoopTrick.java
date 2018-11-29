package importantJavaPrograms;

/*
 
 
Write a program to generate the following output (in the given layout) using loop(s).

1	10	11	20	21	30
2	9	12	19	22	29
3	8	13	18	23	28
4	7	14	17	24	27
5	6	15	16	25	26
6	5	16	15	26	25
 
 */

public class LongForLoopTrick {

	public static void main(String[] args) 
	{
		for(int a=1, b=10, c= 11, d=20, e=21, f=30; a<=6; a++, b--, c++, d--,e++,f--)
		{
			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		}
	
	}

}
