import java.util.*;

public class Arraylist2
{
  public static void main (String[] args)
  {
    ArrayList <Integer> al = new ArrayList<Integer>();


    for (int i=0; i<=10; i++)
      {
        al.add(getNumbers());
      }
      System.out.println ("Arraylist: "+ al );
  }

  public static int getNumbers()
  {
    Random r = new Random();
    int x = 1+r.nextInt(100);
    return x;


  }

}
