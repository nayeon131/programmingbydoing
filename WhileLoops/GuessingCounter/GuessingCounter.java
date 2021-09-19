import java.util.Scanner;

public class GuessingCounter
{
  public static void main ( String [] args )
  {
    Scanner keyboard = new Scanner (System.in);
    int pin = 6 ;

    System.out.println ("I have a chosen a number between 1 and 10. Try to guess it");
    int tries = 1 ;
    System.out.print ("Your guess:");
    int entry = keyboard.nextInt ();

    while ( entry != pin )
    {
			System.out.println("\nThat is incorrect. Guess again.");
			System.out.print("Your guess:");
			entry = keyboard.nextInt();
      tries++;
		}


    System.out.println ("That's right! you're a good guesser!!");
    System.out.print ("It only took you " + tries + " tries");
  }
}
