
public class C012Application {
	
	public static void main(String[] args) {
		
		//C01ParentExample ex = new C01ParentExample();    //실제 C01Parent~ 클래스에는 매개변수가 있기 때문에 이렇게 빈 클래스 호출하면 에러   (1번 생성자 호출)
		C011ParentExample ex = new C011ParentExample("김뫄뫄", 4);
		ex.printMyInfo();
		
		C011ParentExample ex2 = new C011ParentExample();      //    (2번 매개변수 없는 생성자 호출)
		ex2.printMyInfo();
		
		
		C013ChildExample cx = new C013ChildExample("하악ㅎ");
		cx.printMyInfo();
		
		
	}

}
