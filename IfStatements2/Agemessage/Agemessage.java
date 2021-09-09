import java.util.Scanner ;

public class Agemessage
{
  public static void main ( String[] args )
  {

    Scanner keyboard = new Scanner (System.in);

    String name ;

    System.out.print ("Your name");

    String Name = "";

    System.out.print (":");

    name = keyboard.next();

    int age ;

    System.out.print ("Your age");

    System.out.print (":");

    age = keyboard.nextInt();

      if  (age < 16)
      {
        System.out.print ("You can't drive" + name );
      }
      if (age >= 16 && age <= 17)
      {
        System.out.print ("You can drive but not vote" + name );
      }
      if (age >= 18 && age <= 24)
      {
        System.out.print ("You can vote but not rent a car" + name );
      }
      if (age >= 25)
      {
        System.out.print ("You can do pretty much anything" + name );
      }

  }
}
