/**  << Scanner >> 
 *  화면에서 사용자의 입력을 받기
 *
 */
import java.util.Scanner; //java.lang 패키지가 아니라 java.util 패키지에 들어있기 때문에 import 해줘야함



public class C06ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);    // System.in을 사용하면 -->  System 클래스의 input을 받을것 !! 밑에 콘솔에 뭐 입력할 수 있음
		//String input = sc.nextLine();     // nextLine: 스트링 사용하는 매소드
		//System.out.println("입력값은 " + input + " 입니다");
		
		
		while(true) {                                // 무한반복 설정
		int width, height;
		System.out.print("가로길이를 입력하세요: ");
		width = Integer.parseInt(sc.nextLine());     //Integer.parseInt 매소드 사용하여 스트링을 인티저로 변환
		System.out.print("세로길이를 입력하세요: ");
		height = Integer.parseInt(sc.nextLine());
		
		
		Ractangle rc = new Ractangle(width, height);
		System.out.println("Shape is " + rc.type);
		System.out.println("사각형의 가로는 " + width + ", 세로는 " + height + "입니다");
		System.out.println("사각형의 면적은 " + rc.area() + "입니다");
		System.out.println("사각형의 길이는 " + rc.length() + "입니다");
		
		
		System.out.println("---------");
		System.out.print("프로그램을 종료하시겠습니까(Y/N)?: ");
		String command = sc.nextLine();
		if(command.equals("Y") ) {break;}
		}
	}
	

}
