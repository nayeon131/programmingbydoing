import java.util.Scanner ;

public class HowoldareyouSpecifically
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    int age = 17 ;
    String name ;

    System.out.print (" Hey, What's your name? (Sorry, I keep forgetting.)" );
    name = keyboard.next();

    System.out.print ( "Ok,"+name+"how old are you?" );
      age = keyboard.nextInt();

    if  ( age < 16 )
    {
      System.out.println( "You can't drive." );
    }
    else if ( age < 18 )
    {
      System.out.println( "You can drive but not vore." );
    }
    if ( age > 18 )
    {
      System.out.println( "You can vote but not rent a car." );
    }
    else if ( age >= 25 )
    {
      System.out.println( "You can do pretty much anything." );
    }
  }
}
