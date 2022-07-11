
public class C04LogicalExmaple {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 11;
		int c = 15;
		int d = 3;
		
		boolean result = a > b;
		result = result && c > d;    // result = false && true;  => 결과적으로는 false
		
		// And연산은 두 항이 모두 참일때만 참  (자주 씀)
		result = true && true; // 이때만 참
		
		// Or 연산은 두 항 중 하나만 참이어도 참  (자주 씀)
		result = false || true;
		System.out.println("false || true = " + result);
		result = true || false;
		System.out.println("true || false = " + result);
		result = true || true;
		System.out.println("true || true = " + result);
		
		
		// XOR 연산은 두 항 중 하나만 참일때만 참
		result = true ^ false;
		System.out.println("true ^ false = " + result);
		result = false ^ true; 
		System.out.println("false ^ true = " + result);
		result = true ^ true;
		System.out.println("true ^ true = " + result);
		
		
		// !는 반대이므로 !true-> false, !false->true
		result = false;
		System.out.println("!result = " +!result);
		System.out.println(!(10 > 1));
		
		// quiz: AND, OR연산
		int x = 10;
		int y = 20;
		
		result = (x * 100 > y * 100) && (++x > ++ y);  // &&: 앞의 연산이 틀리면 뒤 연산을 수행하지 않음 (답이 이미 거짓이므로)
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result = (x * 100 > y * 100) & (++x > ++ y);  // &: 앞의 연산이 틀려도 뒤 연산을 수행
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result = (x * 100 < y * 100 || (++x > ++y));  // 앞의 연산이 참이면 뒤 연산을 수행하지 않음 (답이 이미 참이므로) *
		System.out.println(result);
		
		
		// AND 연산2    ( x = 11, y = 21 )
		result = (x < y) && (x++ > y--); 
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		//             ( x = 12, y = 20)
		result = ( x > y) || (x++ < y--);
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		

		
		
		

		
	}
}


