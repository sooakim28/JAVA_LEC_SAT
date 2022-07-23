/** 
 * 산술연산
 *  성질: 기본적으로는 이항연산   
 *  형태: x 연산자 y = 
 *       + - /(나누기) *(곱하기) %(나머지연산; 나머지가 몇임?) 사용
 *
 *
 *
 *
 */


public class C00MathExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
	
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));  //곱하기
		System.out.println("x / y = " + (x / y));  //나누기
		
		System.out.println("x // 10.1 = " + (x / 10.1));  // 10.1이 double로 설정되고, 둘 이상 있을 땐 큰 값을 따름
		
		System.out.println(10*20*30*0.1); // 자료형 double   - 소수점 있ㅇ음
		System.out.println(10*20*0.1*30); // 자료형 double   - 소수점 있음
		
		System.out.println(11%10);  
		System.out.println(10%2); // 나머지연산 (11에서 10을 나눴을 때 나머지 값이 얼마?)
		
		System.out.println("나의 집은 시흥대로 " + 100 + 52 + "길 입니다."); // 처음 시작하는 자료형이 문자형으로 시작되므로 그 설정으로 함
		System.out.println("나의 집은 시흥대로 " + (100 + 52) + "길 입니다."); // 
		
		
		int a = 10;
		int b = 4;
		//System.out.println("10 / 4 = " +a - b)
		
		
		
		
		System.out.println("\n");		
		float A = 10;
		float B = 11;
	
		System.out.println("a / b = " + (A / B));  //나누기
		
		
		
		
		
	}

}
