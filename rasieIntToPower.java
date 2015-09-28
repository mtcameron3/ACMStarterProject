import acm.program.*;

public class rasieIntToPower extends ConsoleProgram {

	public void run() {
		double n = 2;
		double k = 10;
		raiseInt(n,k);
	}
	
	
	
	
	private int raiseInt(double n, double k) {
		
		for (int i = 0; i <= k; i++) {
			println(n + " raised to " + i + " = " + Math.pow(n,i));
			
			
			
		}
		
		return 0;
	}
}
