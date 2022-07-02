
public class VariableLec01 { // 클래스 선언부
	
	public static void main(String[] args) { //자바 어플리케이션 스타팅 포인트
	  
	   System.out.println("Hello Var!");
	   
	  
	   int score = 10;
	   System.out.println(score);
	   
	 // 1. 변수명은 영어, 숫자, 특수문자
	   int age; //변수 시작은 소문자 원칙* 
	   int student4Age; //숫자 가능
	   int $_age; //특수문자 가능 ($, _ only)
	   
	 // 2. 변수명은 숫자 시작 불가
	 //  int 4age; // 컴파일 에러 발생
	   
	 // 3. 공백 사용 불가
	 //  int a ge; // 에러. 대신 aGe(주로사용) 혹은 a_ge 등으로 사용 
	   
	 // 4. 대소문자 구분
	   int studentage;
	   int studentAge; // 위 변수와 구분되어 새 변수로 사용가능
	 //  int studentAge; // 중복
	   
	 // 5. 예약어(보라색글씨)는 변수명으로 불가
	 //  int static;
	   
	   
	 // char 사용해보기
	   char alpha = 65;
	   System.out.println((int)alpha + "=" + alpha); 
	  
	   
	   for(char i=65; i<=90; i++) {
		   System.out.println(i + "=" + (int)i);
	   }
	   
	   
	}
	
}
