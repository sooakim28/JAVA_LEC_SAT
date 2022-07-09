/**  << while, do while문 >>
 * 
 * 
 * 1. 실행 전 조건식이 참인지부터 검증
 * while(조건식) {
 *     조건식이 참일 때 반복실행
 *     }
 *    
 *     
 *     
 *     
 * 2. do 이하 실행식을 먼저 실행하고 while문의 조건식을 검증 (최소 한 번은 실행)
 * do {
 *    조건식이 참일 때 반복실행
 * 
 *    } while(조건식);
 *    
 * 
 *
 */


public class D0312DoWhile {
	
	public static void main(String[] args) {
		
		boolean goLoop = false;
		
		while(goLoop) {
			System.out.println("고고");
			
		}
		
		do {
			System.out.println("하악)");
		} while(goLoop);
		
		
		
		int x = 10;
		while(x < 20) {
			//System.out.println(x); 무한루프............
			System.out.println(x++); 
			
		}
		
		x = 10;
		while(true) {
			System.out.println("x=" + x++);
			if(x == 20) break;
		}
		
		
		System.out.print("cd");
		System.out.print("ab\n");
		
		
		
	}

}
