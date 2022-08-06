import java.util.Scanner;

/**    
class Student {
	public void prin\tName() {
		System.out.println("하악");
	}
}
*/




public class C03ClassMethodExample {           //위 클래스를 공급받아 객체 생성
    public static void main(String args[]) throws Exception { 
    	/**
    	// 유형1: 객체를 만들어서 생성 (고정)
    	Student s = new Student(); 
    	
    	// 유형2: 문자열주소 이용해서 생성 (변동가능)   => 쉽게 변경 가능
    	Class c = Class.forName("Student");
    	Student std = c.newInstance(); 
    	*/
    	
    	Scanner s = new Scanner(System.in);
    	System.out.println("사용할 클래스 이름?: ");
    	String className = s.nextLine();            // 동적: 굳이 코드를 고치지 않아도 넘겨주는 값만으로 바꿀 수 있음 (인자만 수정하여 appprogramv1 변경 가능 )
    	
    	//String className = "C05AppProgramV1";     // 정적: 코드를 직접 고쳐야 appprogramv1 변경가능
    	Class clazz = Class.forName(className);
    	C04AppInterface inc = (C04AppInterface)clazz.getConstructor(null).newInstance(args);
    	
    	inc.printMyName();
    }
}
