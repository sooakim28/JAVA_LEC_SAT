/**  <비트연산>
 * 
 *
 */


public class C05BinaryExample {

	public static void main(String[] args) {
		
		int x = 2;   // 2진수로는 0010
		System.out.println(Integer.toBinaryString(x)); // =>인티저 x를 2진수 문자열로 바꿔주는 함수(메서드) (toBinaryString)
		
		int y = 3;
		System.out.println("x & y = " + (x & y));
		
		// 1) x를 2진수로 바꾸면 0010 
		// 2) y를 2진수로 바꾸면 0011
		// 3) x & y = 은 이진수 0010이 나옴 (각 첫번째 두번째~글자끼리 하여 0and0=0, 0and0=0, 1and1=1, 0and1=1) 
		
		System.out.println("x | y = " + (x | y));
		System.out.println("x | y = " + Integer.toBinaryString(x | y));
		// 1) x를 2진수로 바꾸면 0010
		// 2) y를 2진수로 바꾸면 0011
		// 3) x | y = 은 이진수 0011이 나옴(3) (각 첫번째 두번째~글자끼리 하여 0or0=0, 0or0=0, 1or1=1, 0or1=1) 
		
		
		System.out.println("x ^ y = " + (x ^ y));
		System.out.println("x ^ y = " + Integer.toBinaryString(x ^ y));
		// 1) x를 2진수로 바꾸면 0010
		// 2) y를 2진수로 바꾸면 0011 
		// 3) x ^ y = 은 이진수 0001이 나옴(1) (각 첫번째 두번째~글자끼리 하여 0xor0=0, 0xor0=0, 1xor1=0, 0xor1=1) 
		
		
		
		
		
		
	}
}



