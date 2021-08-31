import java.util.Scanner ;

public class AfterFiveinYears
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);

    String name;
    int age;

    System.out.print ("Hello. What is your name?");
    name = keyboard.nextLine();

    System.out.print ("Hi,"+name+"! How olad are you?") ;
    age = keyboard.nextInt();

    System.out.println ("Did you know that in five years you will be" +age+"years ago?" );

    System.out.println ("And five years ago you were" +(age-5)+"! Imagine that !" );

  }
}
