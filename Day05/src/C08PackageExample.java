/**  << 패키지 >>
 * 
 * 형태: package 폴더1(상위).폴더2(하위).폴더3(더 하위)....; 
 *      패키지명은 모두 소문자
 * 
 *
 */
import drivers.DriverType01;       // drivers 폴더의 DriverType01 클래스를 쓰겠다
import drivers.*;                  // drivers 폴더 안에 있는 모든 클래스를 사용할 것

public class C08PackageExample {
	
	public static void main(String[] args) { 
		
		DriverType01 t1 = new DriverType01();
		//t1.getDriverInfo();        // getdriverInfo 매소드는 접근제한자가 default라서 동일 패키지에서만 사용 가능 (여기는 다른 패키지이므로 사용 불가)
		t1.getDriverInfo2();
		
	}
	
	
	
	

}
