/**  <<변수의 사용범위 scope>> 
 *  변수는 어디까지 사용할 수 있는가?
 *              => 중괄호 범위 내
 *              
 *  종류: 전역변수 / 지역변수
 *
 */
public class C02ScopeExample {
	
	static String name = "먀";
	
	public static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public static void scopeTest(int a) {
		a++;
	}                                               
	
	
	
	
	public static void printNameLocal() {       // 지역변수 출력
		String name = "냐";
		System.out.println(name);
	}
	
	public static void printNameClass() {       // 전역변수 출력
		name = "ddd";
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		
	    System.out.println(name);
		
		int a = 10;
		scopeTest(a);
	    System.out.println(a);	            // 위 두 매서드는 별개의 공간을 차지(a는 위아래 각각 다른것임), 각 매서드는 자기의 중괄호 내에서만 기능
	    
	    printNameClass();
	    
	    
	}                                       // 변수가 클래스 바로 밑에 있을경우(매서드 중괄호 밖에 있으면) 그 클래스에서 일반적으로 사용 가능       =>클래스 전역 변수
	
	                                        // 매서드 내부에서 정의된 변수 (바로 위의 int a)       => 지역변수
	
	
	
	
	
	
	

}
