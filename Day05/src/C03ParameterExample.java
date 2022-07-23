/**  << 매개변수 (인자) >>
 * 
 * 1. 특징: 매소드에서만 사용가능
 *         지역변수임
 * 
 * 2. 형태: 매소드명 ( 인자 ..... )
 *         매개변수 선언방식 -> (데이터타입 변수명, 데이터타입 변수명 ....) 
 * 
 * 
 */
public class C03ParameterExample {
	
	
	static void printAddValue (int x, int y) {                // 1) x와 y는 기본(일반)타입: pass by value (copy by value와 동일)
		int z = x + y;
		x++;
		y++;
		System.out.println(" x + y = " + z);
	}
	
	
	
	
	
	static void printAddArray(int[] x) {                      // 3) 참조방식: pass by reference
		x[1] = 10;
	}

	
	
	
	
                                                              // 5) void형태(리턴값 없음) 매서드의 return 활용법
	static void printValuesUseReturn() {
		int x = 0;
		for(; x<=10; x++) {
			//if(x == 9) break;                               //    -> x가 9가 되는 순간 이 for문 탈출하고 이 아래 표시
			//if(x == 9) return;                              //    -> return은 종결의 의미도 있으므로 이 아래는 표시되지 않음
		}
		System.out.println("d = " + x);
	}
	
	
	
	
	
	public static void main (String[] args) {
		
		
		printValuesUseReturn();
		
		
		int x = 10;
		int y = 20;
		printAddValue(x, y );                                  // 2) 기본타입은 stack에 들어가는 직접 값 (ex. 10, 20..) -> 인자로 넘길떄도
		                                                       //    그 인자에 메모리 주소값이 아닌 10, 20 값 자체를 "복사"함 *
		                                                       //    따라서 x, y 의 값은 매소드에서 무슨짓을 하든 영향받지 않음
		
		
		
		int[] a = new int[2];                                  // 4) 참조타입에서 a는 stack에 직접 값을 등록하는 것이 아니라 
		a[0] = 10;                                             //    heap 메모리에 있는 실 데이터의 "주소값"을 "복사"하여 넘겨줌 
		a[1] = -10;                                            //    따라서 호출된 메소드에서 그 참조값을 변경하는 경우 실제 값도 영향을 받음. 
		printAddArray(a);     
		System.out.println("a[1] = " + a[1]);
		
		
	}

	
}
	
	

	
	
	

