import java.util.Scanner;
public class DumbCalculator 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double n1, n2, n3, answer;
		System.out.println("Let's find the average of a few numbers...");
		
		System.out.println("What is the first number?");
		n1 = keyboard.nextDouble();
		System.out.println("What us the second number?");
		n2 = keyboard.nextDouble();
		System.out.println("What is the third number?");
		n3 = keyboard.nextDouble();
		
		answer = (n1 + n2 + n3)/3;
		
		System.out.println("The average of the three numbers is " + answer);
	}
}