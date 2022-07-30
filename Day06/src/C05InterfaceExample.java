/** << 인터페이스 >> 
 * 
 * 1. 특징: 다중상속 가능    (cf. 상속은 단일상속만 가능)
 * 2. 형태:   
 *    1) 선언: interface 인터페이스명 {} 
 *    2) 구현: A implement B {}    -> B라는 인터페이스를 A클래스에서 구현할것 
 */

 //구현
interface PersonAction {                      //public 안썼으므로 접근제한자는 default    
	
	int giveMoney ();
	void sayName();
}



interface DogAction {
	void bark(); 
}




class Person implements PersonAction, DogAction {        // implement 키워드 써서 구현: 상속은 단일상속만 가능하나, implement는 다중상속 (여러 추상매소드/실행코드 한번에 구현= 하나의 객체로 두개 구현) 가능 ** 
	                                                     // 현재 Person 클래스는 총 3가지 매소드 가능
	
	@Override
	public int giveMoney() {
		return 1000;
	}
	
	@Override
	public void sayName() {
		System.out.println("하");
	}
	
	
	@Override
	public void bark() {
		System.out.println("술먹으면 왈왈ㅋㅋ");
	}
	
}








public class C05InterfaceExample {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.sayName();
		
		PersonAction action = new Person();
		DogAction dAction = new Person();
		
		action.sayName();
		dAction.bark();
		
		((PersonAction)dAction).sayName();               // 형변환해서 dAction으로도 sayName 실행
		((Person)dAction).bark();
		((Person)dAction).giveMoney();
		((Person)dAction).sayName();
		
		
		System.out.println("action instacne of PersonAction: " + (action instanceof PersonAction));   // instanceof는 객체 action이 클래스타입 PersonAction을 implement 한 것임? 하고 물어보는 것 
		System.out.println("action instacne of DogAction: " + (action instanceof DogAction));         //      ==> 인터페이스 A에 구현클래스 AA가 있을때, AA instanceof A 는 true
		System.out.println("action instacne of Person: " + (action instanceof Person));
		
		
		
		
		
		
		
		//익명 구현 객체
		PersonAction anoObj = new PersonAction () {
			@Override
			public int giveMoney() {
				return 2000;
			}
			
			@Override
			public void sayName() {
				System.out.println("익명객체에서 구현");
			}
		};
		     
		anoObj.sayName();



		
	}
	
	
	

}
