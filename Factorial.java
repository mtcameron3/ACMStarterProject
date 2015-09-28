import acm.program.*;

public class Factorial extends ConsoleProgram {

	public void run() {
		int result = 0;
		for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
			println(i + "! = " + factorial(i, result));
		}
	}


	private int factorial(int n, int t) {
		
		for (int i = 1; i <= n; i++) {
			t *= i;
		}
		return(t);
	}
	
	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 20;
}

