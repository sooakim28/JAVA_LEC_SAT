import java.util.Scanner;

public class C06StringFormatExample {
	
	public static void main(String[] args) {
		
		
		// 1. String 클래스와 StringBuffer 클래스 비교    (보라돌이, 만세 점수는 a점) 
		int a = 90;
		
		// 객체생성 이용 (여기서는객체 3개 생성)
		String message = "보라돌이, 만세 점수는 " + a + "점 입니다";
		System.out.println(message);                               
		
		// 주소값 이용: format을 만들어놓고 그 내용만 교체, 여기서는 객체 2개  (%s는 스트링, %d 는 숫자)
		String message2 = "%s, 만세 점수는 %d점 입니다";             
		message2 = String.format(message2,  "뚜비", a); 
		System.out.println(message2);                            
		    //ex. String loginErrorMessage = "아이디 %s는 없는 아이디입니다"
		
		
		
		
		// 주소값 이용2: StringBuffer 이용 (string과 같은 문자열 클래스, 차이점은 string은 불변객체인 반면 ("보라돌이" + "만세" => "보라돌이", "만세", "보라돌이만세", 객체 총 3개 생성), stringBuffer는 변경가능한 문자열객체
		StringBuffer sb = new StringBuffer("나나");
		sb.append("만세");    //stringbuffer클래스의 append 매소드는 원래값에 추가하는것! ("나나" + "만세" => "나나만세", 객체 총 2개 생성)
		System.out.println(sb);
		
		
		
		
		
		
		
		
		// 2. String 클래스의 매소드 사용해보기
		String msg = "   뽀 라돌이";
		System.out.println("문자열 msg는 " + msg.length() + "자 입니다");            // length() 는 문자열의 길이를 구하는 매소드(길이 리턴)

        msg = msg.trim();
        System.out.println("문자열 msg trim()한거는 " + msg.length() + "자 입니다");  // trim()은 앞뒤 공백 제거하는 메소드 (원칙적으로 중간 공백 제거하는 매소드 자체는 없음)
        
        
       
        
        
        String trimVal = "보라돌이 뚜비 나나";                                       // 이런 매소드를 만들어서 중간 공백 제거 가능
        trimVal = trimAllBlankChar(trimVal);
        System.out.println("중간 모든 공백문자 제거: " + trimVal);
        
	    }
	
	
	    public static String trimAllBlankChar(String src) {
		
		int len = src.length();    // 문자열의 길이 구함
		char dest[] = new char[len];
		
		src.getChars(0, len, dest, 0); // 0부터 len 끝까지(길이만큼) dest에 변환하여 복사, dest는 0번부터 시작
		
		
		String result = ""; 
		for(char var : dest) {
			if (var == ' ') {
				continue;
			}
			result += var;
		}
		return result;
	    }
	
	
	    
	    
	    
	    
	    

	
	
	
}
