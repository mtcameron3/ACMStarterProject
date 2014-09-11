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
		GRect head = new GRect(300, 150, 150, 250);
		head.setFilled(true);
		head.setColor(Color.MAGENTA);
		add(head);
		
		GRect mouth = new GRect(315, 365, 120, 15);
		mouth.setFilled(true);
		mouth.setColor(Color.YELLOW);
		add(mouth);
		
		GRect Nose = new GRect(365, 300, 20, 15);
		Nose.setFilled(true);
		Nose.setColor(Color.YELLOW);
		add(Nose);
		
	}
}

