import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		
		int number;
		int SecondNumber;
		String word;	
		String SecondWord; 
	
		System.out.print ( "Give me a word! " );
		word = keyboard.nextLine();

		System.out.print ( "Give me a second word! " );
		SecondWord = keyboard.nextLine();
 
		System.out.print ( "Great, now your favorite number " );
		number = keyboard.nextInt();

		System.out.print ( "And your second-favorite number " );
		SecondNumber = keyboard.nextInt();

		System.out.println ( "Whew! Wasn't that fun?" );
	
	  }
}