import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/

public class Boxy extends Canvas
{
	public void paint( Graphics window )
	{

		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);

    window.setColor(Color.GREEN);
    window.fillRect(100,100,100,100);
    window.setColor(Color.WHITE);
		window.fillRect(110,110,80,80);

    window.setColor(Color.ORANGE);
    window.fillRect(400,150,100,100);
    window.setColor(Color.WHITE);
		window.fillRect(410,160,80,80);

    window.setColor(Color.GRAY);
    window.fillRect(450,350,100,100);
    window.setColor(Color.WHITE);
		window.fillRect(460,360,80,80);


	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy();
		JFrame win = new JFrame("Boxy - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
