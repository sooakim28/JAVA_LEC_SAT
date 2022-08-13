import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C05NaverPriceDB {
	
	private static C05NaverPriceDB naverPriceDb = null;
	private Connection conn = null;
	
	public static C05NaverPriceDB getInstance() {
		if(naverPriceDb == null) {
			naverPriceDb = new C05NaverPriceDB (); 
		}
		return naverPriceDb;
	}
	
	
	
	
	
	
	
	
	// 1. 데이터베이스 연결 
	public void connectDB() throws Exception {        
		
		// 1) Driver 로딩
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(
				"jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/rks134_db",   //  호스트명
				"rks134",
				"rks1341234"
				
				);
				
		
		
	} 
	
	
	
	

	
	
	// 2. 값 입력
	public void insertNaverPrice(Elements list) throws Exception {
		
		 String sql = "insert into naver_price" 
		 			+ "(goodsName, price, link, in_date_time) values "
		 			+ "(?, ?, ? ,now())";                                    // ?에 각각의 값을 집어넣을 것임
		 
		 PreparedStatement pstmt = this.conn.prepareStatement(sql);
		 
		 for(Element item : list) {
				String goodsName = item.select(".basicList_link__1MaTN").text();
				String price = item.select(".price_num__2WUXn").text();
				String link = item.select(".basicList_link__1MaTN").attr("href");

				//ex. price = "4,000원";
				int intPrice = Integer.parseInt(      price.replace(",", "").replace("원", ""));					  // ,와 '원'을 replace매소드를 이용하여 공백으로 바꿈

				pstmt.setString(1, goodsName);
				pstmt.setInt(2, intPrice);
				pstmt.setString(3, link);
				pstmt.executeUpdate();
			}
		 
		 pstmt.close();
		
	}
	
	
	
	
	
	
	
	
	// 3. 데이터베이스 연결끊기
	public void closeDB() throws Exception {     
		this.conn.close();
	}
	
	
	

	
	
	
	
	

}
