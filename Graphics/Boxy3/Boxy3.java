import java.awt.*;
import javax.swing.JFrame;

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );

    drawBox( window, Color.BLACK,  100, 100, 140, 40 );
    drawBox( window, Color.DARK_GRAY,  150, 430, 360, 100 );
    drawBox( window, Color.LIGHT_GRAY,  60, 160, 40, 150 );
    drawBox( window, Color.ORANGE,  500, 200, 70, 150 );
    drawBox( window, Color.PINK,  160, 170, 130, 65 );
    drawBox( window, Color.CYAN,  350, 70, 240, 80 );


	}

	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
    window.setColor(c);
		window.fillRect(x,y,w,h);

    window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
