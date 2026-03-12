package Shapes;

import TurtleGraphics.Pen;

public class Rect extends AbstractShape {

   private double height, width;

   public Rect() {
      xPos = 0;
      yPos = 0;
      height = 1;
      width = 1;
   }

   public Rect (double xLoc, double yLoc, double h, double w) {
      xPos = xLoc;
      yPos = yLoc;
      height = h;
      width = w;
   }
 
   @Override
   public double area() {
      return height * width;
   }
 
   @Override
  public double perimeter() {
      return 2 * height + 2 * width;
   }

   @Override
   public void draw (Pen p) {
      p.up();
      p.move (xPos, yPos);
      p.down();
      p.setDirection (0); p.move (width);
      p.turn (-90); p.move (height);
      p.turn (-90); p.move (width);
      p.turn (-90); p.move (height);
   }

   @Override
   public void stretchBy (double factor) {
      height *= factor;
      width *= factor;
   }

   @Override
   public String toString() {
      return "RECTANGLE:\n" + super.toString();
   }
}

