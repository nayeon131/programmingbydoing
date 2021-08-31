import java.util.Scanner;

public class BWICalculator
{
    public static void main (String[] args )
    {
      Scanner keyboard = new Scanner (System.in);

      int Height;
      int Weight;

      System.out.print ("Your height in m");
      Height = keyboard.nextInt();

      System.out.print ("What weight in kg");
      Weight = keyboard.nextInt();

      System.out.println ("Your BMI is" + Height + Weight);

    }
}
