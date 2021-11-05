import java.awt.*;
import javax.swing.JFrame;

public class ACircle extends Canvas
{
  public void paint (Graphics g)
  {
      g.setColor (Color.green);
      g.fillOval (100, 200,100,100);
  }

  public static void main( String[] args )
	{
		JFrame win = new JFrame("ACircle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ACircle canvas = new ACircle();
		win.add( canvas );
		win.setVisible(true);
	}
}
