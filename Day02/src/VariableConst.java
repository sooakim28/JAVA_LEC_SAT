//상수와 변수의 차이

public class VariableConst {

	public static void main(String args[]) {
		  //변수선언        (소문자 시작 원칙)
		  int var_age = 50;
		  var_age = 100;
		  var_age = -100;      //변수는 변할 수 있는 값이므로, 값이 변하더라도 오류발생X
		  
		  System.out.println(var_age);
		  
		  
		  //상수선언         (전부 대문자 원칙)
		  final int MAX_AGE = 1000;    //상수는 final이라는 키워드 사용 
		  //MAC_AGE = 100;  // 이미 final로 상수를 설정했기 때문에, 값이 변하면 오류발생 (상수는 값 변경 불가)
		  
		  final int MAX_HEIGHT;
		  MAX_HEIGHT = 180;   // 가능 (근데 헷갈리니까 혼남)
		  
		  System.out.println(MAX_HEIGHT);
		  
		  
		  
	}
	
}
