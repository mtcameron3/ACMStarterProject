/* MyProgram.java
 * --------------
 * Modify this file any way you like (or create additional files in
 * the ACMStarterProject) in order to experiment with the capabilities
 * of the ACM libraries.
 * 
 * NOTE: While you are free to do whatever you like with this project,
 * it is still best to use the assignment-specific starter files
 * for actual assignments.
 */


import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class MyProgram extends GraphicsProgram {
	
	public void run() {
		GRect rect = new GRect(100, 300, 300, 200);
		rect.setFilled(true);
		rect.setColor(Color.BLUE);
		add(rect);
		
		GRect windowL = new GRect(130, 375, 50, 50);
		windowL.setFilled(true);
		windowL.setColor(Color.YELLOW);
		add(windowL);
		
		GRect windowR = new GRect(330, 375, 50, 50);
		windowR.setFilled(true);
		windowR.setColor(Color.YELLOW);
		add(windowR);
		
		add(new GLine(250, 150, 400, 300));
		add(new GLine(250, 150, 100, 300));
	}
	
}