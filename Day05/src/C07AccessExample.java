/**
 * << 접근 제한자 >>
 * 
 * 1. 종류: public, protected, default(기본), private
 * 2. 특징: 붙을 수 있는 곳
 *         1) 클래스: public, default 만 가능
 *         2) 매서드
 *         3) 클래스 전역 변수
 */


class Class01 {                //   => 접근제한자 쓰지 않으면 default                      //나를 호출할 수 있는 건 내 방에 있는 나를 아는 사람들 => (같은 폴더(패키지) 내에 있는 사람들(프로그램/클래스들))    default
	                                                                                 
	private int money = 100;                                                         //내가 가진 돈은 나밖에 접근할 수 없음     private
	String name = "냐";                                                               //내 이름을 바꿀 수 있는 사람은 내 방에 있는 나를 아는 사람들   default
	protected int getMoney(int m) {    // m => 빌린돈                                  //나한테 돈을 가져갈 수 있는 사람은 나랑 아는(다른방에 있어도) 사람들    protected
 		money -= m;
		return m;
	}
	
	public void sayMyName() {                                                         //내 이름을 물어볼 수 있는 사람은 전세계 모두   public
		System.out.println(name);
	}
}


public class C07AccessExample {
     public static void main(String args[]) {
    	 
    	 Class01 cs = new Class01();
    	 //cs.money = 1000;            // money는 private 접근제한자이기 때문에 접근 불가
    	 cs.name = "냐냐";            // name은 default 접근제한자이기 때문에 접근 가능
    	 int money = cs.getMoney(50);
    	 System.out.println("빌린돈 " + money + "원");
     }

}
