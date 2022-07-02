
public class VariableLec03 {
	
	public static void main(String args[]) {
		
		//선언과 동시에 초기화
		int a = 10;
		char b = 20;
		short c = 100;
		long d = 1000;
	
		//선언과 초기화를 별도로
		int aa; 
		char bb;
		short cc;
		long dd;
		
		aa = 10;
		bb = 20;
		cc = 100;
		dd = 1000;
		

		int aaa;
		//System.out.println(aaa); // 초기화하지 않은 aaa는 에러발생. 
		
		
		//한꺼번에 선언
		int aaaa, bbbb, cccc, dddd; 
		
		
		byte testCharLength;
		//testCharLength = 128;  바이트는 127까지니까 에러
		testCharLength = 127; 
		testCharLength ++;  // ++의 의미: 앞의 변수에서 +1
		
		
		System.out.println(testCharLength);
		
		
	}

}
