
/**   << this (=내 객체 내에서 나 자신) 와 super (상속주체) >>
 * 
 *
 * 멤버변수 멤버매소드에 사용    (자바, c언어 등 모든 객체지향 언어)
 * 형태: this.변수/매소드();      or    this.변수/매소드 = 새로 설정한 생성자의 변수/매소드 ;
 */

public class C011ParentExample {
	
	String name;
	int arms;                    //클래스의 멤버
	
	public C011ParentExample() {                                                                                //  => 2번 생성자 (매개변수 없는)
		//this.name = "하악하악";
		//this.arms = 10;
		this("하악", 10);   // 위 방법으로도 가능하고 이것도 가능. 이거는 아래 C011Parent~ 생성자 호출하는것
	}
	
	//생성자 메소드
	public C011ParentExample(String name, int arms) {       //  1) 생성자 매소드명은 클래스명과 동일, 2) 생성자는 리턴타입X      => 1번 생성자 (매개변수 2개 있는)
		
		//name = name;
		//arms = arms;              // 앞의 name, arms는 위에서 정의한거(생성자보다 상위, 전역변수?)   뒤의 name, arms는 public C01()~ 에서 정의한것(생성자 안쪽, 매소드 내 변수?). 
		                            // 근데 이렇게 인스턴스 변수(클래스 전역변수, 멤버변수)와 메소드 내 변수의 이름이 같으면, 더 가까운(블록) public~을 지칭하게 되므로 위 정의한걸 가리키고 싶으면 this사용
		
		this.name = name;           // 위에서 정의한 name과 arms (지금 이 생성자에서 정의한 name arms가 아니라) = 이 생성자에서 String과 int로 정의한 name과 arms ***
		this.arms = arms;  	
	}
	
	
	
	
	public void printMyInfo() {         //내 정보(이름,팔 개수)를 보여주는 매서드
		//printName();    
		//printArms();
		
		this.printName();
		this.printArms();               // 같은 클래스 내에 있기 때문에 이렇게도 가능. 
	}
	public void printArms() {
		System.out.println("내 팔은 " + arms + "개야");	
	}
	public void printName() {
		System.out.println("내 이름은 " + name + "야");
		
	}
	
	
	
	
	
	
	
	

}
