import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ArraylistThereornot
{
  public static void main (String[] args)
  {
    ArrayList <Integer> al = new ArrayList<Integer>();
    Scanner keyboard = new Scanner(System.in);

    for (int i=0; i<=10; i++)
      {
        al.add(getNumbers());
      }
      System.out.println ("Arraylist: "+ al );

      System.out.print ("\n");
      System.out.println ("Value to find: ");

      int choice = keyboard.nextInt();


        if (al.contains(choice))
        {
          System.out.print (choice+ " is in the Arraylist");
        }
        else
        {
          System.out.print (choice+ " is not in the Arraylist");
        }


    }

    public static int getNumbers()
    {
      Random r = new Random();
      int x = 1+r.nextInt(100);
      return x;
    }
  }
