import java.util.*;

public class DiceDouble
{
  public static void main (String [] args)
  {


    System.out.println ("HERE COME THE DICE!");
    System.out.println ();

    Random r = new Random();

    int roll1 = 0 ;
    int roll2 = 0 ;
    roll1 = 1+r.nextInt(6);
    roll2 = 1+r.nextInt(6);

  while (roll1 != roll2)
  {
    System.out.print ("Roll#1:" + roll1 );
    System.out.print ("Roll#2:" + roll2 );
    int sum = roll1 + roll2 ;
    System.out.print ("The total is" + sum );
    System.out.println ();

    int roll3 = 0 ;
    int roll4 = 0 ;
    roll3 = 1+r.nextInt(6);
    roll4 = 1+r.nextInt(6);
  }
    System.out.println ();
    System.out.println ("Roll#1:" + roll1 );
    System.out.println ("Roll#2:" + roll2 );

    System.out.println ("The total is" + (roll1+roll2) + "!");

  }
}
