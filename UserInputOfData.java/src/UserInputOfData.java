import java.util.Scanner;
public class UserInputOfData 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastname, login;
		int grade, id;
		double GPA;
		
		System.out.println("First name:");
		name = keyboard.next();
		System.out.println("Last name:");
		lastname = keyboard.next();
		System.out.println("Grade (9-12):");
		grade = keyboard.nextInt();
		System.out.println("Student ID:");
		id = keyboard.nextInt();
		System.out.println("Login:");
		login = keyboard.next();
		System.out.println("GPA (0.0-4.0):");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your Information;");
		
		System.out.println("Login: " + login);
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + GPA);
		System.out.println("Grade: " + grade);
		
	}
}
