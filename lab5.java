
import org.greggordon.tools.*;

public class RightShiftTest2 
{
	public static void main(String [] args) 
	{
int k = -1;
P.rintln(Integer.toBinaryString(k));
k <<= 10;
P.rintln(Integer.toBinaryString(k));
for(int i = 0; i < 32; i++) 
		{
k >>>= 1;
P.rintln(Integer.toBinaryString(k));
		}
	}
}