import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
  public void paint (Graphics g)
  {

    g.setColor (Color.black);
    g.drawOval (200, 240,300,300);

    g.setColor (Color.lightGray);
    g.fillOval (345,377,10,10);

    g.setColor (Color.black);
    g.setFont (new Font ("consolas",Font.BOLD,30));
    g.drawString ("12" , 330 , 280);

    g.setColor (Color.black);
    g.setFont (new Font ("consolas",Font.BOLD,30));
    g.drawString ("9" , 210 , 390);

    g.setColor (Color.black);
    g.setFont (new Font ("consolas",Font.BOLD,30));
    g.drawString ("3" , 460 , 390);

    g.setColor (Color.black);
    g.setFont (new Font ("consolas",Font.BOLD,30));
    g.drawString ("6" , 340 , 530);

    g.setColor (Color.black);
    g.drawLine (345, 380 , 210, 380);

    g.setColor (Color.black);
    g.drawLine (347, 380 , 260, 440);





    // labels
    g.setColor(Color.black);
    g.setFont(new Font(null));
    for ( int X=0; X<800; X += 50 )
        g.drawString( String.valueOf(X), X, 50 );
    for ( int Y=100; Y<600; Y += 50 )
        g.drawString( String.valueOf(Y), 28, Y );
    // lines
    g.setColor(Color.lightGray);
    for ( int X=0; X<800; X += 50 )
        g.drawLine(X,0,X,599);    // horizontal
    for ( int Y=0; Y<600; Y += 50 )
        g.drawLine(0,Y,799,Y);    // vertical

  }

  public static void main( String[] args )
	{
		JFrame win = new JFrame("ACircle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockFace canvas = new ClockFace();
		win.add( canvas );
		win.setVisible(true);
	}
}
