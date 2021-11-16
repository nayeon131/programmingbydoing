import java.util.Random ;
public class CoppyingArrays
{
  public static void main (String[] args)
  {
    Random r = new Random();
    int x = 1+r.nextInt (100);
    int a[] = new int [10];
    int b[] = new int [10];
    System.out.print ("Array 1:");

    for (int i=0; i<a.length; i++ )
    {

      a[i] = 1+r.nextInt(100);
      System.out.println (a[i] + " ");



    }

    b = a;
    b[b.length-1] = -7;


    System.out.print ("Array 2: ");

    for (int i=0; i<b.length; i++ )
    {
      System.out.print (b[i] + " ");
    }


  }
}
