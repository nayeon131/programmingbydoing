import java.util.Scanner;

public class TwentyQuestions
{
  public static void main( String[] args )
  {
    
    Scanner keyboard = new Scanner(System.in);

    System.out.print (" Two Questions! ");

    System.out.print (" Think of an object, and I'll try to guess it. ");

    System.out.print (" Question1) s it animal, vegetable, or mineral? ");

    String ans_level1 = "";

    System.out.print (">") ;

    ans_level1 = keyboard.next();

    System.out.print (" Question 2 )Is it bigger than a breadbox? ");

    String ans_level2 = "" ;

    ans_level2 = keyboard.next();


    if (ans_level2.equals("yes"))
    {
      if (ans_level1.equals("animal"))
      {
        System.out.print (" No, it isn't ");
      }
      else if (ans_level1.equals("vegetable"))
      {
        System.out.print (" You're thinking of a Pumpkin ");

        System.out.print (" I would ask you if I'm right, but I don't actually care ");
      }
      else if (ans_level1.equals("mineral"))
      {
        System.out.print (" My quess is that you are thinking of a truck. ");

        System.out.print (" I would ask you if I'm right, but I don't actually care ");
      }
    }

    else if (ans_level2.equals("no"))
    {
      if (ans_level1.equals("animal"))
      {
      System.out.print (" My quess is that you are thinking of a mouse. ");

      System.out.print (" I would ask you if I'm right, but I don't actually care ");
      }
      else if (ans_level1.equals("vegetable"))
      {
      System.out.print (" No, it isn't ");
      }
    else if (ans_level1.equals("mineral"))
    {
      System.out.print (" No, it isn't ");
    }
  }
  }
}
