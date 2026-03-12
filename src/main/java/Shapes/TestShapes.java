package Shapes;

import java.awt.Color;
import java.util.ArrayList;

import TerminalIO.KeyboardReader;
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class TestShapes {
   public static void main (String[] args) {

      // Declare and instantiate a pen, a circle and a rectangle
      ArrayList<Shape> shapes = new ArrayList<>();
      Pen p = new StandardPen();
      Shape s1 = new Circle (20, 20, 20);
      Shape s2 = new Rect (-20, -20, 10, 20);
      Shape s3 = new RightTriangle(10, 20, -20, -100);
      Shape s4 = new Wheel(-50, 20, 10, 20);
      
      // Draw the circle and rectangle
      shapes.add(s1);
      shapes.add(s2);
      shapes.add(s3);
      shapes.add(s4);

      for (Shape s : shapes){
         s.draw(p);
         System.out.println(s);
      }
      
      // Pause until the user is ready to continue
      KeyboardReader reader = new KeyboardReader();
      reader.pause();
      
      // Erase the circle and rectangle
      p.setColor (Color.white);
      s1.draw (p);
      s2.draw (p);
      p.setColor (Color.red);
      
      // Move the circle and rectangle, change their size, and redraw
      s1.move (30, 30);           s2.move (-30, -30);
      s1.stretchBy (2);           s2.stretchBy (2);
      s1.draw (p);                s2.draw (p);
   }
}

