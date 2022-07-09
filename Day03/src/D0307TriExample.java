/**  << 삼항 연산 >>
 * 
 * 형태: 조건식? 값1(연산) : 값2(연산)
 *
 */

public class D0307TriExample {
	
	public static void main(String[] args) {
		
		int point = 90;    // 커트라인
		int gainedPoint = 100;   // 얻은점수
		int isPassed = 0;    // pass 여부 (0 fail, 1 pass)
		String isPassedString = "";
		

		
		isPassed = gainedPoint >= point ? 1 : 0;
		isPassedString = isPassed == 0 ? "불합격" : "합격"; 
		
		System.out.println("님은 " + isPassed);
		System.out.println("님은 " + isPassedString);
		
		
	}
	

}
