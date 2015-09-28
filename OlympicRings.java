import acm.program.*;
import acm.graphics.*;
import java.awt.*;


public class OlympicRings extends GraphicsProgram {
	public void run() {

		GOval oval1 = new GOval(100,100,50,50);
				oval1.setColor(Color.BLUE);
				add(oval1);
				
				GOval oval2 = new GOval(160,100,50,50);
				oval2.setColor(Color.BLACK);
				add(oval2);
				
				GOval oval3 = new GOval(220,100,50,50);
				oval3.setColor(Color.RED);
				add(oval3);
				
				
				GOval oval4 = new GOval(130,130,50,50);
				oval4.setColor(Color.YELLOW);
				add(oval4);
				
				
				GOval oval5 = new GOval(190,130,50,50);
				oval5.setColor(Color.GREEN);
				add(oval5);		
		
	}



}
