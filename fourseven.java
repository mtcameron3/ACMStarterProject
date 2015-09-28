import acm.program.*;

public class fourseven extends ConsoleProgram {
	
	public void run() {
	int n = readInt("Enter your number: ");
	int total = 0;
	int i = 0;
	int represent = 0;
	
		do {
	        while (n > 0) {
	        	represent = n % 10;
	            total = total + (n % 10);
	            
	          
	            println("Print value = " + total + " Print number current value = " + represent);
	            n = (n / 10);
	        }
	        n = total;
	        total = 0;
	    } while (n > 9);
		println("Root Digit = " + n);
	}

}
