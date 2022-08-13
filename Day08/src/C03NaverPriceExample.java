// <<  가격비교  >> 



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C03NaverPriceExample {

	public static void main(String[] args) throws Exception {
		
	while(true) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어를 입력해주세요: ");
		String search_text = sc.nextLine();                                           // nextLine: 사용자 입력을 기다리는 매소드
		
		String url = "https://search.shopping.naver.com/search/all?query=%s-1&frm=NVSCPRO" 
				      + "&sort=price_asc";                                            // 검색어: %s
		url = String.format(url,  search_text);

		
		
		//1. 연결
		Connection conn = Jsoup.connect(url);  // jsoup 클래스     connection 매소드
		
		
		//2. html 가져오기
		Document html = conn.get();
		//System.out.println(html.toString());
		
		
		
		//3. html 에서 내가 원하는 목록 찾아오기
		Elements ele = html.select(".list_basis > div > div");   // list_basis라는 html 클래스명(style sheet)을 선택    -자바스크립트에서는 이런 방법을 selector라고 함
		   //System.out.println(ele.toString());                      // 컬렉션 element를 통해 basis 밑의 div 밑의 div를 가져옴
		
		
		
		// 4. 상품목록 html만 가져와보기    (향상된 for문을 이용하여 위 div 개수만큼 반복)
		for(Element val : ele) { 
			
			String goodsName = val.select(".basicList_link__1MaTN").text();
			String price = val.select(".price_num__2WUXn").text();
			String link = val.select(".basicList_link__1MaTN").attr("href");
			
			System.out.println(goodsName);
			System.out.println(price);
			System.out.println(link);
			//System.out.println(val.toString());
			System.out.println("------------------");
		}
		
		
		
		
		
		writeExcelFile(search_text + ".csv", ele);      // csv 파일쓰기 (아래에 만들어놓고 main에서 실행)
		System.out.println("csv파일 저장");
		
		insertDB(ele);                                   // db에 저장 (아래에 만들어놓고 main에서 실행)
		System.out.println("DB에 저장");      
		
		
		
		
		
		//프로그램 종료 여부
		System.out.print("프로그램을 종료하시겠습니까( Y/N) : ");
		String command = sc.nextLine();
		if(command.toUpperCase().equals("Y")) {                              // toUpperCase: 대문자로 바꿔주는 매소드
			break;
		}
		

		

		
		
	}
		
	}
	
	
	   
	//1. 엑셀로 저장 (csv이용: comma split version)
	public static void writeExcelFile (String fileName, Elements list) throws Exception  {
		String title = "순위, 상품명, 가격, 상품링크\r\n";
		String lineFormat = "%d, %s, %s, %s\r\n";
		
		File file = new File(fileName); //fileName = "d:\naverPrice.csv"
		BufferedWriter writer = null;
		
		String result = title;
		int rank = 1;
		for(Element item : list) {
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href");
			result += String.format(lineFormat,  rank++, goodsName, price, link ) ;
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch(Exception ex) {
			System.out.println("csv작성 중 예외가 발생");
		} finally {
			if (writer !=null) writer.close();
		}
		
	
	}
	
	
	
	
	//2. DB에 값 insert하기
	public static void insertDB(Elements list) throws Exception {
		C05NaverPriceDB db = C05NaverPriceDB.getInstance();            // C05에 이미 Db 열고 데이터넣고 닫는 매소드가 있음
		db.connectDB();    // DB열기                  
		db.insertNaverPrice(list);  // 데이터 넣기
		db.closeDB();      // DB닫기
	}
	
	
	
	
	
	
}




// &sort=price_asc   url 뒤에 이거 붙이면 낮은 가격부터 조회
