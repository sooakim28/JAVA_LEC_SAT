
/** <<배열>>
 * 
 * 1. 특징
 *    1) 같은 데이터 타입만 사용 가능 (고정된 방 크기)
 *    2) 한번 정해진 방의 크기는 변경 불가
 * 
 * 
 * 
*/


public class C01ArrayExample {
	
	public static void main(String[] args) {
		
		
		// 1. 방을 만들고 각 호실에 데이터를 따로 입력
		int[] arrInt = new int[5];      // 1) 방을 만듦 (5개의 방)
		arrInt[0] = 1;                  // 2) 각 호실에 값(데이터)를 넣음
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		
		                // 호실(Index)의 총 수 = 배열길이 - 1              모든 언어 동일
		
		
		
		// 2. 선언과 동시에 각 호실에 데이터를 한번에 입력
		int arrInt2[] = {1,2,3,4,5};
		
		
		
		System.out.println(arrInt);             //주소값출력
		System.out.println("arrInt[0] = " + arrInt[0]);
		System.out.println("arrInt2[1] = " + arrInt2[1]);
		System.out.println("arrInt[5] = " + arrInt[5]);     //->오류는 안뜨지만 실행 안됨
		
		
		
		
		
		// 3. 선언 -> 방만들기 -> for반복
		
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}                         // 1) -0부터 시작해서 배열길이 -1번째까지 반복
		
		
		
		
		
		
		
		char[] alpha = new char[25];                       //알파벳 개수 
		for( char i = 0; i <alpha.length; i++) {
		     alpha[i] = (char)(i +65);	
		}
		
		for (int i = 0; i < alpha.length; i++) {
			System.out.println((char)alpha[i]);
		}
		
		                          // 2) A~Z 까지 char[] 넣어라
		
		
		
		
		
		int stdScores[] = {90, 100, 50};
		int totalScore = 0;
		for( int i = 0; i < stdScores.length; i++ ) {
			totalScore += stdScores[i];
		}
        System.out.println("평균 = " + totalScore / 5);  
         
                                  // 3) 학생들의 점수로 평균내기

        
        
	
	
	
	
	
	
	
	
	}
	

}