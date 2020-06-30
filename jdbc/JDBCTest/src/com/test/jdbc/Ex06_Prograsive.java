package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06_Prograsive {
	
	
	public static void main(String[] args) {
		
		//insert 작업
		m1();	//Statement	> 정적쿼리
		//m2();	//PreparefStatement > 동적쿼리
		
		//Statement vs PreparedStanent
		//1. SQL 매개변수 유뮤
		//	- select * from tblInsa; > Statement
		//	- select * from tblInsa where num = ?; > PreparedStanent
		
	}

	private static void m2() {
		
		//사용자 입력
		String name = "아무개";
		String age = "25";
		String tel = "010-1212-1212";
		String address = "서울시 강남구''s 역삼동";
		
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();

		try {

			conn = util.open();
			

			String sql = String.format("insert into tblAdress (seq, name, tel, address, regdate) "
					+ "values (seqAddress.nextVal, ?, ?, ?, ?,default)");
			
			
			stat = conn.prepareStatement(sql);
			
			stat.setString(1, name);
			stat.setString(1, age);
			stat.setString(1, tel);
			stat.setString(1, address);
			
			
			stat.executeUpdate();
			
			System.out.println("실행완료");
			

			stat.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m1() {
		
		//사용자 입력
		String name = "아무개";
		String age = "25";
		String tel = "010-1212-1212";
		String address = "서울시 강남구''s 역삼동";
		
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();

		try {

			conn = util.open();
			stat = conn.createStatement();

			String sql = String.format("insert into tblAdress (seq, name, tel, address, regdate) "
					+ "values (seqAddress.nextVal, '%s','%s','%s','%s',default)", name, age, tel, address);
			
			System.out.println(sql);
			System.out.println("실행완료");
			

			stat.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
