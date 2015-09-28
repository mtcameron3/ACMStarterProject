import acm.program.*;

public class Prime extends ConsoleProgram {

	public void run() {
		
		double q = readDouble("Enter your number: ");
		isPrime(q);
		
		
	}
	
	
	private boolean isPrime(double n) {
		boolean answer = false;
		double o = 0;
		println("Work");
		double i = n;
		while(i > 2 && answer == false){
			i--;
			o = n % i;
			//println(n + " / " + i + answer + o);
			if(o == 0) {
				answer = true;
				break;
			}	
			
		}
		println(answer);
		return answer;
		
		
		
	}
}
