
public class C023BoyStudent extends C021Student {
	C023BoyStudent (String name, int age, int grade, int score) {
		super ();                                                     // c021Student클래스에서 C021Student 생성자 호출
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
		this.gender = "남";
		
	}
	
	@Override    // 오버라이드(재정의,변경) 라는 표시  -볼 때의 편의를 위한 것
	public void gotoCR() {             // Student클래스에서 정의했던 매소드 재정의(변경)
		System.out.println(name + "는 남자화장실감");
	}
	
	
	
	public void smoking() {
		System.out.println("뻐금뻐끔");
	}
	

}
