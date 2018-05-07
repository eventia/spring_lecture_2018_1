package com.javalec.ex;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class OracleConnectionTest {
	
	private static final Logger logger = LoggerFactory.getLogger(OracleConnectionTest.class);
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL =  "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "spring";
	private static final String PW = "1234";
	
	@Test // anotation , JUNit 이 테스트하는 메소드
	public void test() throws Exception {
		Class.forName(DRIVER);
		try(Connection conn = DriverManager.getConnection(URL, USER, PW )){
			logger.info("오라클에 연결되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// fail("Not yet implemented");
	}

}
