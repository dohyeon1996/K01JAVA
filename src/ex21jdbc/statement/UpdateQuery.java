package ex21jdbc.statement;

import java.sql.SQLException;
//추상클래스를 상속하여 정의 
public class UpdateQuery extends ConnectDB{
	//생성자
	public UpdateQuery(String user,String pass) {
		/*
		부모의 인자가 있는 생성자 메소드 호출함. 
		 */
		super(user,pass);
	}
	@Override
	void execute() {
		try {
			//Statement객체 생성
			stmt=con.createStatement();
			//쿼리문 준비 시간 업데이트하는 update문
			String sql="UPDATE member "
					+ " SET "
					+"     pass='0000',     "
					+"   name='영길동' ,     "
					+"    regidate=sysdate     "
					+" WHERE id = 'test99' ";
			System.out.println("sql="+sql);
			/*
			쿼리실행시 사용하는 메소드 종류
			
			executeUpdate() :쿼리문이 insert/update/delete와같이
			기존레코드에 영향을 미치는경우에사용된다. 실행후 영향을받은
			행의 갯수가 int형으로 반환된다.
			executeQuery():select쿼리를 실행할때 호출하는 메소드로
			레코드에 영향을 미치지않고 조회만 하는경우 사용된다.
			조회한 레코드를 반환값으로 받아야 하므로 ResultSet객체를 
			반환타입으로사용하게된다.
			 */
			int affected=stmt.executeUpdate(sql);
			System.out.println(affected+"행이업데이트됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (Exception e) {
			System.out.println("알수없는예외");
			e.printStackTrace();// TODO: handle exception
		}
		finally {
			close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UpdateQuery("kosmo", "1234").execute();
	}

}
