import java.util.Scanner;

public class BMICalculatorBonus
{
    public static void main (String[] args )
    {
      Scanner keyboard = new Scanner (System.in);

      int Inches ;
      int Pounds ;

      System.out.print ("Your height in inches");
      Inches = keyboard.nextInt();

      System.out.print ("What is yout weight in pounds");
      Pounds = keyboard.nextInt();

      System.out.println ("Your BMI is" + Inches + Pounds);

  }
}
