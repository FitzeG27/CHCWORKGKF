package Shapes;
import TurtleGraphics.Pen;
public class Triangle implements Shape {
    
    private double X1pos, Y1pos;
    private double X2pos, Y2pos;
    private double X3pos, Y3pos;

    public Triangle(){
        X1pos = 0;
        Y1pos = 0;
        X2pos = 0;
        Y2pos = 0;
        X3pos = 0;
        Y3pos = 0;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        X1pos = x1;
        Y1pos = y1;
        X2pos = x2;
        Y2pos = y2;
        X3pos = x3;
        Y3pos = y3;
    }


    public double area(){
        double side1 = Math.hypot(X2pos - X1pos, Y2pos - Y1pos);
        double side2 = Math.hypot(X3pos - X1pos, Y3pos - X1pos);
        return .5*side1*side2;
    }

    public double perimeter(){
        double side1 = Math.hypot(X2pos - X1pos, Y2pos - Y1pos);
        double side2 = Math.hypot(X3pos - X1pos, Y3pos - X1pos);
        double side3 = Math.hypot(X2pos - X3pos, Y2pos - Y3pos);
        return side1 + side2 + side3;
    }

    public void draw(Pen p){
        p.up();
        p.move(X1pos, Y1pos);
        p.down();
        p.move(X2pos, Y2pos);
        p.move(X3pos, Y3pos);
        p.move(X1pos, Y1pos);
        p.up();
    }

    public double getXPos(){
        return X1pos;
    }

    public double getYPos(){
        return Y1pos;
    }

    public void move(double xloc, double yloc){
        X1pos = xloc;
        Y1pos = yloc;
    }

    public void stretchBy(double f){
        X1pos *= f;
        X2pos *= f;
        X3pos *= f;
        Y1pos *= f;
        Y2pos *= f;
        Y3pos *= f;
    }

    public String toString(){
        return "Point 1 Coordinates: (" + X1pos + ", " + Y1pos + ")\n"
        + "Point 2 Coordinates: (" + X2pos + ", " + Y2pos + ")\n"
        + "Point 3 Coordinates: (" + X3pos + ", " + Y3pos + ")";
    }


}
