import java.util.Random;

public class FortuneCookieBonus
{
  public static void main (String[] args)
  {
    Random r = new Random();

    int x = 1 + r.nextInt(54);
    System.out.println ("Fortune cookie says :" + "Stick with your wife");
    
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.print( 1 + r.nextInt(54) + " " );
    System.out.println();

  }
}
