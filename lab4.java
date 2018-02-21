import java.util.*; 
import org.greggordon.tools.*;

public class Coin {
	public static void main(String[] args) {
		Random rand = new Random();
		int coin = rand.nextInt();
		if(coin % 2 == 0) P.rintln("Orel");
		else P.rintln("Reshka");		
	}
}