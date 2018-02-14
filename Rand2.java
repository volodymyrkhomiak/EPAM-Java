
import static net.mindview.util.Print.*;

import java.util.Random;

public class Rand2 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		for(int i = 0; i < 25; i++) {
			int a = rand1.nextInt();
			int b = rand2.nextInt();
			if(a < b)print(b +" < "+a);
			else if(a > b)print(a +" > "+b);
			else print(a + " = " + b);
		}
		Random rand3 = new Random();
		Random rand4 = new Random();
		for(int i = 0; i < 25; i++) {
			int a = rand3.nextInt(10);
			int b = rand4.nextInt(10);
			if(a < b) print(a + " < " + b);
			else if(a > b) print(a + " > " + b);
			else print(a + " = " + b);
		}
	}
}