import java.util.Scanner;

public class BMICalculatorBonus1
{
  public static void main (String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    int Height ;
    int Height1 ;
    int Weight ;

    System.out.print ("Your height in feet only");
    Height = keyboard.nextInt();

    System.out.print ("What height in inches");
    Height1 = keyboard.nextInt();

    System.out.print ("What is yout weight in pounds");
    Weight = keyboard.nextInt();

    System.out.println ("Your BMI is" + Height + Height1 + Weight );

  }
}
