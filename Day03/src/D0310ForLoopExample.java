/** << 반복문 >>
 * 
 * 형태: for(초기화식; 조건식; 증감식; {실행문}         // 초기화식=변수선언, 실행문은 조건식이 true일때만 실행 (true인 한 반복실행) - 초기화식은 한번만 실행됨
 *                                             // 1)초기화식 실행 2)증감식 실행 4)조건식과 비교 후 증감식 실행(조건식이 true인 내에서)
 * 
 * 
 *
 */

public class D0310ForLoopExample {
	
	public static void main(String[] args) {
		
		//1-10까지 출력
		for(int i = 1; i<= 10 ; i++) {
			System.out.println(i);
		}
		
		
	    int x;
	    for(x = 1; x <= 10; x++) {
	    	System.out.println(x);
	    }
	    System.out.println("x = " + x);
	    
	   
	    
	    
	    
	    int y = 1;
	    for(; y<=10; y++ ) {                    //초기화;조건식;증감식이 필수는 아님 (초기화문 생략)
	    	System.out.println("y = " + y);
	    }
	    
	    
	    y = 1;
	    for( ; y <= 10; ) {
	    	System.out.println(y);
	    	y++; 
	    }
	    
		
	    for(;;) {             //무한으로 돌아감(중단조건이 없기때문)
	    	System.out.println(y);
	    	y++;
	    	if(y > 10) break;
	    	
	    }
	    
	    
	    
	    // 중첩된 for문: ex. 구구단 2단~9단 
	    
	    for(int x1 = 2; x1 <= 9; x1 ++) {        // x * y => x결정됨
	    	
	    	System.out.println("====" + x1 + "단 =====");
	    	for(int y1 = 1; y1 <= 9; y1++ ) {     // y축
	    		
	    		System.out.println(x1 + " x " + y1 + "=" + (x1 * y1));
	    		
	    	}
	    	
	    }
	    
	}
}




