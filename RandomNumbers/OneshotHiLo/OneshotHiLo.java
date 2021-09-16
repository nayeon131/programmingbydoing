import java.util.Random;

public class OneshotHiLo
{
  public static void main (String [] args )
  {
    Random r = new Random();

    int x = 1 + r.nextInt(10);

    System.out.println ("I'm thinking of a number between 1-100. Try to guess it.");
    System.out.println (">");

    System.out.print( 1 + r.nextInt(100) + " " );
		System.out.println();

    int num1 = 1 + r.nextInt(100);
		int num2 = 1 + r.nextInt(100);

		if ( num1 == num2 )
		{
			System.out.println( "You guessed it! What are the odds?!?");
		}
		if ( num1 != num2 )
		{
			System.out.println( "Sorry,you are too highr. I was thinking of " + x );
		}

  }
}
