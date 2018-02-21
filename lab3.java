import static net.mindview.util.Print.*;

class lab3 {
	float a;
}

public class PassObject2 {
	static void f(lab3 y) {
		y.a = 2.71828f;
	}
	public static void main(String[] args) {
		lab3 x = new lab3();
		x.a = 3.1416f;
		print("1: x.a = " + x.a);
		f(x);	
		print("2: x.a = " + x.a);
	}
}