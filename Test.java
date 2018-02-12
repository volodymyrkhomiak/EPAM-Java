package lab19;
import java.util.*; 

public class Test {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		if(coin % 2 == 0) P.rintln("heads");
		else P.rintln("tails");		
	}
}
