import java.util.*;
import java.io.*;

public class Gradies
{
  public static void main (String[] args) throws IOException
  {

    //Scanner fileIn = new Scanner (new File("ettu.txt"));
    Scanner keyboard = new Scanner (System.in);
    Random r = new Random();
    String name ;
    File grade = new File ("ettu.txt");
    FileWriter fw = new FileWriter(grade);
    PrintWriter pw = new PrintWriter(fw);


    int x = 1+r.nextInt (100);
    int a[] = new int [5];


    System.out.println ("Name (first last)");
    name = keyboard.nextLine();
    pw.println (name);
    // String name = fileIn.next();

    System.out.println ("Here are your randomly-selected grades (hope you pass)");

    for (int i=0; i<a.length; i++ )
    {
      System.out.print ("Grade: " + a[i]);
      a[i] = 1+r.nextInt(100);
      System.out.println (a[i] + " ");
      pw.println (a[i]);
    }

     pw.close();

}
}
