package com.test.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		//연결 문자열 생성
		String url = "jdbc:oracle:thin:@211.63.89.59:1521:xe";
		String id = "project";
		String pw = "java1234";
		
		try {
			
			//BD 작업 > 외부 환경 > 예외처리 필수
			
			//설치된 JDBC 드라이버 로딩(상추적인 구문)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속(DB 연결 + Connection 객체 생성 반환)
			conn = DriverManager.getConnection(url,id,pw);
			
			// 접속 확인?
			System.out.println(conn.isClosed());//false(연결O), true(연결X)
			
			// 질의(업무) > select, insert, update, delete...
			
			
			//2. DB 접속종료
			//- Connection 클래스
			conn.close();
			System.out.println(conn.isClosed());//false(연결O), true(연결X)
			System.out.println("성공");
			
		} catch (Exception e) {
			System.out.println("연결 실패");
		}
		

	}//main

}//ex






