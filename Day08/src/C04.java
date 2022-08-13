/**    엑셀: csv로 저장   (인코딩 ansi)    csv: ,로 열 구분
 * 
 * 
 * @author TJ
 *
 */
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import org.jsoup.*;

public class C04 {
	
	public static void main(String args[]) throws Exception {
		
		
		//1. 엑셀로 저장 (csv이용: comma split version)
		public static void writeExcelFile (String fileName, Elements list) {
			String title = "순위, 상품명, 가격, 상품링크\r\n";
			String lineFormat = "%s, %s, %s, %s\r\n";
			
			File file = new File(fileName); //fileName = "d:\naverPrice.csv"
			BufferedWriter writer = null;
			
			String result = title;
			for(Element item : list) {
				String goodsName = val.select(".basicList_link__1MaTN").text();
				String price = val.select(".price_num__2WUXn").text();
				String link = val.select(".basicList_link__1MaTN").attr("href");
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
