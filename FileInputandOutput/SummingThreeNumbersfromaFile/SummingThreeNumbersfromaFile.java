import java.util.*;
import java.io.*;

public class SummingThreeNumbersfromaFile
{
  public static void main (String[] args) throws IOException
  {

    Scanner fileIn = new Scanner (new File("3nums.txt"));

    //File nums = new File ("3nums.txt");
    //FileWriter fw = new FileWriter(nums);
    //PrintWriter pw = new PrintWriter(fw);

     int num = fileIn.nextInt();
     int num2 = fileIn.nextInt();
     int num3 = fileIn.nextInt();

    System.out.println("Reading numbers from file" + "3nums.txt" + ".....done");
    System.out.println( num + " + " + num2 + " + " + num3 + " = " + (num+num2+num3));




  }
}
