import java.util.Random ;

public class Largestvalue
{
  public static void main (String[] args)
    {

      Random r = new Random();
      int largest = 0;

      int a[] = new int [11];
      int b[] = new int [2];

      System.out.print ("Array: ");

      for (int i=0; i<a.length; i++ )
      {
          a[i] = 1+r.nextInt(100);
          System.out.print (a[i] + " " );

      }

      for (int i=0; i<b.length-1; i++)
      {
        if (largest < a[i])
        {
          largest=a[i];
          System.out.print ("\n");
          System.out.println ("The largest value is " + a[i]);

        }
      }













    }
}
