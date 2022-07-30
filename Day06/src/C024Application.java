/**  <<상속을 통한 (A) is a (B) 관계>> 
 * 
 * is a란? A is a B (A는 B이다)   에서  B가 A보다 더 상위객체 (그 반대는 형변환 필요)
 * ex. 인간은 동물, 남학생은 학생, 여학생은 학생, 학생은 인간, 인간은 동물 ...
 *  
 *
 */



public class C024Application {
	
	public static void main(String[] args) {
		
		C021Student std1 = new C023BoyStudent("A", 45, 6, 10);    // Student는 데이터타입에 BoyStudent 값을 넣을 수 있나? Yes  (왜냐면 Boystudent is a Student이기 때문 = 남학생 클래스는 학생클래스의 상속을 받음)
		C023BoyStudent bStd = new C023BoyStudent("고양이", 10, 1, 10);
		//C022GirlStudent gStd = new C023oyStudent("고양이2", 10, 2, 10);    //  GirlStudent 타입에 BoyStudent 값(객체)를 넣을 수 있나? No (왜냐면 Boystudent is not a Girlstudent = 남학생은 여학생이 아니기 때문)
		                                                                   //  GirlStudent 와 BoyStudent는 상속관계가 아님
		C021Student std2 = new C022GirlStudent ("하", 20, 1, 90);
		
		std1.sayName ();
		std2.sayName ();
		
		std1.gotoCR();
		std2.gotoCR();
		
		
		//std1.smoking();     // -> 남학생에 smoking이라는 매서드가 있더라도 호출 안됨 (왜냐면 student타입의 클래스에는 smoking매소드가 존재하지 않기 때문, smoking매소드는 BoyStudent클래스에만 있음)
		                      //    그러나 클래스도 데이터타입일 수 있기 때문에 형변환 가능(아래)
		
		((C023BoyStudent)std1).smoking();    // -> 이렇게 형변환하면 호출 가능   (기존 상속받은 내용 이외에 추가할 때는 이렇게 형변환 필요 **)
		
		
		
		
		// 한 반에 10명이 수업을 듣는 경우, 배열로 묶기 (배열은 같은 데이터타입만 사용가능, 여기서는 C021Student라는 같은 데이터타입이므로)
		C021Student[] classRoom = new C021Student[10]; 
		classRoom[0] = new C023BoyStudent("냐", 40, 1 ,10);
		classRoom[1] = new C022GirlStudent("먀", 20, 2, 99);
		
		for(C021Student std : classRoom) {       // 여기서 std 새로 정의한듯
			if(std == null) break;               // 10개의 방에 위에서 2개만 정의했으므로 나머지 공간은 비어있음
			std.sayName();
			std.sayGender();
		}
		
		
		
		// 모든 자바클래스의 최상위 클래스는 object이므로 object라는 데이터타입으로도 배열 가능, Student is a Object)
		Object[] classRoom2 = new C021Student[10];   // student타입에 있는 매소드를 그대로 호출 불가. 
		
		classRoom2[0] = new C023BoyStudent("가", 40, 2 ,10);   // 이렇게 정의해줘야. 
		classRoom2[1] = new C022GirlStudent("나", 20, 2, 99);
		//for(C021Student std : classRoom2) {              // object클래스가 더 상위이므로 이렇게 불가
		for (Object std : classRoom2) { 
			if(std == null) break;   
			C021Student tmp = (C021Student)std;           
			tmp.sayName();
			tmp.sayGender();
		}
		
		
		
		
		
		
	}  

}
