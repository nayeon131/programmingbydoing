import java.util.Scanner ;

public class BMIcategories
{
  public static void main (String [] args)
  {
      Scanner keyboard = new Scanner (System.in);

      double height = keyboard.nextInt() ;

      System.out.print ("Your height in m");

      System.out.print (">") ;

      height = keyboard.nextInt();

      double weight = keyboard.nextInt() ;

      System.out.print ("Your weight in kg ");

      System.out.print (">") ;

      double BMI = (weight/(height*height))*703;

      System.out.print ("Your" + BMI + "is:");

        if ( BMI < 18.5 )
        {
          System.out.print ("underweight");
        }
        if ( BMI > 18.5 && BMI < 24.9 )
        {
          System.out.print ("normal weight");
        }
        if ( BMI > 25.0 && BMI < 29.9 )
        {
          System.out.print ("overweight");
        }
        if ( BMI >= 30.0)
        {
          System.out.print ("obese");
        }
  }
}
