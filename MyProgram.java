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


import acm.program.*;

/* This part of the program allows the user to enter
 * two numbers to be multiplied and then divided by
 * the number two.  It will then print the answer.
 */


public class MyProgram extends ConsoleProgram {
	public void run(){
		double b = readDouble("enter b: ");
		double h = readDouble("enter h: ");
		double a = (b * h) / 2;
		println("a = " + a);
	}
}