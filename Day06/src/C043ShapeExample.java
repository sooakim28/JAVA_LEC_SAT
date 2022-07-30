
public class C043ShapeExample {
	
	public static void main (String args[]) {
		
		C041Shape shape[] = new C041Shape[2];   //방2개
		shape[0] = new C042Circle(5);
		shape[1] = new Ractangle(10,20);
		
		for(C041Shape s : shape) {
			s.area();
			s.length();
			System.out.println(s.type);
			System.out.println("넓이" + s.area());
			System.out.println("둘레" + s.length());
		}
		
	}
	
	
	
	
	
	

}
