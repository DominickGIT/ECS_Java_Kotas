import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int weight;
		int planet;
		double spaceweight;
		
		System.out.println("Please enter your current earth weight:");
		weight = keyboard.nextInt();
		
		System.out.println("I have information for the following planets:");
		System.out.println("1. Venus   2. Mars   3. Jupiter");
		System.out.println("4. Saturn  5. Uranus 6. Neptune");
		
		
		
		
		
		
		
		System.out.println("Which planet are you visiting? ");
		planet = keyboard.nextInt();
		
		
		
		if ( planet <= 1 )
		{
			spaceweight = .78 * + weight;
			System.out.println("Your weight would be " + spaceweight);
			
		}
			if ( planet >= 2 )
			{
			spaceweight = .39 * + weight;
			System.out.println("Your weight would be " + spaceweight);
			}
				if ( planet <= 3 )
				{
					spaceweight = 2.65 * + weight;
					System.out.println("Your weight would be " + spaceweight);
				}
					if ( planet >= 4 )
					{
						spaceweight = 1.17 * + weight;
						System.out.println("Your weight would be " + spaceweight);
					}
						if ( planet >= 5 )
						{
							spaceweight = 1.05 * + weight;
							System.out.println("Your weight would be " + spaceweight);
						}
							if ( planet >= 6 )
							{
								spaceweight = 1.23 * + weight;
								System.out.println("Your weight would be " + spaceweight);
							}
		
		
		
		
		
		
	}
}
