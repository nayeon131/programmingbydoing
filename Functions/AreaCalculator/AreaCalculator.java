import java.util. *;
public class AreaCalculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Shape Area Calculator version 0.1 (c) 2005 Mitchell sample output, Inc.");
    System.out.println ("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    while (true)
    {
      System.out.println ();
      System.out.println ("1) Triangle");
      System.out.println ("2) Rectangle");
      System.out.println ("3) Square");
      System.out.println ("4) Circle");
      System.out.println ("5) Quit");
      System.out.println ("Which shape: ");
      int shape = keyboard.nextInt();
      System.out.println();

      if (shape==1)
      {
        areaTriangle(5,6);
      }
      else if (shape==2)
      {
        areaRectangle(10,4);
      }
      else if (shape==3)
      {
        areaSquare(9);
      }
      else if (shape==4)
      {
        areaCircle(4);
      }
      else if (shape==5)
      {
        quit();
        break;
      }
      }}

      public static double areaTriangle ( int base, int height)
      {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Base: ");
        base = keyboard.nextInt();
        System.out.print ("Height: ");
        height = keyboard.nextInt();
        System.out.println();
        int A = (base*height)/2;
        System.out.println ("The are is " + A );
        return A;
      }

      public static int areaRectangle ( int length, int width)
      {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Length: ");
        length = keyboard.nextInt();
        System.out.print ("Width: ");
        width = keyboard.nextInt();
        System.out.println();
        int A = length * width;
        System.out.println ("The are is " + A );
        return A;
      }

      public static int areaSquare ( int side )
      {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Side: ");
        side = keyboard.nextInt();
        System.out.println();
        int A = side*side;
        System.out.println (" The are is" + A );
        return A;
      }

      public static double areaCircle ( int radius )
      {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("Redius: ");
        radius = keyboard.nextInt();
        System.out.println();
        double A = Math.PI*radius*radius;
        System.out.println (" The are is" + A );
        return A;
      }

      public static String quit()
      {
        System.out.println ("GoodBye!");
        return null;
      }
    }
