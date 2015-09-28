import acm.graphics.*;
import acm.program.*;


public class combinationsFunction extends GraphicsProgram {

	public void run() {
		double x = 150;
		double y = 150;
		double x2 = 300;
		double y2 = 300;
		double size = 150;
		double size2 = 150;
		drawaSquare(50,50,500,300);
		
		
		
		drawaSquare(150,150,500,300);
		drawaSquare(50,50,500,300);
		drawaSquare(50,50,500,300);
		
		
		}
		
		
	
	private int drawingSquares()
	drawaSquare(squarex,squarey,500,300);
	
	private int drawaSquare(double x, double y, double size, double size2) {
		drawaLine(x, y, (x + size), y);
		drawaLine((x + size),y,(x + size),(y + size2));
		drawaLine((x + size),(y + size2),x,(y + size2));
		drawaLine(x,y,x,(y + size2));
		return 0;	
		}

	private int drawaLine(double x, double y, double xDistance, double yDistance) {
		add(new GLine(x, y, xDistance, yDistance));
		return(0);
	}

}
