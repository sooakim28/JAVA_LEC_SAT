
class Counter {
	
	static int count = 0;      // static 변수 =>  클래스가 로딩되는 시점부터(프로그램 시작순간부터) static 영역에 저장되고 프로그램 내내 공유(존재)
	int non_static_count = 0;   // non-static 변수 =>  heap 영역에 올라가는 순간 초기화되며 heap에서 해제(사라지는 시점)되는 순간 삭제됨, 즉 객체에 종속적
	
	
	Counter() {
		count ++;
		non_static_count ++;
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getNonStaticCount() {
		return non_static_count;
	}
	
	
}






public class C05StaticExample02 {
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();         // => 객체 3개 생성
		
		int static_total_count = Counter.getCount();
		int non_static_total_count = c3.getNonStaticCount();
		
		System.out.println("Counter 객체 생성 수(static): " + static_total_count);
		System.out.println("Counter 객체 생성 수(non-static): " + non_static_total_count);
	}

}
