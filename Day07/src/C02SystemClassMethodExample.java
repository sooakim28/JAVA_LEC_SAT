import java.lang.*;   // java.lang의 모든 매소드 호출.  
import java.util.Properties;

public class C02SystemClassMethodExample {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));    // java.version, os.version 등이 Key
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		
		// 사용자 컴퓨터의 환경변수 출력
		for(String var : System.getenv().keySet()) {          // env: 환경변수 가져오기          
			System.out.println(var + "=" + System.getenv(var));
		}
		
		
		// 자바에서 지원하는 properties를 사용하는 방식
		Properties prop = System.getProperties();
		       // ... 
		
		
		
		
		
	}

}
