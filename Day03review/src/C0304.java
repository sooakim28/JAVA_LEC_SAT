
public class C0304 {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println( a > b);
		System.out.println( a >= b );
		
		System.out.println ( a == b );
		System.out.println ( a != b );
		System.out.println("\n");
		
		boolean c = a == b;
		System.out.println(c);
		boolean d = a != b;
		System.out.println(d);
		boolean e = a >= b;
		System.out.println(e);
		System.out.println("\n");
		
		
		
		
		System.out.println( a + b >= a && a == 10);
		System.out.println( a + b >= a && a != 10);
		
		System.out.println( a + b >= a || a != 10);
		
		System.out.println( a + b >= a ^ a == 10);
		System.out.println( a + b >= a ^ a != 10);
		
		
	}
	


}
