import java.util.Scanner;
public class CountingRevisited
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.println ("Count from");
    int number  = keyboard.nextInt();

    System.out.println ("Count to");
    int number1  = keyboard.nextInt();

    System.out.println ("Count by");
    int number2  = keyboard.nextInt();

    System.out.println ();

    for ( int i = number ; i <= number1 ; i = i+ number2 )
    {
      System.out.println ( i );
    }
  }
}
