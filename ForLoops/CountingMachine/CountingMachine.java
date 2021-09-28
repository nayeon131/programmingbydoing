import java.util.Scanner;
public class CountingMachine
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.println ("Count to");
    int number  = keyboard.nextInt();

    for ( int i = 0 ; i <= number ; i++ )
    {
      System.out.print ( i );
    }
  }
}
