public class DataOonly {		
	public static void main(String[] args) {
		class DataOnly {
			int i;
			double d;
			boolean b;
			void f() {
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);	
			}
		}	
		DataOnly d = new DataOnly();
		d.i = 895;
		d.d = 2.1545;
		d.b = false;		
		d.f();
	}
}