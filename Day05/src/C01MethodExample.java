/**  << 매소드 >>
 * 
 * 1) 특징: 절차지향언어에서는 '함수',                   cf. 클래스(대문자시작) /변수(소문자시작) /상수(모두대문자)
 *         매소드 명은 변수랑 규칙이 같음(소문자시작) 
 *      
 * 2) 형태: 매소드명();
 *         ex. System.out.println(); 에서 System은 클래스, out은 변수, println();은 매소드
 *      
 *      
 *      
 * 3) 사용하는 이유: 매소드 = 행위(행동)*
 *         (1) 반복업무 줄이기*
 *         (2) 객체지향언어에서는 행동(변수에 값을 넣거나 더하는 일)은 매소드만 가능 
 *     
 * 4) 매소드 작성 문법: 
 *         [접근한정자] [static/non-static] 리턴타입 매소드명 (매개변수) {                   // 이때 리턴타입, 매소드명, 매개변수는 필수작성 (그 외는 옵션)
 *             ... 매소드 행동 정의부
 *         }
 *      
 *      
 *         매서드명은 영어 소문자 시작, 두 단어 이상시 두번째 단어부터 첫 문자 대문자
 *         변수와 매서드 구분은 ()로 함 (없으면 변수, 있으면 매소드)     
 *      
 *      
 * 
 *      
 * 5) 종류: (1) 리턴타입(값 돌려줌 => 결과값 사용) / 보이드타입(값 안돌려줌 => 연산 등 행위만 하고 끝내고 결과값 재사용하지 않음)            
 *             리턴타입 - int, byte 등등 ex. byte[] getBytes(); 에서 byte가 돌려주는 값의 데이터 타입
 *      
 *         (2) 매개변수 있음 / 매개변수 없음
 *             매개변수 ex. add(1,2,3); 에서 1,2,3이 매개변수
 *             
 *         (3) static에 있는것 / heap에 있는 것(non-static) 
 *             heap에 있는 것을 사용할 때는 new 키워드를 통해 heap에 "객체생성"을 한 뒤 사용  (new를 쓰면 모두 heap으로 감)
 *             static에 있는 건         클래스명.변수명     이렇게 사용
 *             
 *         (4) 생성자 또한 매소드임 (리턴타입 없음)
 *             이름은 무조건 클래스명과 동일해야 함   (생성자는 매소드지만 대문자시작, 생성자 외의 매소드는 모두 소문자시작) **
 * 
 * 
 */


public class C01MethodExample {
	
	
	public static int add ( int x, int y ) {                // add() -> 매소드
		return x + y;                                       // => 리턴타입(값 돌려주는 매소드)      or int z = x + y;   return z;       => add라는 매서드 이름으로 x+y를 쓰겠다 선언
	}
	
	public static void printAddValue(int x , int y ) {      // => 보이드타입(값 안돌려주는 매소드)
		int z = x + y;
		System.out.println(z);
	}
	
	
	static void printMyName() {                             // => 매개변수 없는 경우
		System.out.println("gg");

	}
	

	
	
	public static void main(String[] args) {  
		
		int a = 10;
		int b = 20;
		int c = add(10, 20);           // =>add라는 함수를 위에서 정의하고 여기서 사용하는 것 (원래는 int c = a+b; 로 정의)
	    printAddValue(a, b);
		
	    printMyName(); 
		
		
		
	}
	

}
