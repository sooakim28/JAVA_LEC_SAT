/**   << Overroading / Overriding >>
 * 
 * 1. 오버로딩(매소드 다형성): 같은 이름으로 다른 리턴타입/인자 등 정의 
 *    1) 특징: 두 매소드의 리턴타입/인자의 수/인자의 데이터 타입 등이 달라야 함 (그래야 서로다른 메소드로 인식) 
 *            받는 인자값의 형태에 따라 자동으로 그에맞는 매소드 사용
 * 
 * 2. 오버라이딩(): 상속관계에서 어느 매소드 재정의(변경)
 *    1) 
 *    
 */

class P {
	
	int add () {
		return 0;
	}
	int add(int x, int y) {
		System.out.println("add(int x, int y) 호출 실행됨");
		return x + y ;
	}
	float add(float x, float y) {
		System.out.println("add(float x, float y) 호출 실행됨");
		return x + y ;
	}                                     //같은 add라는 이름으로 서로다른 매소드 (overroading)
}


class C extends P {
	
	int add(int x) {
		System.out.println("C.add(int x) 호출 실행됨");
		return x + 10;                    //같은 add라는 이름으로 서로다른 매소드 (ovdrroading)
	}
	
	
	
	@Override
	int add (int x, int y) {
		System.out.println("C.add(int x, int y) 호출 실행됨2");
		return x - y ;                    // C클래스 변경됨 (overriding) 
	}
	
	
	
}






public class C03OverroadingExample {
	public static void main(String[] args) {
		
		C c = new C();
		c.add(10,20);                           // 각 인자수와 데이터타입에 맞는 매서드가 실행됨
		c.add(1.0f, 2.0f);
		c.add(100);
		
		
		P p = new P();
		p.add(10,20);                           
		p.add(1.0f, 2.0f);
		
		// cf. 예외처리: 객체의 캐스팅은 예외발생시 컴파일에러가 발생하지 않고, 런타임때 발생   (상위객체를 하위객체로 형변환시)   - 클래스는 크기로 구분되는게 아니기 때문 (그 클래스 내의 매소드 여부, 어느 클래스가 상위인지가 중요)
		//((C)p).add(10,20);   //컴파일 에러는 안나지만 매소드가 없기 때문에 값이 나오지 않음 (상위클래스를 하위클래스로 캐스팅하지 못함), 코딩시 실수 잦은 부분
		
		
		//@Override
		System.out.println("------------");
		p = new C ();
		p.add(10,20);        //  => C객체로 override되었기 때문에(실제 객체는 C이기 때문에) C 호출
		((P)p).add(10,20);   // 
		p.add(1.0f, 2.0f);

		
	}

	
	

	
	
	
	
}
