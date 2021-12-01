import java.util.Scanner;

class Student
{
	String name;
	int grade;
	int average;
	int zip;
}

public class Alittlealoop
{
	public static void main(String[] args) throws Exception
	{
    Student[] addybook = new Student[4];
		Scanner fin = new Scanner( System.in );

    for ( int i=0; i<addybook.length; i++ )
    {
      addybook[i] = new Student();
      addybook[i].name = fin.nextLine();
      addybook[i].grade   = fin.nextInt();
      addybook[i].average  = fin.nextInt();
      addybook[i].zip    = fin.nextInt();
      fin.skip("\n");
    }
    fin.close();

    for ( int i=0; i<1; i++ )
    {
      System.out.println((i) + ". " + addybook[i].name + ", " + addybook[i].grade + ", " + addybook[i].average + "  " + addybook[i].zip);
    }


	}
}
