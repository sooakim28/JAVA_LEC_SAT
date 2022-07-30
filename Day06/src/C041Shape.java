/**  << 추상클래스 >>
 * 
 * 1. 특징: half 설계 클래스 - 설계가 완료되지 않았으므로 제품생산(객체생성) 안됨      new 클래스명(); 불가
 * 2. 
 *
 */

public abstract class C041Shape {        // 추상매소드 사용하려면 추상클래스가 되어야 하므로 클래스명 앞에 abstract 선언
	
	 String type;
	 
	 C041Shape (String type) {
		 this.type = type; 
	 }
	 
	 abstract double area();
	 abstract double length();    // 구현부가 없는 메소드, 선언부만 존재 
	
	
	

}
