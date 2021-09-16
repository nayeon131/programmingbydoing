import java.util.Random;

public class ANumberGame
{
  public static void main (String [] args )
  {
    Random r = new Random();

    int x = 1 + r.nextInt(10);

    System.out.println ("I'm thinking of a number from 1 to 10");

    System.out.print( 1 + r.nextInt(10) + " " );
		System.out.println();

    int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "That's right ! My secret number was"+ x );
		}
		if ( num1 != num2 )
		{
			System.out.println( "Sorry, but I was really thikink of" + x );
		}

  }
}
