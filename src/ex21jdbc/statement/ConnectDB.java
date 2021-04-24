package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//객체생성의 목적이아닌 상속의 목적으로 정의된 추상클래스
public abstract class ConnectDB{
	/*
	멤버변수 : 상속받은 하위클래스에서 접근을 허용하기위해
	  접근지정자는 protected로 선언함 
	 */
	protected Connection con; //DB연결
	protected Statement stmt; //쿼리전송 및 싫랭
	protected ResultSet rs;//select 쿼리 실행후 결과 반환 

//생성자 1(매개변수를 가진 메소드)
public ConnectDB(String id,String pw) {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe",
					id,pw);
		System.out.println("오라클 db연결성공");
	}
	catch (ClassNotFoundException e) {
		System.out.println("오라클드라이버 로딩실패");
		e.printStackTrace();
	}
	catch (SQLException e) {
		System.out.println("DB연결실패");
		e.printStackTrace();
	}
	catch (Exception e) {
		System.out.println("알수없는예외발생");
		// TODO: handle exception
	}
}
//생성자 2(매개변수가 없는 메소드)
public ConnectDB() {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:xe",
					"kosmo","1234");
		System.out.println("오라클 DB연결성공");
	}
	catch (ClassNotFoundException e) {
		System.out.println("오라클드라이버 로딩실패");
		e.printStackTrace();
		
	}
	catch (SQLException e) {
		System.out.println("DB연결실패");
		e.printStackTrace();
	}
	
	catch (Exception e) {
		System.out.println("알수없는예외발생");
		// TODO: handle exception
	}
}
//자원반납을 위한 메소드 
	public void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("자원반납완료");
		} catch (SQLException e) {
			System.out.println("w자원 반납시 오류발생");
			}
	}
	//오버라이딩 목적으로 생성한 추상메소드
	abstract void execute();

}
