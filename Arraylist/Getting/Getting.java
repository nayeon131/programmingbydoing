import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Getting
{
  public static void main (String[] args)
  {
    ArrayList <Integer> mylist = new ArrayList<Integer>();
    Random generator = new Random();

    for (int i=0; i<10; i++)
    {
      mylist.add (1+generator.nextInt(101));
    }

    System.out.println (mylist);
    Integer largest = Collections.max (mylist);
    System.out.println ("The largest value is: " + largest);
  }
}
