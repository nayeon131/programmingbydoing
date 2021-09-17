import java.util.Random;

public class Dice
{
  public static void main ( String[] args )
	{
		Random r = new Random();

		int roll1 = 1+r.nextInt(6);
    int roll2 = 1+r.nextInt(6);
    int sum = roll1+roll2;

    System.out.println ("HERE COMES THE DICE!");

    System.out.println( "Roll #1" );
    System.out.print( roll1 + " " );
    System.out.println();

    System.out.println( "Roll #2" );
    System.out.print( roll2 + "\t" );
    System.out.println();

    System.out.print("The total is "+sum+"!");

  }
}
