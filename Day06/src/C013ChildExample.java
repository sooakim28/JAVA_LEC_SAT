
public class C013ChildExample 
extends C011ParentExample {        // 상속은 extends라는 키워드 사용, C011Parent~에서 받아오는것
	
	public C013ChildExample(String name) {     // 이름만 받는 생성자
		super(name, 4);          // ParentExample 1번 생성자 호출 (매개인자 2개짜리)
		
		//this.name = name;    //위 super로 받아도 되지만  extends로 이미 상속받았기 때문에 이렇게도 가능하기는 함
	}
	

}
