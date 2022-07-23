/** << Static >>
 * 
 * 1. 사용: 정적 매소드, 클래스 전역 변수 (에 only) 
 *         객체 초기화 목적
 *         생성자명이 곧 클래스명
 *                  
 * 2. 특징: 프로그램이 실행되면 객체를 실행하지 않아도 자동으로 static 부분을 실행 (프로그램 자체가 끝날 때까지 실행 유지)
 *         정적 메모리 영역               cf. heap/stack: 동적 메모리 영역
 *   
 *         heap, stack 등 모든 메모리 영역에서 static에 접근 가능
 *         많이 사용시 메모리 과다 사용
 *         리턴값 없음 (리턴타입 없음)
 *
 */

class CounterObject {
	int count = 0;
	void addCount() {
		count++;
		System.out.println(count);
	}
}



class StaticCounterObject {          
	static int count = 0;                
	static void addCount() {
		count ++;
		System.out.println(count);
	}
}




public class C05StaticExample { 
	
	static void callAddCount() {
		CounterObject count = new CounterObject();
		count.addCount();
	}
	
    static void callStaticAddCount() {
        StaticCounterObject.addCount();            // static 매소드/변수는 heap메모리가 아닌 static영역에 저장되기 때문에 new 라는 키워드(매소드) 사용x
    }                                              // 클래스명.변수명, 클래스명.메소드명();

    
    void printName() {
    	System.out.println("동적매서드 printName");
    }

    

	public static void main(String[] args) {       

		callAddCount();
		callAddCount();
		callAddCount();        // =>  (동적으로 ->calladd~는 void임) 세 개의 객체 생성 (생성하고 +1하고 메모리 해제 를 3번 반복), 객체의 count값이 공유되지 않음
		
	    callStaticAddCount();
	    callStaticAddCount();
	    callStaticAddCount();  // => static은 공용영역이라서 new 메소드를 사용하지 않음
	    
	    
	    
	    // static 메소드 내에서 non-static (동적) 객체를 사용하려면 반드시 new 를 사용해야 함
	    CounterObject c_obj = new CounterObject();            // (1) 메모리를 heap영역에 올리고 (사용가능하도록 가시화)
	    c_obj.addCount();                                     // (2) 필요 매소드 사용   
	                           // => 같은 클래스의 동적 메소드라 할지라도 동적메서드가 하나라도 있을시 new를 통해 자기자신을 heap영역에 올리고 사용해야 함
	    
	    //printName(); => 에러
	    
	    C05StaticExample example = new C05StaticExample();    //=> 쓸 수 있게 가시화
	    example.printName();
	    
	    
	    
	}                         
	 
	
	
	

	
	
}
