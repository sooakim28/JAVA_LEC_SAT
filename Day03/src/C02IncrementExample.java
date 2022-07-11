/** 
 * <  증감연산 (대표적인 단항연산)  >
 * 종류: ++, --
 *      => ++x, x++
 *         --y, y--
 *         (+=, -=와 유사)
 * 예시: ++x -> x = x + 1;
 *      ++y -> y = y + 1;
 *      --x -> x = x - 1;
 *      --y -> y = y - 1;
 *       
 *
 */
public class C02IncrementExample {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		
		//증감연산자의 전위,후위 수식 (뜻은 동일)
		++a; // 전위연산: 피연산자 앞에 연산자 => 변수에 1증가시킨 후 다른연산 실행 (만나자마자 +1)
		a++; // 후위연산: 연산자 앞에 피연산자 => 다른연산 실행 후 1증가 (그 다음 행에서 +1), 많이 사용
		
		a = 100;
		System.out.println("++a =" + ++a);
		System.out.println("a++ =" + a++);
		
		int b;
		b = 100;
		System.out.println("b++ =" + b++); // 이 다음 행에서 +1하므로, 100이 표시되지만 뒤에 또 연산시 이 값은 101이 됨
		System.out.println("b++ =" + b++);
		System.out.println(b);
	

		
		System.out.println("b++ =" + b++);
		System.out.println("++b =" + ++b);

		
	}
	
	
}
