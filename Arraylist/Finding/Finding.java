import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

 public class Finding
 {
   public static void main (String[] args)
   {

     ArrayList <Integer> mylist = new ArrayList<Integer>();
     Random generator = new Random();
     Scanner input = new Scanner (System.in);

     for (int i = 0 ;  i < 10; i++)
     {
       mylist.add (1+generator.nextInt(51));
     }

     System.out.println (mylist);
     System.out.println ("Please enter an Integer" );
     int x = input.nextInt();
     System.out.println ("Value to find " + x );


     for (Integer i : mylist)
     {
       if (x==i)
       {
         System.out.println (x + " is in");
       }
     }

   }
 }
