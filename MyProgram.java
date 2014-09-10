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
		
		GRect rect = new GRect(120, 50, 50, 100);
		rect.setFilled(true);
		rect.setColor(Color.WHITE);
		add(rect);
		
		add(new GLine(250, 150, 400, 300));
		add(new GLine(250, 150, 100, 300));
	}
	
}