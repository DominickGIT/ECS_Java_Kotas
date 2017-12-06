import java.util.Scanner;
public class ALittleQuiz 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String names; 
		int answer;
		
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
		System.out.println("1) yes ");
		System.out.println("2) no ");
		
		
		
	}
}
