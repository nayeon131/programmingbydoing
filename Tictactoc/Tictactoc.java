import java.util.Scanner;

public class Tictactoc
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		initBoard();
		displayBoard();

    char Player1 = 'X';
    char Player2 = 'O';

    int turn = 1;


    while (true)
    {
      if (turn %2 != 0)
      {
        playerChoice (Player1);
        turn ++;
      }
      else
      {
        playerChoice (Player2);
        turn = turn +1;
      }
    }
	}


	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}

	public static void displayBoard()
	{
		System.out.println();
		System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("    ---+---+---");
		System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("    ---+---+---");
		System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
		System.out.println("     0   1   2\n");
	}

	public static void playerChoice( char player )
	{
		Scanner kb = new Scanner(System.in);
		int row, column;

		System.out.print( "'" + player + "', choose your location (row, column): " );
		row = kb.nextInt();
		column = kb.nextInt();

		board[row][column] = player;
	}

	public static boolean winGame( char player )
	{
		// check horizontal
		for ( int r = 0; r < 3; r++ )
		{
			if ( player == board[r][0] && board[r][0] == board[r][1] && board[r][1] == board[r][2] )
				return true;
		}

		// check vertical
		for ( int c = 0; c < 3; c++ )
		{
			if ( player == board[0][c] && board[0][c] == board[1][c] && board[1][c] == board[2][c] )
				return true;
		}

		// check diagonal
		if ( player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2] )
				return true;
		else if ( player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0] )
				return true;


		return false;
	}


}
