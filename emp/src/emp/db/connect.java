package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {

	public static void main(String[] args) {
		//데이터베이스 서버와 연결
		
		
		try {
			//드라이버 로드 oracle.jdbc.OracleDriver(예전)
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			//드라이버매니저를 통해 연결시도
			Connection con = DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결 성공");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
