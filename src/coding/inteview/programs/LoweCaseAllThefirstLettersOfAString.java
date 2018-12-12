package coding.inteview.programs;

import java.util.Scanner;

public class LoweCaseAllThefirstLettersOfAString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in all caps");
		
		String input= sc.nextLine();
		
		Scanner linescan = new Scanner(input);
		String UpperLine= "";
		sc.close();
		
		while(linescan.hasNext())
		{
			String word= linescan.next();
			UpperLine+= Character.toLowerCase(word.charAt(0))+word.substring(1)+" ";
			
		}
		System.out.println(UpperLine.trim());

	}

}
