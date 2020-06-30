package com.test.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {

	private Connection conn = null;
	
	/**
	 * 서버에 연결합니다.
	 * @return 연결 객체를 반환합니다.
	 */
	public Connection open() {
		
		
		String url = "jdbc:oracle:thin:@211.63.89.59:1521:xe";
		String id = "project";
		String pw = "java1234";

		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url,id,pw);
			
			return conn;
			
		} catch (Exception e) {
			System.out.println("DBUtil.getConnection()");
		}
		
		return null;
		
	}// open
	
	/**
	 * 
	 * @param host = 주소
	 * @param id = 아이디
	 * @param pw = 비밀번호
	 * @return
	 */
	public Connection open(String host, String id, String pw) {
		
		
		String url = "jdbc:oracle:thin:@" + host + ":1521:xe";

		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url,id,pw);
			
			return conn;
			
		} catch (Exception e) {
			System.out.println("DBUtil.getConnection()");
		}
		
		return null;
		
	}
	
	
	
	/**
	 * 연결을 종료합니다.
	 */
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//close
	
}
