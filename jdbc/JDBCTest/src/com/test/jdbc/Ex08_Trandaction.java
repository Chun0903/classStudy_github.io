package com.test.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex08_Trandaction {
	
	public static void main(String[] args) {
		
		/*
		 트랜젝샨 처리
		 1. 오라클 (DBMS)
		  1.1 스크립트 작업 중 > 사용자 직접 > commit or rollback
		  1.2 프로시저 내에서 .> 엄무 제어 (제어문 + exeption) > commit or rollback
		 2. 자바(JDK > 응용)
		 	-Connection 클래스 사용
		  
		  
		 */
		
		//update(댓글 카운트 증가) -> insert(댓글 쓰기)
		
		Connection conn = null;
		Statement stat = null;
		//ResultSet rs = null;
		DBUtil util = new DBUtil();

		try {

			conn = util.open();//연결 직후
			conn.setAutoCommit(false);	//AutoCommit
			
			stat = conn.createStatement();
			String sql = "";

			//업무A.
			sql = "update tblboard set commentCount = commentCount + 1 where seq = 100";
			
			int result = stat.executeUpdate(sql);	//AutoCommit
			
			//업무B.
			sql = "insert into tblcomment (seq, subject, pseq) values (12, '댓글', 1);";

			stat.executeQuery(sql);
			
			result += stat.executeUpdate(sql);	//AutoCommit
			

			stat.close();
			conn.close();
			
			System.out.println("완료");
			
			if(result == 2) {
				conn.commit();
			}else {
				conn.rollback();
			}
				

		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		 
		
	}

}
