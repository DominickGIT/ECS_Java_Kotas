import java.util.Scanner;
public class ALittleQuiz //313
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String names; 
		int answer;
		double finalanswer;
		
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("     1) Melbourne");
		System.out.println("     2) Anchorage");
		System.out.println("     3) Juneau");
		
		answer = keyboard.nextInt();
		if ( answer <= 1 && answer <= 2 )
		
			System.out.println("Sorry, that is wrong.");
		
		else if ( answer <= 3 )
		
			System.out.println("That's right!");
	
		
		System.out.println("Q2) Can you store the value cat in a variable of type int?");
		System.out.println("     1) yes ");
		System.out.println("     2) no ");
		answer = keyboard.nextInt();
		
		if ( answer <= 1 )
		{
			System.out.println("Sorry, cat is a string. ints can only store numbers.");
		}
		else if ( answer <= 2 )
		{
			System.out.println("Yes! That's correct.");
		}
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("     1) 5");
		System.out.println("     2) 11");
		System.out.println("     3) 15/3");
		answer = keyboard.nextInt();
		
		if ( answer <= 1 )
		{
			System.out.println("Sorry, that's not correct.");
		}
		else if ( answer <= 2 )
		{
			System.out.println("Yes! Good job that's correct!");
		}
		else if ( answer <= 3 )
		{
			System.out.println("Sorry, that's not correct.");
		}
		
		finalanswer = answer/3;
		
		System.out.println("Overall, you got " + finalanswer + "/3 correct.");
		System.out.println("Thanks for playing!");
		
	}
}
