package coding.inteview.programs;

import java.util.Scanner;

//	Write a Java program to find the penultimate (next to last) word of a sentence.
public class PenultimateWord {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String line = in.nextLine();
		
		in.close();
		
		String words[]= line.split("[]+");
		
		System.out.println("Penultimate word: "+words[words.length-2]);
	}

}
