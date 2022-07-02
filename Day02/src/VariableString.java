
public class VariableString {
	
	public static void main(String args[]) {

		char alpha = '이';  // 문자형은 '' single quotation 사용, char 기본 데이터 타입
		String name = "이종석";  // 문자열은 "" double quotation 사용, 참조 데이터 타입
		                     
		System.out.println("나의 이름은 " + name + "입니다.");
		
		name = "   ";
		name = "";       // 숫자건 문자건 실수건 "" 로 감싸져있는 경우 문자열로 인식 (->String 사용)
		//char aaa = "B";   // 문자열로 인식하기 떄문에 B는 char aaa에 담기지 않음
		char bbb = 'B';
		System.out.println(bbb);
		
		String message = "너의 점수는 " + 90 + "점입니다."; // string은 문자열 사이에 있는 숫자도 문자열로 인식
		System.out.println(message);
		System.out.println(message.indexOf("점수") + "번째부터 시작");
		
		
		
		// 변수/상수
		int i = 10;
		System.out.println("변수 i = " + i);
		
		i = 100;
		System.out.println("변수 i = " + i);
		
		
		String a = "10";
		int b = 10;
		char c = 500;
		
		System.out.println(a);
		System.out.println(b);
	    System.out.println(c);
		
		
		
		
		
	}
}
