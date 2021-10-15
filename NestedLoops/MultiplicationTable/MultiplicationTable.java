public class MultiplicationTable
{
  public static void main (String[] args)
  {
    System.out.println ("X | 1\t2\t3\t4\t5\t6\t7\t8\t9\t");
    System.out.println ("===+================================================================");
    for (int i=1; i<=12; i++)
    {
      if (i<10)
          System.out.print(" "+ i +" | ");
          else
            System.out.print ( i + " | ");
      for (int j=1; j<=9; j++ )
      {
        System.out.print ((i*j)+ "\t");
      }System.out.println();
    }
  }
}
