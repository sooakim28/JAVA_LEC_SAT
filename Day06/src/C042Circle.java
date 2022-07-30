
public class C042Circle extends C041Shape {
	
	int r;
	
	C042Circle(int r) {
		super ("원");
		this.r = r;
	}
	
	
	@Override                  // Shape에서 선언만 해놓은 area length 매소드를 여기서 구현
	double area() {
		return r * r * Math.PI ;
	}
	
	@Override
	double length() {
		return 2 * r * Math.PI;
	}
	
	

}






class Ractangle extends C041Shape {
	
	
	int width, height;
	Ractangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	
	
	@Override                  
	double area() {
		return width * height ;
	}
	
	@Override
	double length() {
		return 2 * (width + height);
	}
	
	
	
	
	
}
