import java.util.Scanner;

public class ADumbCalculator
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    int FirstNumber ;
    int SecondNumber ;
    int ThirdNumber ;

    System.out.print ("What is your first number?");
    FirstNumber = keyboard.nextInt();

    System.out.print ("What is your second number? ");
    SecondNumber = keyboard.nextInt();

    System.out.print ("What is yout third number?");
    ThirdNumber = keyboard.nextInt();

    System.out.println ( FirstNumber + SecondNumber + ThirdNumber/2 );

  }
}
