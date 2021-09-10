import java.util.Scanner ;

public class BMIcategoriesBonus
{
  public static void main (String [] args)
  {
      Scanner keyboard = new Scanner (System.in);

      double height = keyboard.nextInt() ;

      String category ="";

      System.out.print ("Your height in inches");

      System.out.print (">") ;

      height = keyboard.nextInt();

      double weight = keyboard.nextInt() ;

      System.out.print ("Your weight in pounds");

      System.out.print (">") ;

      double BMI = (weight/(height*height))*703;

      System.out.print ("Your" + BMI + "is:");

      if (BMI < 15.0)
      {
        category = "very severely underweight";
      }
      else if (BMI > 15.0 && BMI < 16.0)
      {
        category = "severely underweight";
      }
      else if (BMI > 16.1 && BMI < 18.4)
      {
        category = "underweight";
      }
      else if (BMI > 18.5 && BMI < 24.9)
      {
        category = "normal weight";
      }
      else if (BMI > 25.0 && BMI < 29.9)
      {
        category = "overweight";
      }
      else if (BMI > 30.0 && BMI < 34.9)
      {
        category = "moderateky obese";
      }
      else if (BMI > 35.0 && BMI < 39.9)
      {
        category = "severely obese";
      }
      else if (BMI >= 40.0)
      {
        category = "very severely(or morbidly) obese";
      }
      System.out.print ("BMI category is" + category );
  }
}
