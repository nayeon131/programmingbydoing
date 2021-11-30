import java.util.Scanner;

class Student
{
	String name;
	int grade;
	int average;

}

public class Basicrecords
{
	public static void main(String[] args)
	{
		Scanner fin = new Scanner( System.in );

    Student  student1 = new Student();
    Student  student2 = new Student();
    Student  student3 = new Student();

    System.out.println ("Enter the first student's name: ");
    student1.name = fin.next();
    System.out.println ("Enter the first student's grade: ");
    student1.grade = fin.nextInt();
    System.out.println ("Enter the first student's average: ");
    student1.average = fin.nextInt();

    System.out.println ("Enter the second student's name: ");
    student2.name = fin.next();
    System.out.println ("Enter the second student's grade: ");
    student2.grade = fin.nextInt();
    System.out.println ("Enter the second student's average: ");
    student2.average = fin.nextInt();

    System.out.println ("Enter the third student's name: ");
    student3.name = fin.next();
    System.out.println ("Enter the third student's grade: ");
    student3.grade = fin.nextInt();
    System.out.println ("Enter the third student's average: ");
    student3.average = fin.nextInt();

		fin.close();

		System.out.println("The names are:" + student1.name + " " + student2.name + " " + student3.name);
		System.out.println("The age are:" + student1.grade + " " + student2.grade + " " + student3.grade);
		System.out.println("The averages are:" + student1.average + " " + student2.average + " " + student3.average);

    double total = student1.average + student2.average +  student3.average;
    System.out.println ("The average for the three students is:" + total/3.0);

	}
}
