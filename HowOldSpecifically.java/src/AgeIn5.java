import java.util.Scanner;
public class AgeIn5 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		int agem5;
		int agep5;
		
		
		
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, " + name + "!" + " How old are you?");
		age = keyboard.nextInt();
		agem5 = age-5;
		agep5 = age+5;
		System.out.println("Did you know that in five years from now you will be " + agep5 + "?");
		keyboard.next();
		System.out.println("And five years ago you were " +agem5 + "! Imagine that!" );
		
		
		
		
		
		
		
		
		
		
	}
}
