import java.util.*;
import java.io.*;

public class HighScore
{
  public static void main (String[] args) throws IOException
  {
    Scanner keyboard = new Scanner (System.in);
    File score = new File ("Score.txt");
    FileWriter fw = new FileWriter(score);
    PrintWriter pw = new PrintWriter(fw);


    System.out.println ("You got a high score!");

    System.out.println ("Please enter your score:");
    int num = keyboard.nextInt();
    pw.println (num);
    System.out.println ("Please enter your name:");
    String name = keyboard.next();
    pw.println(name);
    System.out.println ("Data stored into score.twt.");



    pw.close();
  }
}
