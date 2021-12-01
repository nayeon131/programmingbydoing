import java.util.Scanner;

class Student
{
	String name;
	int grade;
	int average;
	int zip;
}

public class Alittledatabase
{
	public static void main(String[] args) throws Exception
	{
		Scanner fin = new Scanner( System.in );

		Student uno = new Student();
		uno.name  = fin.nextLine();
		uno.grade    = fin.nextInt();
		uno.average  = fin.nextInt();
		uno.zip    = fin.nextInt();
		fin.skip("\n");

		Student dos = new Student();
		dos.name = fin.nextLine();
		dos.grade   = fin.nextInt();
		dos.average  = fin.nextInt();
		dos.zip    = fin.nextInt();
		fin.skip("\n");

		Student tre = new Student();
		tre.name = fin.nextLine();
		tre.grade   = fin.nextInt();
		tre.average  = fin.nextInt();
		tre.zip    = fin.nextInt();
		fin.skip("\n");


		fin.close();

		System.out.println(uno.name + ", " + dos.name + ", " + tre.name + "  " + uno.zip);
		System.out.println(dos.grade + ", " + dos.grade + ", " + dos.grade + "  " + dos.zip);
		System.out.println(tre.average + ", " + tre.average + ", " + tre.average + "  " + tre.zip);

	}
}
