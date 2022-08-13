/**
 * 
 * 
 * 
 * 
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class C02ExceptionHandleExample {

	public static void main(String[] args) {
		Program p = new Program();   
		
		
		int result = 0;
		try { 
			
			result = p.getPoint();                            // ㅇ
		
		} catch(InputMismatchException ex) {
				System.out.println("숫자만 입력가능");
		} catch (Exception ex) {
				System.out.println("알수없는 예외 발생");	
		} finally {
			    System.out.println("무조건 실행");
        }
		
		System.out.println("점수는: " + result + "점 입니다");
			
		
	}
		
	
}
	
	
	
class Program {
	public int getPoint() throws InputMismatchException, Exception {     //예외발생가능성 있는거 알려줌
		System.out.println("점수입력: ");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		return point;
	}
}




