import java.util.Scanner;
public class TwoQuestions 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String q1, q2, finalanswer;
		
		
		
		
		System.out.println("TWO QUESTIONS:");
		System.out.println("Think of an object, and i'll try and guess what it is!");
		
		
		System.out.println("Question 1) Is it an animal, vegetable or mineral? ");
		q1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		q2 = keyboard.next();
		
		
		if (q1.equals("animal") && (q2.equals("no")))
		{
			finalanswer = "Squirrel";
			System.out.println("Is it a " + finalanswer + "?" );
		
		
		
		}
		else if (q1.equals("animal") && (q2.equals("yes")))
		{
			finalanswer = "Moose";
			System.out.println("Is it a " + finalanswer + "?" );
		}
		if (q1.equals("vegetable") && (q2.equals("no")))
		{
			finalanswer = "carrot";
			System.out.println("Is it a " + finalanswer + "?" );
		}
		else if (q1.equals("vegetable") && (q2.equals("yes")))
		{
			finalanswer = "watermelon";
			System.out.println("Is it a " + finalanswer + "?" );
		}
		if (q1.equals("mineral") && (q2.equals("no")))
		{
			finalanswer = "paper clip";
			System.out.println("Is it a " + finalanswer + "?" );
		}
		else if (q1.equals("mineral") && (q2.equals("yes")))
		{
			finalanswer = "Camaro";
			System.out.println("Is it a " + finalanswer + "?" );
		}
		
	}
}
