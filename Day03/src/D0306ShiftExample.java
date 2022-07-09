/** 시프트연산 (Shift)
 * 
 *  << 좌측shift:값을 좌측으로 이동 (뒤 빈 칸은 0으로 채움):   1<<3 -> 이진수 0001을 3만큼 왼쪽으로 이동 -> 이진수 1XXX -> 이진수 1000
 *  >> 우측shift: 값을 우측으로 이동  (앞 상위비트를 부호비트(양수0 음수1)로 채움): 
 *  >>> 우측shift: 값을 우측으로 이동 (앞 상위비트를 무조건 0으로 채움): 
 *  
 */

public class D0306ShiftExample {
    
	public static void main(String[] args) {
		
		// Left shift (<<)
		int x = 2;
		x = x << 3;
		System.out.println("x << 3 = " + x);
		System.out.println(Integer.toBinaryString(x));
		
		int y = 3;
		y = y << 2;
		System.out.println("y << 2 = " + y);
		System.out.println(Integer.toBinaryString(y));
		System.out.println("\n");
		
		
		// Right shift (>>)
		x = -1;
		System.out.println(Integer.toBinaryString(x));
		
		x = x >> 10;
		System.out.println("x >> 10 = " + x);
		System.out.println(Integer.toBinaryString(x));
		System.out.println("\n");
		
		x = -100;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 3;
		System.out.println("x >> 3 = " + x);
		System.out.println(Integer.toBinaryString(x));    // 뒤 2개 자르고 앞에 부호비트(음수1)로 2개 채움
		System.out.println("\n");    
		
		x = 100;
		System.out.println(Integer.toBinaryString(x));
		x = x >> 3;
		System.out.println("x >> 3 = " + x);    
		System.out.println(Integer.toBinaryString(x));    // 뒤 2개 자르고 앞에 부호비트(양수0)으로 2개 채움
		System.out.println("\n");   
		
		
		// Right shift (>>>)
		x = -1;
		System.out.println(Integer.toBinaryString(x));
		x = x >>> 3;
		System.out.println("x >>> 3 = " +x);
		System.out.println(Integer.toBinaryString(x));
				
		
		
	}

}
