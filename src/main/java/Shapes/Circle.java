package Shapes;


import TurtleGraphics.Pen;

public class Circle implements Shape {

   protected double xPos, yPos;
   protected double radius;

   public Circle() {
      xPos = 0;
      yPos = 0;
      radius = 1;
   }

   public Circle (double xLoc, double yLoc, double r) {
      xPos = xLoc;
      yPos = yLoc;
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
   public double getXPos() {
      return xPos;
   }
   @Override
   public double getYPos() {
      return yPos;
   }
   @Override
   public void move (double xLoc, double yLoc) {
      xPos = xLoc;
      yPos = yLoc;
   }
   @Override
   public void stretchBy (double factor) {
      radius *= factor;
   }
   @Override
   public String toString() {
      return "CIRCLE"
      +"\nRadius: " + radius + "\n"
      + "(X,Y) Position: (" + xPos + "," + yPos + ")\n" 
      + "Area: " + area()+"\n"
		+ "Perimeter: " + perimeter();
   }
}

