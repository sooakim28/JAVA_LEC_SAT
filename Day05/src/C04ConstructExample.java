/**  << 생성자 >>
 * 
 * 특징: 리턴 없음 (보이드만 사용)
 *      모든 클래스는 반드시 생성자가 1이상 존재 (정의하지 않아도 컴파일러가 자동으로 생성)
 *      
 * 형태: 클래스명(매개변수) { 초기화 실행문 }
 *      기본생성자 -> Member member = new Member();
 *
 */


class Student {
	String name = "냥";      // 매소드 밖에서 할당은 가능 (행위X), 원래는 생성자가 있어야만 이부분 생성 가능했음 (지금은 없어도 가능)
	int grade;
	String gender;
	
	
	
	//생성자 선언 
	public Student() {                //     => 디폴트 생성자(기본)
		name = "먀";
		grade = 6; 
		gender = "남성";
	}
	
	
	public Student(String name1, int grade1, String gender1) {    //    => 
		name = name1;
		grade = grade1;
		gender = gender1;
	}
	
	// -------------
	
	
	void sayName() {
		System.out.println("이름은'" + name + "'이에요");
	}
	void sayGrade() {
		System.out.println(grade + "학년 이에요");
	}
	
}





public class C04ConstructExample {
	
	public static void main(String[] arags) {
		
		Student std = new Student();     // => 생성자 매소드, 디폴트 생성자가 있으니 값이 없어도 에러 안남      
		//std.name = "냐";
		std.sayName();
		std.sayGrade();
		
		/**
		Student std2 = new Student("냥냥", 2, "남성"); 
		std2.sayName();
		std2.sayGrade();
		*/
		
	}
	
	
	
	
	

}
