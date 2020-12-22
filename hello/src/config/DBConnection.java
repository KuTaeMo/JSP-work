package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/users?serverTimezone=Asia/Seoul";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, "ssar", "0000");
			
			System.out.println("DB 연결됨");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
