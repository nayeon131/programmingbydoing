import java.util.Scanner ;

public class Twomorequestions
{
  public static void main (String [] args)
  {
      Scanner keyboard = new Scanner (System.in);

      System.out.print ("Two more Questions, baby !");

      System.out.print ("Think of something and I'll try to guess it!");

      System.out.print ("Question 1) Does it stay inside or outside or both?");

      String ans = " ";

      System.out.print (">") ;

      ans = keyboard.next();

      System.out.print ("Question 2) Is it a living thing?");

      String ans2 = " ";

      System.out.print (">") ;

      ans2 = keyboard.next();

    if (ans2.equals("yes"))
    {
      if (ans.equals("Outside"))
      {
        System.out.print ("Then what else could you be thinking of besides a python?!?");
      }
      if (ans.equals("Inside"))
      {
        System.out.print ("Then what else could you be thinking of houseplant?!?");
      }
      if (ans.equals("Both"))
      {
        System.out.print ("You be thinking of dog?");
      }
    }
    else if (ans2.equals("no"))
    {
      if (ans.equals("Outside"))
      {
        System.out.print ("Is it billboard");
      }
      if (ans.equals("Inside"))
      {
        System.out.print ("IS it shower curtain?");
      }
      if (ans.equals("Both"))
      {
        System.out.print ("Obviously the nonliving, inside/outside thing on your mind is a dead ant!");
      }
    }
  }
}
