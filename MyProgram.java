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
		
		GOval oval02 = new GOval(315, 115, 70, 70);
		oval02.setFilled(true);
		oval02.setFillColor(Color.WHITE);
		add(oval02);
		
		GOval oval03 = new GOval(335, 125, 30, 30);
		oval03.setFilled(true);
		oval03.setFillColor(Color.RED);
		add(oval03);
		
	}
	
}