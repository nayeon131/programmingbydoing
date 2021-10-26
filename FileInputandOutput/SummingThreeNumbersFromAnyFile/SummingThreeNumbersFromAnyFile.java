import java.util.*;
import java.io.*;

public class SummingThreeNumbersFromAnyFile
{
  public static void main (String[] args) throws IOException
  {
      Scanner keyboard = new Scanner (System.in);
      int num ;
      int num2 ;
      int num3 ;
      String usrFile;

      System.out.println ("Which file would you like to read numbers from: ");
      usrFile = keyboard.next();

      File in = new File(usrFile);
      Scanner input = new Scanner(in);
      //FileWriter fw = new FileWriter(userFile);
      //PrintWriter pw = new PrintWriter(fw);


     System.out.println ("Reading numbers form file\"" + usrFile);

      num =  input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();
     //pw.close();
     input.close();

     System.out.println( num + " + " + num2 + " + " + num3 + " = " + (num+num2+num3));






  }
}
