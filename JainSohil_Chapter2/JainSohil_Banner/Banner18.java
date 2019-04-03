import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banner18 extends JPanel //Exercise 17
                 implements ActionListener
{
   private int xPos, yPos;  //hold the coordinates of the message
   private int msgID = 1;
   private int counter = 0;
   
   //Called automatically after a repaint request
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); //Paint the background
      g.setColor(Color.RED);
      if (msgID == 1)
         g.drawString("East or West!", xPos, yPos);
      else
         g.drawString("Java is Best!", xPos, yPos);
   }
   
   //Called automatically when the timer "fires"
   public void actionPerformed(ActionEvent e)
   {
      //Adjust the horizontal position of the message:
      xPos--;  //subtract 1
      if (xPos < -100)
         xPos = getWidth();
      counter ++;
      if (counter>=66)
      {
         msgID = -msgID;
         counter = 0;
      }
      repaint();
   }
   
   public static void main(String[] args)
   {
      JFrame window = new JFrame("Action Demo");
      //Set this window's location and size:
      //upper-left corner at 300, 300; width 300, height 100
      window.setBounds(300, 300, 300, 100);
      
      //Create panel, a Banner18 object, which is a kind of JPanel:
      Banner18 panel = new Banner18();
      panel.setBackground(Color.CYAN); //the default color is light gray
      //Add panel to window;
      Container c = window.getContentPane();
      c.add(panel);
      
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      
      //Set the initial position of the message:
      panel.xPos = panel.getWidth();
      panel.yPos = panel.getHeight() / 2;
      
      //Create a Timer object that fires every 30 milliseconds;
      //Attach it to panel so that panel "listens to" and 
      //processes the timer events; start the timer:
      Timer clock = new Timer(30, panel);
      clock.start();
   }
}
      
      
