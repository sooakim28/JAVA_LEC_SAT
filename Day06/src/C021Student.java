/**    << 클래스 상속 >>
 * 
 * 
 *
 */
public class C021Student {
	
	String name;
	String gender;
	int age;
	int score;
	int grade;  //(학년)
	int schoolTime; //(등교시간)
	
	//디폴트 생성자
	C021Student() {
		schoolTime = 9;       
	}
	
	
	public void sayName() {
		System.out.println("이름은 " + name + "입니다");
	}
	public void sayGrade() {
		System.out.println("학년은 " + grade + "입니다");
	}
	public void sayGender() {
		System.out.println("성별은 " + gender + "입니다");
	}
	public void sayScore() {
		System.out.println("점수는 " + score + "입니다");
	}
	public void play() {
		System.out.println("쉬는시간");
	}
	public void gotoCR() {
		System.out.println("화장실감");
	}
	//지각여부
	public void printIsLateness(int inTime) {
		if ( inTime > this.schoolTime ) {
			System.out.println ("지각");
		} else {
			System.out.println("통과");
		}
	}
	
	
	
	

}
