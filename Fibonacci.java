
public class Fibonacci {
	public static void main(String[] args) {
		for(int i = 1; i < 1000; i++ ) {
			int factors = 0;
			for(int j = 1; j < (i + 2)/2; j++ ) {
				if((i % j) == 0) factors++; 			
			}
			if(factors < 2) System.out.println(i + " yo");
		}
	}
}