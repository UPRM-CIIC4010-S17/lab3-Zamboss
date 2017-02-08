import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g){
	super.paintComponent(g);
	
	Insets myInsets= this.getInsets();
	  int x1 = myInsets.left;
      int y1 = myInsets.top;
      int x2 = getWidth() - myInsets.right ;
      int y2 = getHeight() - myInsets.bottom ;
      int width = x2 - x1;
      int height = y2 - y1;
       
      g.setColor(Color.DARK_GRAY);
      g.fillRect(x1,y1,width +1,height +1);
//      g.setColor(Color.YELLOW);
//      g.drawRect(x1, y1, width-1, height-1);
//      g.setColor(Color.GREEN);
//      g.drawRect(x1+3, y1+3, width-7, height-7);
//      
//      g.setColor(Color.WHITE);
//      g.drawLine(x1, y1, x2, y2);
//      g.setColor(Color.RED);
//      g.drawLine(x2, y1, x1, y2);
//      
      
      g.setColor(Color.LIGHT_GRAY);
      g.fillOval(x1-width,y1-height ,55,55);
      
      
      
      
      
      



}
}
