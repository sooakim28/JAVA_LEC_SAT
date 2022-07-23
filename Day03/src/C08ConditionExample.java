/**  <<조건문>>
 * 
 * 1. if 구문:   if(조건식) {실행문}     조건식이 참이면 실행문 실행 
 *              if(조건식) {실행문 else 실행문2}  ?
 *              if(조건식) {실행문} else if {실행문2} else {실행문3} -  ?
 * 2. switch 구문: 
 *
 */
public class C08ConditionExample {
	
	public static void main(String[] args) {
		
		int gainedPoint = Integer.parseInt(args[0]); // 		int gainedPoint = 89;

		
		
		System.out.println("당신이 얻은 점수는 " + gainedPoint + "점 입니다.");
		if(gainedPoint >= 90 )  {          //gainedPoint >= 90이 참일 때만 if 실행됨
		    System.out.println("입사하세요"); 
		} else if ( gainedPoint >= 80) {     // 80~89
			System.out.println("인턴3개월");
		} else {                              // gainedPoint >= 90 이 참이 아닐때 else 실행, 위 사항 중 하나라도 참이 있을시 실행X
			System.out.println("집에가세ㅛ");
			
		
		}                    //실행은 위에서부터 차례대로 수행되고 else를 쓰면 한번 수행된 뒤 그 뒤에는 수행되지 않으므로, 맨 위 조건문을 가장 좁게 설정해야 함. 
		
		
		
		//삼항연산과 비교 (아래 두 식은 같은 식)
		boolean result = 10 > 1 ? true : false;    // 삼항연산
		
		if(10 > 1) {
			result = true;
		} else {
			result = false;     // 조건문
		}
		System.out.println(result);
		
		
		
		// 1)나이6 이상, 2)키120 이상, 3)심장병 없응ㄹ 때
		int age = 5;
		int height = 110; 
		boolean heartAttacted = true;              // 입력칸
		
		if ( age >=6 && height >= 120 && !heartAttacted) {
			System.out.println("타라");
		} else {
			
			
			if (age <6) {
				System.out.println("넌 6세 미만이라 안됨");
				
	        if (height < 120) {
			    System.out.println("넌 키가작아 안됨");
				
		    if (heartAttacted) {
		    	System.out.println("넌 심장병이 있어서 안됨");                     // (else가 아니라 if만 쓰더라도 표현 가능)
		    	
		    }
			}
			}
			
			
			System.out.println("못타ㅎ");	
		}                                                // 1번째 방식, 두가지 조건만 표현가능(타라/못탐)
		
		System.out.println("\n");
		
		
		
		if( age >=6) {
			if (height >=120) {
				if (!heartAttacted) {
					System.out.println ("야 타");
				}
				
			} else {
				System.out.println("키가작아");
				
			}
			
		}else {
			System.out.println("나이가 어려서 못타용");
		}                                                // 2번째 방식, else를 이용해 여러개 표현 가능
		
		
		
	}
	
}

