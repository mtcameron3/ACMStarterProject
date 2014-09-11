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
		GOval oval01 = new GOval(300, 100, 100, 100);
		oval01.setFilled(true);
		oval01.setFillColor(Color.RED);
		add(oval01);
		
		GOval oval02 = new GOval(310, 110, 80, 80);
		oval02.setFilled(true);
		oval02.setFillColor(Color.WHITE);
		add(oval02);
		
	}
	
}