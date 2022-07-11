
public class C0507 {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		System.out.println(Integer.toBinaryString(a));   // 0010
		System.out.println(Integer.toBinaryString(b));   // 0011
		
		
		System.out.println( a & b );   // true true true false 
		System.out.println( a | b );   // true true true true
		System.out.println( a ^ b );   // false false false true
		
		System.out.println( Integer.toBinaryString(a & b) ); 
		System.out.println("\n");
		
		
		a = 100;
		System.out.println(Integer.toBinaryString(a));
		
		a = 100;
		a = a << 2;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		a =100;
		a = a >> 2;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		a = 100;
		a = a >>> 2;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println("\n");
		
		
		
		b = -100;
		System.out.println(Integer.toBinaryString(b));
		
		b = -100;
		b = b << 2;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		
		b = -100;
		b = b >> 2;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		
		b = -100;
		b = b >>> 2;
		System.out.println(b);
		System.out.println(Integer.toBinaryString(b));
		System.out.println("\n");
		
		
		
		
		

		int gainedP = 80; 
		int passP = 90;
		int pass = 1;
		
		pass = gainedP >= passP ? 1 : 0;
		
		
		
		System.out.println();
		
		
		
		
		
	}

}
