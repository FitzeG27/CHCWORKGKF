package Shapes;
import TurtleGraphics.Pen;
public class RightTriangle implements Shape {
    
    private double height;
    private double width;
    private double xCoordinate, yCoordinate;

    public RightTriangle(){
        height = 1;
        width = 1;
        xCoordinate = 0;
        yCoordinate = 0;
    }

    public RightTriangle(double h, double w, double x, double y){
        height = h;
        width = w;
        xCoordinate = x;
        yCoordinate = y;
    }
    @Override
    public double area(){
        return .5*height*width;
    }
    @Override
    public double perimeter(){
        return height + width + Math.hypot(width, height);
    }
    @Override
    public void draw(Pen p){
        p.up();
        p.move(xCoordinate, yCoordinate);
        p.down();
        p.move(xCoordinate+width, yCoordinate);
        p.move(xCoordinate, yCoordinate+height);
        p.move(xCoordinate, yCoordinate);
        p.up();
    }
    @Override
    public double getXPos(){
        return xCoordinate;
    }
    @Override
    public double getYPos(){
        return yCoordinate;
    }
    @Override
    public void move(double xloc, double yloc){
        xCoordinate = xloc;
        yCoordinate = yloc;
    }
    @Override
    public void stretchBy(double f){
        height*=f;
        width*=width;
    }
    @Override
    public String toString(){
        return "Height: " + height +
        "\nWidth: " + width +
        "\nHypotenuse: " + Math.hypot(width, height) +
        "\nCoordinates: (" + xCoordinate + ", " + yCoordinate + ")"; 
    }


}
