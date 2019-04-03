import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Panel02 extends javax.swing.JPanel
{
  private JLabel label;
  private double number;
  
  public Panel02()
  {
    setLayout(new java.awt.FlowLayout());
    number = Math.random();
    
    label = new JLabel("" + number);
    label.setFont(new java.awt.Font("Serif", 1, 50));
    label.setForeground(java.awt.Color.blue);
    add(label);
    
    JButton button1 = new JButton("Random");
    button1.addActionListener(new Panel02.Listener1());
    add(button1);
    
    JButton button2 = new JButton("Cube Root");
    button2.addActionListener(new Panel02.Listener2());
    add(button2);
    
    JButton button3 = new JButton("Reciprocal");
    button3.addActionListener(new Panel02.Listener3());
    add(button3);
    
    JButton button4 = new JButton("Quit");
    button4.addActionListener(new Panel02.Listener4());
    add(button4);
  }
  
  private class Listener1 implements ActionListener {
    private Listener1() {}
    
    public void actionPerformed(ActionEvent e) { 
      number = Math.random();
      label.setText("" + number);
    }
  }
  
  private class Listener2 implements ActionListener {
    private Listener2() {}
    
    public void actionPerformed(ActionEvent e) { 
      number = Math.pow(number, 0.3333333333333333D);
      label.setText("" + number);
    }
  }
  
  private class Listener3 implements ActionListener {
    private Listener3() {}
    
    public void actionPerformed(ActionEvent e) { number = (1.0D / number);
      label.setText("" + number);
    }
  }
  
  private class Listener4 implements ActionListener {
    private Listener4() {}
    
    public void actionPerformed(ActionEvent e) { System.exit(0); }
  }
}