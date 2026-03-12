package Shapes;


import TurtleGraphics.Pen;

public class Circle extends AbstractShape {

   protected double radius;

   public Circle() {
      super();
      radius = 1;
   }

   public Circle (double xLoc, double yLoc, double r) {
      super(xLoc, yLoc);
      radius = r;
   }

   @Override
   public double area() {
      return Math.PI * radius * radius;
   }

   @Override
   public double perimeter() {
      return 2*Math.PI * radius;
   }

   @Override
   public void draw (Pen p) {
      double side = 2.0 * Math.PI * radius / 120.0;
      p.up();
      p.move (xPos + radius, yPos - side / 2.0);
      p.setDirection (90);
      p.down();
      for (int i = 0; i < 120; i++){
         p.move (side);
         p.turn (3);
      }
   }

   @Override
   public void stretchBy (double factor) {
      radius *= factor;
   }
   @Override
   public String toString() {
      return "CIRCLE:\n" + super.toString();
   }
}

