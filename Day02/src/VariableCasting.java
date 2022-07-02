//형변환

public class VariableCasting {
	
	//Java Application starting point (Entry point) 자바가 시작되면 맨 먼저 실행되는 곳 = 메인 함수
	public static void main(String[] args) {
		
		//묵시적 형변환 (작은것->큰곳) 
		byte a = 127;
		short b = a;   // short(2byte) > byte(1byte)
		
		long c = 1000; 
		float d = c;   //(실수>정수)
		
		System.out.println("long to float : " + d); 
		
		
		//명시적 형변환 (큰것->작은곳)
		short x = 127; 
		byte y = (byte) x;
		System.out.println("short to byte : " + y);
		
		x = 128;
		y = (byte) x;
		System.out.println("short to byte2: " + y);
		
	
		//실수->정수 형변환: 소수점 이하 버림
		double aaa = 3.141562;   // double은 실수 표현이므로 소수점 아래 표현 가능
		int bbb = (int)aaa;
		System.out.println("double to int: " + bbb);  // int는 정수만 표현 가능하므로 소수점 아래 모두 자름
		
		
	    char aa = 'A';
	    int bb = (int) aa;
	    System.out.println(bb);
	    
	    
	    
	    long regNo = 9010101010101L;
	    System.out.println(regNo);
	    
	    
	    
	    	
	    
		
	}
	

}
