package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	//멤버변수
	private Connection con;
	private Statement stmt;
	//생성자: 오라클 드라이버에 대한 로드만 진행
	public DeleteQuery() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩실패");
			e.printStackTrace();
		}
			
	}
	//오라클에 대한 연결을 진행하는 메소드 
	public void connect() {
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe",
					"kosmo",
					"1234");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결오류");
			e.printStackTrace();
		}
	}
	//오라클연결, 쿼리작성,전송 및 실행을 위한 메소드
	public void execute( ) {
		//여기서 오라클 연결
		connect();
		try {
			/*
			아이디 ko1은 실제 존재하지 않으므로 조건에 일치하는 레코드가
			없어 삭제가 되지않는다. 조건에맞는데이터가 없어다로 오류가 발생하지 않는다.
			 */
			stmt=con.createStatement();
			String query=" DELETE FROM member WHERE id='test1'";
			int affected = stmt.executeUpdate(query);
			System.out.println(affected+"행이삭제됨");
			
		} catch (SQLException e) {
			System.out.println("쿼리실행오류 ");
			e.printStackTrace();
		} 
		finally {
			close();
		}
	}
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("자원반납완료");
		} catch (Exception e) {
			System.out.println("w자원 반납시 오류발생");
			e.printStackTrace();
			}
		
	}

	public static void main(String[] args) {
		new DeleteQuery().execute();

		/*
		 * 객체생성후 메소드를 호출하는 동일한 문장임
		DeleteQuery dSQL=new DeleteQuery();
		dSQL.execute();
		 */
	}

}
