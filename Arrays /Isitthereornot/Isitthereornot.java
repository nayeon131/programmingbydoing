import java.util.Random ;
import java.util.Scanner;

public class Isitthereornot
{
  public static void main (String[] args)
  {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);

    int a[] = new int [11];
    int b[] = new int [1];
    System.out.print ("Array: ");

    for (int i=0; i<a.length; i++ )
    {
      a[i] = 1+r.nextInt(50);
      System.out.print (a[i] + " " );

    }
    System.out.print ("\n");
    System.out.println ("Value to find: "  );

    int choice = keyboard.nextInt();

		for(int i=0; i<b.length; i++)
    {
			if(a[i]==choice)
      {
				System.out.println(choice+" is in the array.");
			}
      else
       {
         System.out.println(choice+" is not in the array.");
       }
    }
  }
 }
