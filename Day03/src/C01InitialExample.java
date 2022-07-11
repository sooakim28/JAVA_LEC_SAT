 /**
  * 할당(대입연산)
  * 
  * 
  * int a = 10; (프로그램은 좌에서 우로 이동하므로 10 = a는 에러임)
  * 
  * int a <- (변수선언)
  * = <- (할당)
  * 10
  * => 인티저 a를 선언하고 10을 할당
  * 
  * 
  *
  */

public class C01InitialExample {
	
	public static void main(String[] args) {
		
		
		int a = 10;     //할당(대입)
		System.out.println(a);
		
		
		
		//할당과 대입연산을 동시에 수행 
		
		int b = 100; // 단순할당 (100입력)
		b += 10;  // b = b + 10                     ->자바, C언어에만 있음
		System.out.println(b);
		b -= 10;  // b = b - 10
		System.out.println(b);
		b *= 100;  // b = b * 100
		System.out.println(b);
		b /= 100;  // b = b / 100
		System.out.println(b);
		b %= 100;  // b = b % 100
		System.out.println(b);
		
		
	}
	

}





