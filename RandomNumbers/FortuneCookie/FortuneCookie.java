import java.util.Random;

public class FortuneCookie
{
  public static void main (String[] args)
  {
    Random r = new Random();

    int x = 1 + r.nextInt(54);

    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.println();

    System.out.print ("Fortune cookie says :" + "You will find happiness with a new love");


  }
}
