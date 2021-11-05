import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );

    drawBox( window, Color.RED, 200, 300 );
    drawBox( window, Color.BLACK, 400,200 );
    drawBox( window, Color.GRAY, 350, 250 );
    drawBox( window, Color.YELLOW,480,400 );
    drawBox( window, Color.ORANGE, 150,100 );
    drawBox( window, Color.GREEN, 560, 450 );
    drawBox( window, Color.MAGENTA, 300, 430 );
    drawBox( window, Color.PINK, 600, 150 );
    drawBox( window, Color.CYAN, 150, 450 );
    drawBox( window, Color.LIGHT_GRAY, 550, 200 );


	}

	public void drawBox( Graphics window, Color c, int x, int y )
	{

		window.setColor(c);
		window.fillRect(x,y,100,100);

		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
