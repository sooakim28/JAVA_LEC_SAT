/**  <<조건문>> 
 * 
 * 2. Switch문:  
 * 
 *
 */

public class D0309ConditionExample2 {
	
	public static void main(String[] args)  {
		
		
		int a = 5;             //입력값
		
		
		switch(a) {
		case 5:
			System.out.println("5임");
			System.out.println("꺄");
			break;                                     //break 없으면 무조건 뒤에있는 모든 case 다 출력
		case 10: 
			System.out.println("10임");
			break;                                      
		default:
			System.out.println("맞는 숫자가 없음");       //위 두 case 모두에서 실행 안될시 표시
		}
		
		

		a = 6;
				
		if (a == 5) {
			System.out.println("5");
			
		} else if (a == 10) {
			System.out.println("10");
			
		} else {
		    System.out.println("ㄴㄴ"); 
		}
		
		
		
		String name = "하";
		switch (name) {
		case "허" :
			System.out.println("허");
			break;
	    default:
	    	System.out.println(name + " 했음");
		
		}
				
		
		
	}
	
	

}
