/**  << 싱글톤 >>
 * 
 *  1. 특징:  하나의 객체를 생성하여 여러 변수에서 활용
 *           static에서만 사용가능
 *  
 *
 */


class Counter2 {
	static Counter2 counter2;                // Couunter2타입의 변수 counter2를 만듦 (현재 아무 값도 없기 때문에 내용은 null)
	int cnt = 0;    // 덧셈숫자
	
	// 싱글턴 객체생성 매소드 
	public static Counter2 getInstance() {    //리턴타입이 Counter2라는 것임, 매소드 getInstance 
		if (counter2 == null) {
			counter2 = new Counter2();      // counter2 객체를 생성 (heap에)하여 그 주소값을 counter2에 넣음
		}
		return counter2;                    // 주소값 return 
	}
	
	// cnt에 1씩 증가
	public void addCnt() {
		cnt ++; 
	}
	
	public void printCnt() {
		System.out.println("cnt = " + cnt );
	}

	
}





public class C06SingletonExample {
	
	public static void main(String[] args) {
		
		// 1) 일반 방식
		Counter2 ccount1 = new Counter2();
		Counter2 ccount2 = new Counter2();
		Counter2 ccount3 = new Counter2();
		
		ccount1.addCnt();
		ccount1.addCnt();
		ccount1.addCnt();
		
		ccount3.printCnt();
		
		
		
		// 2) Singleton 방식 (객체를 하나 생성하여 count1,2,3에 그 주소값 공유)
		Counter2 count1 = Counter2.getInstance();    // Counter2 클래스에 있는 매소드 getInstance를 불러와서 count1 변수을 만듦
		Counter2 count2 = Counter2.getInstance();
		Counter2 count3 = Counter2.getInstance();
		
	  
		count1.addCnt();     //    count1 addCnt() 메소드 3번 호출 ->  cnt = 3;
		count1.addCnt();
		count1.addCnt();
		
		count3.printCnt();   // count 총 몇 개? cnt = 3
	}

	
	
	
	
}
