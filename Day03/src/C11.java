
public class C11 {
	
	public static void main(String[] args)  {
		
		
		
	    for(int x1 = 2; x1 <= 9; x1 ++) {        // x * y => x축 결정됨
	    	
	    	if(x1%2 != 0) continue;     //짝수단만 출력
	    
	    	
	    	System.out.println("====" + x1 + "단 ====="); 
	    
	    	
	    for(int y1 = 1; y1 <= 9; y1++ )     { // y축
    		System.out.println(x1 + " x " + y1 + "=" + (x1 * y1));
	  
	    	if( y1 == 5 ) break;
	        }
	    		

	    }
	    		
	}   		
	    
}
	


