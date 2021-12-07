import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@SuppressWarnings("unchecked")

public class SortinganArrayList
  {
    public static void main (String[] args)
      {
        Random generator = new Random();
        ArrayList foo = new ArrayList();

        for (int i = 0; i < 20; i++)
          {

            foo.add (10 + generator.nextInt(90));

          }


          System.out.println ("ArrayList before " + foo);

          sort(foo);
          System.out.println ("ArrayList after " + foo);
        }

      public static ArrayList sort (ArrayList foo)
      {
        Collections.sort(foo);
        Collections.reverse(foo);
        return foo;
      }
    }
