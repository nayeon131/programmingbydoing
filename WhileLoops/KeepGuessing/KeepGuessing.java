import java.util.Scanner;

public class KeepGuessing
{
  public static void main ( String [] args )
  {
    Scanner keyboard = new Scanner (System.in);
    int pin = 6 ;

    System.out.println ("I have a chosen a number between 1 and 10/ Try to guess it");
    System.out.print ("Your guess:");
    int entry = keyboard.nextInt ();

    while ( entry != pin )
    {
			System.out.println("\nThat is incorrect. Guess again.");
			System.out.print("Your guess:");
			entry = keyboard.nextInt();
		}
    System.out.println ("That's right! you're a good guesser!!");
  }
}
