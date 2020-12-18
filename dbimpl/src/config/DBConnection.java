package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getInstance() {
		Connection conn=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe"; 	//순수하게 자바로만 연결하는 것
		//String url="jdbc:oracle:oci:@";	// 특정 운영체제 함수로 연결하는 것 속도는 더 빠름
		String username="SCOTT";
		String password="TIGER";
		
		// OracleDriver 클래스를 메모리에 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // => new 한 것과 같음
			//OracleDriver o=new OracleDriver();
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("DB연결 성공");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB연결 실패");
		return null;
	}
}
