package lab7;

class Static{
	static int i = 7;
}
class Incrementable {
	static void increment() { Static.i++; }
}
public class Incremble {
	public static void main(String[] args) {
	System.out.println("Static.i= " + Static.i);
	Static st1 = new Static();
	Static st2 = new Static();
	System.out.println("st1.i= " + st1.i);
	System.out.println("st2.i= " + st2.i);
	Incrementable sf = new Incrementable();
	sf.increment();
	System.out.println("After sf.increment() called: ");
	System.out.println("st1.i = " + st1.i);
	System.out.println("st2.i = " + st2.i);
	Incrementable.increment();
	System.out.println("After Incrementable.increment called: ");
	System.out.println("st1.i = " + st1.i);
	System.out.println("st2.i = " + st2.i);
	}
}
