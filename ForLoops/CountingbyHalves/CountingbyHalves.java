import java.util.Scanner;
public class CountingbyHalves
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    System.out.println ("x");
    System.out.println ("------");

    for ( double i = -10 ; i <= 10 ; i += 0.5 )
    {
      System.out.println ( i );
    }
  }
}
