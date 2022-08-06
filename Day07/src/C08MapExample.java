import java.util.Map;    // Map은 인터페이스이기 떄문에 구현해야만 데이터타입으로 인식
import java.util.HashMap;

import java.util.*;

public class C08MapExample {
	
	public void main(String[] args) {
		
		
		// 1) 제너릭이 없는 경우: Map은 Object타입을 기본으로 데이터를 넣고 빼기 때문에 데이터타입에 제한이 없었음 ==> 캐스팅 필요, 각 객체 확인하려면 객체를 하나씩 꺼내서 비교해야 함(instanceOf 매소드 사용)
		
		/*Map map = new HashMap();      // HashMap 클래스를 통해 인터페이스 Map 구현
		map.put("name",  "보라돌이");   // 맵에 값을 담는 작업 ===>    ( key, value)
		
		((String)map.get("name")).length();
		
		"보라돌이".length();
		*/
		
		
		
		
		// 2) 제너릭 사용
		
		Map<String, String> map = new HashMap<String, String>();      // Key와 Value 모두 String 사용하겠다고 고정
		map.put("name", "보라돌이");
		map.put("age", "5");
		map.put("address", "서울");
		map.get("name").length();
		
		
		
		// 3) Map을 값으로 가지는 List Collection 선언
		List<Map> list = new ArrayList<Map>();
		
		// 4) Map<String, String> (키와 값 모두 String인 맵)  이라는 데이터 타입을 값응로 가지는 List Collection 선언(객체까지 생성)
		List<Map<String, String>> list2 = new ArrayList<Map<String, String>>();
		
		
		
		
		Map<String, String> data = new HashMap<String, String> ();
		
		data.put("name", "보라돌이");
		data.put("age", "5");
		list2.add(data);    // 리스트 0번에 데이터 추가
		
	    data.put("name", "뚜비"); 
	    data.put("age", "4"); 
	    list2.add(data);   // 리스트 1번에 데이터 추가   
	         
	          //    ==> 이렇게 하면 데이터 덧씌워짐 (같은 위치에 추가가 됨),    리스트1번 위에 data = new HashMap<String, String>(); 넣어야 안덧씌워짐
		
		
		
	}

}
