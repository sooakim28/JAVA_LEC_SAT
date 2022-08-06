/**   << 컬렉션 API >> 
 * 
 * 특징: 가변배열 (배열과 다르게 길이가 고정되지 않고 변경가능) 
 * 
 *  
 *
 */
import java.util.*;   // (import java.util.List; 도 가능)

public class C07CollectionExample {
	
	public static void main(String[] args) {
		
		int arrA[] = new int[3];        // (일반적인) 배열은 길이 고정(변경불가)
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		
		
		
		// Collection
		// 1) List: 중복허용, 데이터 차례대로 쌓임
		
		  // List list = new ArrayList();   //ArrayList 타입의 클래스를 heap에 만듦
		List<StudentA> list = new ArrayList();           // cf. 제너릭: <클래스명> 형태추가, 컬렉션에 담길 수 있는 데이터타입 지정 목적 (장점 데이터타입의 모호성 감소, 형변환 필요X)
		//list.add(new Integer(1));
		//list.add(new Integer(2));
		//list.add(new Integer(3));                            //list.get(0); 이렇게 사용(get이라는 매소드 사용),    arrA[0]과 의미는 같음 
		
		list.add(new StudentA());
		
		
		for(int i = 0; i <=list.size(); i ++) {
			System.out.println("list.get(" + i + ") = " + list.get(i)); 
		}
		
		list.get(3).printName();     컬렉션은 object 타입의 클래스만 받으므로 형변환(casting) 필요
	    // ((StudentA)list.get(3)).printName(); 
		
		
		
		
		    // 길이 늘리기
		list.add(new StudentA());
		list.add(new StudentA());
		
		   // 길이 줄이기
		list.remove(0);
		list.remove(3);
		
		
		
		
		
		
		   // 향상된 for문 사용
		for(StudentA val : list) {
			val.printName();                  
		}
		
		
		
		
		
		
		// 2) Set: 중복허용X, 데이터 순서 없이 무작위로 쌓임
		
		
		
		
		
		
	}

}









// Student Value Object (데이터용으로만 사용되는 클래스)

class StudentA {
	public void printName() {
		System.out.println ("냥냥");
	}
}