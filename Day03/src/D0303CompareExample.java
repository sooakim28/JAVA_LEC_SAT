/**  <비교연산>
 * 
 * 성질: 두 항을 비교해서 결과를 얻는 작업, 두 항의 결과는 항상 참/거짓 (true/false)  - 이항연산
 *      boolean 사용 - true는 1, false는 0  (실제로 0을 제외한 모든 값은 true)
 *      
 * 예시: A>B, A<B, A>=B (같거나 A가 큼), A<=B (같거나 B가 큼)
 *      A==B (A equal B),  A!=B (A not equal B, 같지 않음)
 *
 */
public class D0303CompareExample {

	
	public static void main(String[] args) {
		
		boolean result = false; // or true
		result = 10 > 2;
		System.out.println(!result);
		
		result = 10 < 2;  // 거짓
		result = 10 >= 10; // 참
		result = 10 > 10; //거짓
		System.out.println(result);
		
		
		//result = "키키" > "케케";  // 실수, 정수비교만 가능
		result = "키키" == "케케";  // !=, ==은 객체 등 모든 데이터타입 비교가능
		System.out.println(result);
		
	}
	
	
}
