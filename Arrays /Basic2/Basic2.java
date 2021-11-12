import java.util.Random ;

public class Basic2
{
  public static void main (String[] args)
  {
    Random r = new Random();

    int a[] = new int [10];

    for (int i=0; i<a.length; i++ )
    {
      a[i] = 1+r.nextInt(100);
      System.out.println ("Slot "+i+" conatains " + a[i]);
    }

  }
 }
