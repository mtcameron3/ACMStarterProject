import acm.program.*;

public class CountDigit extends ConsoleProgram {

	
	public void run() {
		
		int n = readInt("Enter your number: ");
		countDigits(n);
		
	}
	
	
	
	
	private int countDigits(int n) {
		int i = 0;
		while (n > 0) {
			i++;
			n /= 10;
		}
		println(i + " digits");
		
		return(0);
	}
}
