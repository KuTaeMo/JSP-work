package test.config;

import org.junit.Test;

import config.DBConnection;

public class DBConnectionTest {

	@Test
	public void 데이터베이스연결_테스트() {
		DBConnection.getInstance();
	}
	
	
}
