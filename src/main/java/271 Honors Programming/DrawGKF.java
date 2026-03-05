import apcslib.*;
import java.awt.Color;

public class DrawGKF
{
  
  public static void main(String[] args)
  {
    DrawingTool pen;
    SketchPad paper;

    paper = new SketchPad(1000, 700);
    pen = new DrawingTool(paper);

	// draw the square for the house
	pen.setWidth(2);
	pen.up();
	pen.setColor(Color.DARK_GRAY);
	pen.move(-400, -140);
	pen.down();
	pen.move(-400,140);
	pen.move(-120,140);
	pen.move(-120,-140);
	pen.move(-400,-140);
	pen.up();
	pen.move(-260, 0);
	pen.down();
	pen.fillRect(280, 280);
	pen.up();

	// enter code here to draw the other requirements for the house

	//Roof
	pen.setColor(Color.GRAY);
	pen.move(-120, 140);
	pen.down();
	pen.move(-260, 300);
	pen.move(-400, 140);
	pen.up();
	//Right Window
	pen.setColor(Color.CYAN);
	pen.move(-180, 5);
	pen.down();
	pen.fillRect(80, 70);
	pen.setColor(Color.BLACK);
	pen.up();
	pen.move(-140, 40);
	pen.down();
	pen.move(-220, 40);
	pen.move(-220, -30);
	pen.move(-140, -30);
	pen.move(-140, 40);
	pen.up();
	//Left Window
	pen.setColor(Color.CYAN);
	pen.move(-340, 5);
	pen.down();
	pen.fillRect(80, 70);
	pen.up();
	pen.setColor(Color.BLACK);
	pen.move(-300, 40);
	pen.down();
	pen.move(-380, 40);
	pen.move(-380, -30);
	pen.move(-300, -30);
	pen.move(-300, 40);
	pen.up();
	//Door
	pen.setColor(Color.GRAY);
	pen.move(-260, -100);
	pen.down();
	pen.fillRect(60, 80);
	pen.up();
	pen.setColor(Color.BLACK);
	pen.move(-230, -140);
	pen.down();
	pen.move(-230, -60);
	pen.move(-290, -60);
	pen.move(-290, -140);
	pen.up();
	//Doorknob
	pen.move(-240, -100);
	pen.down();
	pen.drawCircle(2);
	pen.up();
	//Right Window Cross
	pen.move(-220, 5);
	pen.down();
	pen.move(-140, 5);
	pen.up();
	pen.move(-180, 40);
	pen.down();
	pen.move(-180, -30);
	pen.up();
	//Left Window Cross
	pen.move(-340, 40);
	pen.down();
	pen.move(-340, -30);
	pen.up();
	pen.move(-380, 5);
	pen.down();
	pen.move(-300, 5);
	pen.up();
	//Chimney
	pen.move(-150, 175);
	pen.down();
	pen.move(-150, 290);
	pen.move(-190, 290);
	pen.move(-190, 220);





	// draw the circle for the smiley

	pen.up();
	pen.setColor(Color. YELLOW);
	pen.move(300, 0);
	pen.down();
	pen.drawCircle(160);
	pen.fillOval(320, 320);
	pen.up();

	// enter code here to draw the other requirements for the smiley

	//Left Eye
	pen.setColor(Color.BLACK);
	pen.move(240, 60);
	pen.down();
	pen.drawCircle(25);
	pen.fillOval(20, 20);
	pen.up();
	//Right Eye
	pen.move(360, 60);
	pen.down();
	pen.drawCircle(25);
	pen.fillOval(20, 20);
	pen.up();
	//Nose
	pen.move(300, 10);
	pen.down();
	pen.move(280, -20);
	pen.move(300, -20);
	pen.up();
	//Mouth
	pen.move(200, -60);
	pen.down();
	pen.move(240, -100);
	pen.move(350, -100);
	pen.move(390, -60);
	pen.up();
	//Tophat
	pen.move(300, 210);
	pen.down();
	pen.fillRect(220, 180);
	pen.up();
	pen.move(130, 120);
	pen.down();
	pen.move(470, 120);
	pen.up();
	pen.move(190, 120);
	pen.down();
	pen.move(190, 300);
	pen.move(410, 300);
	pen.move(410, 120);
	//Bowtie
	pen.up();
	pen.move(300, -160);
	pen.down();
	pen.move(440, -120);
	pen.move(440, -220);
	pen.move(300, -160);
	pen.move(160, -120);
	pen.move(160, -220);
	pen.move(300, -160);
	//Name
	pen.up();
	pen.move(0, 0);
	pen.drawString("Griffin Fitze");

  }
}

