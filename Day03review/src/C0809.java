
public class C0809 {
	
	public static void main(String[] args) {
		
		
		int gainedP = 80;
		int passP = 90;
		int semipassP = 80;
		
		if(gainedP >= passP) {
			System.out.println("통~과~");
		} else if(gainedP >= semipassP) {
			System.out.println("분발하셈");
		} else {
			System.out.println("ㅠㅠㅎ");
		}
		
		//나이6, 키120, 심장병 없을때 탑승가능
		int age = 6;
		int height = 110;
		int heart = 0;
		


		if(age>=6 && height >=120 && heart == 0 ) {
			System.out.println("탑승가능");
		} else if((age>=6 || height >= 120) && heart == 0) {
			System.out.println ("키 혹은 나이가 안됨");
		} else {
			System.out.println ("심장병 안돼용..");
		}   System.out.println("\n");
		
		
		if(age>=6 && height >=120 && heart == 0 ) {
			System.out.println("탑승가능");
		} else {
			if(age<6) {
				System.out.println("나이");
			}
			if(height<120) {
				System.out.println("키");
			}
			if(heart==1) {
				System.out.println("심장병..");
			}   System.out.println(" 때문에 못타요..");
		}   System.out.println("\n");
		
		
		
		if(age>=6) {
			if(height>=120) {
				if(heart==0); {
				System.out.println("타요!!");
				} else {
					System.out.println("심장병");
				}
			} else {
				System.out.println("키");
			}

		} else {
			System.out.println("나이");
		}
		
		
		
		
		
		
		
		
		
	}

}
