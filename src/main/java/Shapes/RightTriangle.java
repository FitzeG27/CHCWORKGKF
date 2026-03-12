package Shapes;
import TurtleGraphics.Pen;
public class RightTriangle extends AbstractShape {
    
    private double height;
    private double width;

    public RightTriangle(){
        super();
        height = 1;
        width = 1;
    }

    public RightTriangle(double h, double w, double x, double y){
        super(x, y);
        height = h;
        width = w;
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
        p.move(xPos, yPos);
        p.down();
        p.move(xPos+width, yPos);
        p.move(xPos, yPos+height);
        p.move(xPos, yPos);
        p.up();
    }
    
    @Override
    public void stretchBy(double f){
        height*=f;
        width*=width;
    }
    @Override
    public String toString(){
        return "Right Triangle:\n" + 
        super.toString() +
        "\nHeight: " + height +
        "\nWidth: " + width +
        "\nHypotenuse: " + Math.hypot(width, height);
    }


}
