import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo3 extends Canvas
{
  public void paint (Graphics g)
  {
    g.setColor (Color.green);
    g.drawLine (10, 100, 400, 100);
    g.setColor (Color.red);
    g.drawLine (5, 50, 300, 200);

    g.setColor (Color.blue);
    g.drawLine (50, 150, 100, 180);
    g.setColor(Color.magenta);
		g.drawLine(100,350,300,230);

		g.setColor(Color.black);

    g.drawString("Graphics are pretty neat.", 500, 100);
		g.setFont(new Font("Consolas", Font.PLAIN, 36));
		g.drawString("Yes, they are.", 400, 200);

    g.setColor(Color.white);
		g.setFont(new Font("Calibri", Font.BOLD+Font.ITALIC, 60));
		g.drawString("Leander Lions", 300, 350);

		g.setColor(Color.blue);
		g.setFont(Font.decode("Calibri-BOLDITALIC-60"));
    g.drawString("Leander Lions", 290, 360);

    g.setColor(Color.black);
		g.setFont(new Font(null));

		int x=400, y=490;
		g.drawRect(x,y,150,20);
		g.drawString("Where is the starting point?", x,y);
		g.setColor(Color.red);
		g.drawLine(x,y,x,y);

	}

  public static void main (String[] args)
  {
    JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo3 canvas = new GraphicsDemo3();
		win.add( canvas );
		win.setVisible(true);
  }
}
