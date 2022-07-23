/**
 * <<배열을 이용한 학생 성적 출력 >>
 * 
 * 
 * 
 */
public class C02ArrayStringExample {
	
	public static void main(String[] args) {
		
		String[] stds = {"A", "B", "C"};    //학생이름
		int[] stdScores = {90, 100, 80};
		
		int totalScore = 0;
		
		
		// 1) 점수 출력
		for( int i = 0; i < stds.length; i++) {
			System.out.print(stds[i] + " : " + stdScores[i] + "\n" );
			totalScore += stdScores[i];    // 총합
		}
		
		
		// 2) 총합

		System.out.println("점수총합 = " + totalScore);
		
		// 3) 평균내기
		System.out.println("평균총합 = " + (totalScore / stds.length) + "점" );
		
	}

}
