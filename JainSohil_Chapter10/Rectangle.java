import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Rectangle extends JFrame {

public void paintComponent(Graphics g)
 {
 g.setColor(Color.BLUE);
 g.fillRect(75, 50, 300, 125);
 }
public Rectangle() {




}


public static void main(String[] args)
  {
    Rectangle window = new Rectangle();
    window.setBounds(700, 300, 500, 500);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}



