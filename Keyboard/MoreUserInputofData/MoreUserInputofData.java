import java.util.Scanner ;

public class MoreUserInputofData
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner (System.in);

    int Grade;
    int StudentID;
    int Login;
    int Gpa;
    String FirstName;
    String LastName;

    System.out.print( "Your information " );

    System.out.print( "Login" );
    Login = keyboard.nextInt();

    System.out.print( "ID" );
    StudentID = keyboard.nextInt() ;

    System.out.print( "Name");
    FirstName = keyboard.nextLine() ;
    LastName = keyboard.nextLine() ;

    System.out.print( "GPA");
    Gpa = keyboard.nextInt() ;

    System.out.print( "Grade");
    Grade = keyboard.nextInt ();

  }
}
