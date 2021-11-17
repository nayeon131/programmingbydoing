import java.util.Random ;
import java.util.Scanner;

public class Finding
{
  public static void main (String[] args)
  {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);

    //int num;


    int x = 1+r.nextInt (100);
    int a[] = new int [11];
    System.out.print ("Array: ");

    for (int i=0; i<a.length; i++ )
    {
      a[i] = 1+r.nextInt(100);
      System.out.print (a[i] + " " );

    }
    System.out.print ("\n");
    System.out.println ("Value to find: "  );
    //num = keyboard.nextInt();

    int choice = keyboard.nextInt();

		for(int i=0; i<a.length; i++)
    {
			if(a[i]==choice)
      {
				System.out.println(choice+" is in the array.");
			}
		}
  }
 }
