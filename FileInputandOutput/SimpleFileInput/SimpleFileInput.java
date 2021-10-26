import java.util.*;
import java.io.*;

public class SimpleFileInput
{
  public static void main (String[] args) throws IOException
  {
    Scanner fileIn = new Scanner (new File("name.txt"));
    //File in = new File ("name.twt");
    //Scanner FileIn = new Scanner(in);

    String fristname = fileIn.next();
    String name = fileIn.next();

    System.out.println ("Using my psychic powers, I have determined that your name is " + fristname + name);
  }
}
