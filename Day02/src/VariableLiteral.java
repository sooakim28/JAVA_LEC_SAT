//리터럴 (escape sequence)

public class VariableLiteral {

	public static void main(String[] args) {
		
		 // 1. "" 표현     ex. 나는 "이종석" 입니다.
		    System.out.println("나는 \"이종석\" 입니다.");
		    System.out.println("나는 '이종석' 입니다.");    // ""와 ''가 짝을 이루므로 굳이 역슬래시 쓸 필요 없음
		    
		 // 2. * 3개를 찍는데 7칸씩 띄워서 출력 (*       *        *)
		    System.out.println("*\t*\t*");
		    System.out.println("*	*	*");
		    
		   
		   
		 // 3. * 3개를 찍는데 여러 줄로 나누어 출력
		    System.out.println("*\n*\n*");
		    
		    System.out.println("*");      //위 두 줄 포함해서 * 세개 표현
		    System.out.println("*");
		    System.out.println("*");
		    
		    
		 // cf. \r\n       r=return (커서를 앞으로 옮김), 이제는 쓰지 않음
		
		
	}
}
