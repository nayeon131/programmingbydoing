import java.util.Scanner;

public class ChooseYourOwn
{
  public static void main ( String[] args )
  {
      Scanner keyboard = new Scanner (System.in);

      System.out.println (" WELCOME TO MITCHELL'S TINY ADVENTURE !");

      System.out.print (" You are in a creepy house ! ");

      System.out.print ("Would you like to go upstairs or into the kitchen? ");

      String ans_level1 = " ";

      System.out.print (">") ;

      String ans=keyboard.next();


   if (ans.equals("Kitchen"))
    {
      System.out.println (" There is a long countertop with dirty dishes everywhere.");

      System.out.println (" Off to one side there is, as you'd expect, a refrigerator.");

      System.out.println (" You may open the refrigerator or look in a cabinet");

      System.out.print (">");

      ans=keyboard.next();

      if (ans.equals("refrigerator"))
      {
        System.out.print (" ");

        System.out.println ("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food (yes or no)");

        System.out.print (">");

        if (ans.equals("yes"))
        {
          System.out.println ("You find the delicious cake");
        }
        else if (ans.equals("no"))
        {
          System.out.println("You die of starvation...eventually");
        }
      }

      else if (ans.equals("cabinet"))
      {
        System.out.print ("");

        System.out.println("There have some box in there you wanna open it?");

        System.out.print (">");

        ans=keyboard.next();

        if (ans.equals("yes"))
        {
          System.out.println ("you died.. box inside have bomb");
        }

        else if (ans.equals("no"))
        {
          System.out.println ("Good job you save");
        }
      }
}
   else if (ans.equals("upstais"))
      {
        System.out.println ("Upstairs you see a hallway. At the end of the hallway is the master bedroom. There is also a bathroom off the hallway. Where would you like to go");

        System.out.print (">");

        ans=keyboard.next();

        if (ans.equals("bedroom"))
        {
          System.out.print (" ");

          System.out.println ("You are in a plush bedroom, with expensive-looking haedwook furniture. The bed is unmade. In the back of the room, the closet is ajar. Would you like to open the door? (yes or no)");

          System.out.print("> ");

    			ans=keyboard.next();

          if (ans.equals("yes"))
          {
            System.out.print ("");

            System.out.print ("You find the bomb this house will be destruction");
          }

          else if (ans.equals("no"))
          {
            System.out.print ("Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statement");
          }

        else if (ans.equals("Bathroom"))
        {
          System.out.print(" ");

          System.out.println ("The door is opening you want to inside");

          System.out.print("> ");

    			ans=keyboard.next();

          if (ans.equals("yes"))
          {
            System.out.println("");
            System.out.println(" fell down because of soap.");
          }
          else if (ans.equals("no"))
          {
            System.out.println("");

            System.out.println ("You find the secret door. You can escape");
          }
        }
      }
    }
  }
}
