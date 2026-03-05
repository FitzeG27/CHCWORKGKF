import apcslib.*;
import javax.swing.Box;
import jdk.jshell.PersistentSnippet;
import java.awt.Color;

public class InitialsGKF
{
  
  public static void main(String[] args)
  {

    Color darkPurple = new Color(61, 3, 110);

    DrawingTool pen;
    SketchPad paper;

    paper = new SketchPad(1000, 700);
    pen = new DrawingTool(paper);


    pen.setWidth(5);
    pen.setColor(darkPurple);
    pen.up();
    pen.turnLeft(90);
    pen.forward(200);
    pen.turnRight(90);


    //G
    pen.up();
    pen.forward(60);
    pen.down();
    pen.forward(40);
    for (int i = 1; i<= 31; i++){
        pen.down();
        pen.turnLeft(7);
        pen.forward(i);
    }
    for (int i = 20; i<= 1; i++){
      pen.down();
      pen.turnLeft(7);
      pen.forward(i);
    }
    for (int i = 20; i<= 30; i++){
        pen.down();
        pen.turnLeft(8);
        pen.forward(i);
    }
    for (int i = 10; i<= 20.5; i++){
      pen.down();
      pen.turnLeft(13);
      pen.forward(i);
    }
    pen.setDirection(90);
    pen.turnLeft(90);
    pen.forward(70);
    pen.up();
    pen.turnRight(180);
    pen.forward(70);
    pen.down();
    pen.forward(90);
    
    //K
    pen.up();
    pen.forward(50);
    pen.down();
    pen.turnLeft(90);
    pen.forward(215);
    pen.turnRight(180);
    pen.forward(350);
    pen.turnLeft(180);
    pen.forward(190);
    pen.turnRight(45);
    pen.forward(215);
    pen.turnLeft(180);
    pen.forward(215);
    pen.turnLeft(90);
    pen.forward(245);
    pen.up();
    pen.turnLeft(180);
    pen.forward(170);
    pen.turnRight(135);
    pen.forward(200);

    //F
    pen.down();
    pen.turnLeft(90);
    pen.forward(215);
    pen.turnRight(180);
    pen.forward(350);
    pen.turnLeft(180);
    pen.forward(190);
    pen.turnRight(90);
    pen.forward(150);
    pen.turnLeft(180);
    pen.forward(150);
    pen.turnRight(90);
    pen.forward(160);
    pen.turnRight(90);
    pen.forward(200);
  






  }
}