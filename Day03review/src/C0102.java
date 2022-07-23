

public class C0102 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.println(" a + b = " + (a + b));
		System.out.println(" a + b = " + (a / b));
		
		double c = 4;
		
		System.out.println(" a / c = " + (a / c));   // => 서로다른 자료형을 쓸 땐 큰 자료형으로 강제 형변환
		System.out.println(" c / a = " + (c / a));   // => 대입연산1
		System.out.println("\n");
		

		System.out.println(++a);
		System.out.println("전위연산 결과: " +a);
		System.out.println(a++);
		System.out.println("전위연산 결과: " +a);
		System.out.println(++a);
		System.out.println("전위연산 결과: " +a); 
		System.out.println("\n");
		
		a = 10;
		System.out.println(--a);
		a = 10;
		System.out.println(a--);
		System.out.println(--a);
		
		System.out.println("\n");            		// => 증감연산
		
		
		a = 10;
		a += 1;
		b -= 1;
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = 4;
		a %= 3;
		System.out.println(a);   // => 대입연산2
		
		
		
		
		
	}

}
