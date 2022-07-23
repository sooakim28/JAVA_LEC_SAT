/**
 * <<패키지>>
 * 
 * 패키지명: 모두 소문자
 * 
 */


package drivers;

public class DriverType01 {
	
	String driverName = "십자드라이버";               //접근제한자 default
	
	
	void getDriveInfo() {                          //접근제한자 default
		System.out.println(driverName);
	}
	

	
	public void getDriverInfo2() {                         
		System.out.println(driverName);
	}

	
	
	
	
	
}
