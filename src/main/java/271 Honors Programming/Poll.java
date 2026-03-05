import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Poll {
   public static void main(String[] args) {
      JFrame pollFrame = new JFrame("Poll");
      PollWindow pw = new PollWindow();
      pw.setBounds(0, 0, 900, 900);
      pollFrame.add(pw);
      pollFrame.setSize(900,900);
      pollFrame.setLayout(null);
      pollFrame.setVisible(true); 
   }
}
   
class PollWindow extends JPanel implements ActionListener {
   JButton button1, button2, button3, button4, button5;
   int count1, count2, count3, count4, count5;
  
  public PollWindow()
  {
    button1 = new JButton("Cheese");
    button1.setToolTipText("Your Favorite is Cheese Pizza");
    button1.addActionListener(this);

    button2 = new JButton("Pepperoni");
    button2.setToolTipText("Your Favorite is Pepperoni Pizza");
    button2.addActionListener(this);

    button3 = new JButton("Meat Lovers");
    button3.setToolTipText("Your Favorite is Meat Lovers Pizza");
    button3.addActionListener(this);

    button4 = new JButton("Pineapple");
    button4.setToolTipText("Your Favorite is Pineapple Pizza");
    button4.addActionListener(this);

    button5 = new JButton("Mushroom");
    button5.setToolTipText("Your Favorite is Mushroom Pizza");
    button5.addActionListener(this);


    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
  }

  /**
   *  Processes button events
   */
  @Override public void actionPerformed(ActionEvent e)
  {
    JButton button = (JButton)e.getSource();

    if (button == button1)
      count1++;
    else if (button == button2)
      count2++;
    else if (button == button3)
      count3++;
    else if (button == button4)
      count4++;
    else if (button == button5){
      count5++;
    }

    repaint();
  }
  
  /**
   *  Displays the numbers and the pie chart
   */
  @Override
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    final int xStep = getWidth()/8;

    // Display numbers
    int y = 575;
    g.drawString(String.valueOf(count1), 2*xStep, y);
    g.drawString(String.valueOf(count2), 3*xStep, y);
    g.drawString(String.valueOf(count3), 4*xStep, y);
    g.drawString(String.valueOf(count4), 5*xStep, y);
    g.drawString(String.valueOf(count5), 6*xStep, y);

    // Display legend (colors)
    y = 580;
    g.setColor(Color.red);
    g.fillRect(2*xStep, y, 10, 10);
    g.setColor(Color.orange);
    g.fillRect(3*xStep, y, 10, 10);
    g.setColor(Color.pink);
    g.fillRect(4*xStep, y, 10, 10);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(5*xStep, y, 10, 10);
    g.setColor(Color.cyan);
    g.fillRect(6*xStep, y, 10, 10);



    // Display pie chart
    int total = count1 + count2 + count3 + count4 + count5;
    if (total == 0)
      return;

    final int size = 4*xStep, x = 4*xStep - size/2;
    y = 70;
    g.setColor(Color.lightGray);
    g.fillOval(x, y, size, size);

    double degrees, from = 90;
    degrees = countToDegrees(count1, total);
    g.setColor(Color.red);
    g.fillArc(x, y, size, size, (int)from, (int)degrees);
    from += degrees;
    degrees = countToDegrees(count2, total);
    g.setColor(Color.orange);
    g.fillArc(x, y, size, size, (int)from, (int)degrees);
    from += degrees;
    degrees = countToDegrees(count3, total);
    g.setColor(Color.pink);
    g.fillArc(x, y, size, size, (int)from, (int)degrees);
    from+= degrees;
    degrees = countToDegrees(count4, total);
    g.setColor(Color.LIGHT_GRAY);
    g.fillArc(x, y, size, size, (int)from, (int)degrees);
    from += degrees;
    degrees = countToDegrees(count5, total);
    g.setColor(Color.cyan);
    g.fillArc(x, y, size, size, (int)from, (int)degrees);
  }

  /**
   *  Converts the count as a fraction of the total into
   *  the size of the pie slice in degrees.
   */
  private double countToDegrees(int count, int total)
  {
    return ((double)count / (double)total * -360);
  }
}

