/** 
 * 1. 전체과정 요약
 * 
 *   1) Database 연결 
 *      필요한 정보: 호스트(데이터베이스의 주소), 계정(아이디/패스워드), 사용할 데이터베이스 이름(javadb 등)
 *              호스트 - "jdbc:mariadb://localhost:7306/javadb" 형태
 * 
 *   2) Query문 
 *   3) 결과문확인
 *   
 * 
 * 
 * 2. JDBC (6가지): SQL을 날리기 위한 작업  - 상세과정
 *   1) 드라이버 로딩: MYSQL DRIVER, ORACLE DRIVER, MSSQL DRIVER 등
 *   2) 드라이버 연결: DriverManager.getConnection()   +   주소(host), 아이디, 패스워드, 사용 데이터베이스명
 *   3) DB와 프로그램상 질의문(query, sql) 전달하고 결과를 받을 수 있는 통로 만들기  +  
 *      Statement 객체 생성: conn.createStatement(); 
 *   4) sql문 작성: String sql = "select * from student";
 *   5) 쿼리전송 후 처리
 *      stmt.execute().... executeQuery() 등등   +    select 계열의 경우 Resultset으로 처리      ex. Resultset rs = stmt.executeQuery(sql); 
 *                                                   select 외 다른 커리 (insert, delete, update) 는 resultset이 없으므로 stmt.execute(sql)로 써도 됨
 *                                                
 *   6) 프로그램 종료(자원반납): 1 DB연결 닫기  -   conn.close();   ,      2 Statement 닫기  -   stmt.close();
 *   
 *   
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class C01MariaDBExample {
	
	
	public static void main (String[] args)  throws Exception  {
		
		//데이터베이스 커넥션 객체 생성
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");        // ClassNotFoundException 발생가능
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:7306/javadb",
					"root",
					"1234"
					);                                        // SQLException 발생가능
			
			if(conn == null) {
				System.out.println("연결ㄴ");
			} else {
				System.out.println("연결ㅇ");
			}
			
		
		
		}catch (ClassNotFoundException ex) {
			System.out.println("jdbc jar가 없음");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} catch(Exception ex) {                            //exception ex: 나머지 오류
			System.out.println("알 수 없는 예외 발생");
		}
		
		
		
		
		
		//자바에서 DB에 있는 students 테이블의 데이터 모두 끌어오기
		String sql = "Select * from students";
		
	    // 자바에서 DB에 Query(명령문?) 할 때
		//     1) Statement 작성,   2) Select(read)의 경우 이 결과값을 리턴타입ResultSet(recordset)으로 받아옴 
		Statement stmt = conn.createStatement();   // Statement라는 객체를 생성하고 conn이라는 데이터베이스의 statement를 가져옴?  (연결된 RDBMS에 SQL구문을 전달하는 객체가 statement)
		
		
		ResultSet rs = stmt.executeQuery(sql);   // 시킬거 담아서 실행                                    resultset: 테이블 전체 모양
		
		
		while(rs.next()) {
			System.out.println(rs.getString(1));  // 컬럼명: student_id
			System.out.println(rs.getString("student_name"));   // 컬럼명 student_name 그대로 꺼내온것
		}
		 
		
		
		
		/* 데이터 넣기
		sql = "insert into students (student_id, student_name)" + " values (3, '나나1'); ";
		boolean isAffected = stmt.execute(sql);
		if (!isAffected) System.out.println("입력성공");    else System.out.println("입력실패"); */
		
		
		
		// 데이터 삭제
		sql = "delete from students where student_name = '나나1'";
		stmt.execute(sql);
		
		// 데이터 변경
		sql = "update students set student_name = '뽀' where student_id = 1";
		stmt.execute(sql);
		
		// 자원반납 (데이터 그만 받는거 설정)
		stmt.close();
		conn.close();
		
		
	}

}
