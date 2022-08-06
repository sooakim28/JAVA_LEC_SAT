/**
 *  특징: Object 클래스의 모든 매소드는 다른 클래스에 상속됨
 *  http://docs.oracle.com/en/java/javase/11/docs/api/index.html 에서 매소드 정의 확인하기
 *
 */

public class C01ObjectClassMethodExample {
	
	public static void main(String[] args) {
		
		String a = "보라돌이";   //String은 클래스이기 때문에 보라돌이는 객체
		String b = "보라돌이";
		String c = a;
		
		System.out.println("a == b : " + (a == b));          // => ==은 과거 버전에서는 주소값만 비교(결과값 false), 자바 버전7 이후에는 실제값 사용 (결과값 true)
		System.out.println("a.equals(b) : " + a.equals(b));     //equals는 object클래스에 있는 매소드임,  => euqls는 실제 값 비교 (결과값 true)
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());   // String 클래스의 해시코드 매소드는 그 클래스에서 오버라이드됨 (값이 같으면 같은 해시코드를 돌려주도록)
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));    // System 클래스의 해시코드 매소드 
		
		
		
		// Wrapper 클래스의    integer 매소드   
		int i = 0;
		    // i.  => i는 단순한 값일 뿐이어서 매소드처럼 사용 안됨
		Integer objI = new Integer(10);
		
		    // String objS = objI;     이럴때 사용하는게 toString** (객체의 값을 문자열로 바꿔줌)
		String objS = objI.toString();
		System.out.println(objS);
		
		
		// Object clone
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		
		  //int arrB[] = arrA;      // 참조변수 값(주소값 복사)이기 떄문에 arrB 변경시 arrA 변경됨, 그냥 복사하고 싶을때는 System.arraycopy 혹은 object clone
		  //arrB[2] = 100;         
		
		System.out.println("arrA[2] = ? " + arrA[2]);
		
		
		
		
	    int arrB[] = arrA.clone();     // object clone을 쓰면 값 자체를 복사해서 쓰기 떄문에 원래 arrA의 값을 변경하지 않음 
	    arrB[2] = 100;
		
		
		
		
	}

}
