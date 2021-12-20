import java.util.*;

public class Factorial
{
  public static void main (String[] args)

  {
    Scanner scan = new Scanner (System.in)
    int n = Scan.nextInt();
    int factorial = 1; 

    for (int i = n; i>1; i--)
    {
      factorial * = i;
    }
  }
}
