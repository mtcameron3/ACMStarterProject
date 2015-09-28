import acm.program.*;




public class Fibonacci extends ConsoleProgram {

	public void run() {
		
	int n = 4;
	fibonacci(n);
		
		
		
			
		
			
	}
	
	

	private int fibonacci(int n) {
	int fib1 = 0; 
	int fib2 = 0;
	int fibonacci = 0;
	
	for (int i = 0; i < n; i++) {
		fibonacci = fib1 + fib2;
		fib2 = fib1;
		fib1 = fibonacci;
		if (i == 2) {
			fibonacci = 1;
			fib2 = 1;
			fib1 = 1;
		}
		
	}

	println("Fibonacci sequence "  + (n-1) + " is " + fibonacci);
	
	return 0;
		
	}
	
}
