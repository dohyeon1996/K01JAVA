package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class InsertProcCall extends IConnectImpl {
	public InsertProcCall() {
		super("kosmo","1234");
	}
	@Override
	public void execute() {
		try {
			/*
			프로시저는 return 값이 없으므로 함수처럼?=로시작하지않는다.
			out파라미터를 통해 값을 반환받게된다.*/
			csmt=con.prepareCall("{call KosmoMemberInsert(?,?,?,?)}");
			//in파라미터설정
			csmt.setString(1, scanValue("아이디"));
			csmt.setString(2, scanValue("패스워드"));
			csmt.setString(3, scanValue("이름"));
			//out파라미터설정 .반환값의자료형을 설정함.
			csmt.registerOutParameter(4, Types.NUMERIC);
			//실행
			csmt.execute();
			//out파라미터의 할당된 값을 읽어 결과를 출력한다.
			int affected = csmt.getInt(4);
			if(affected==0) 
				System.out.println("오류발생입력실패");
			else 
				System.out.println(affected+"행입력성공");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			close();
		}
	}
	

	public static void main(String[] args) {
			new InsertProcCall().execute();
		
	}

}
