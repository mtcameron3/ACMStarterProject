import acm.program.*;

public class DigitSum extends ConsoleProgram {
	
	public void run() {
		
		int i = readInt("Enter an integer: ");
		int reversedNumber = 0;
		int Number = 0;
		while (i != 0) {
			reversedNumber = (reversedNumber + Number) * 10;
			Number = i % 10;
			i /= 10;
			
		}
		reversedNumber += Number;
		println("Reversed Number is: " + reversedNumber);
		
	}
}
