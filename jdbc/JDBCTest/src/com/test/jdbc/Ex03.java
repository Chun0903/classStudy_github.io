package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Ex03 {
	
	public static void main(String[] args) {
		
		/*
		 
		 Statement 클래스
		 - SQL 문장을 실행하는 역할
		 - 쿼리 작업 담당 + 연결 정보 X (-> Connection 객체 의존)
		 - 모든 DML은 자동 커밋이 된다.(JDBC)*****
		 
		 Statement 종류
		 1. Statement 클래스
		 	- 기본
		 2. PreparedStatement 클래스
		 	- 인자값 관련 특화된 기능
		 	- 코드 안전성 높음, 가독성 높음
		 	- 코드량 많음
		 3. CallacleStatement 클래스
		 	- 프로시저 전용 Statement
		 
		 */
		
		//insert 작업
		
		Connection conn = null;
		
		//1. 접속
		DBUtil util = new DBUtil();
		conn = util.open();
		
		try {

		//2. 질의 문자열
		// - ORA-00911: invalid character
		// - 한번(Statement)에 한 문장만 실행 가능 > 문장 종결자(;) 사용 불가능
		String sql = "insert into tblAdress (seq, name, age, tel, address, regdate) "
				+ "values (seqAddress.nextVal, '아무개', 20, '010-1234-5678','서울시 강남구 역삼동'"
				+ ", default)";
		
		//3. 객체 생성
		Statement stat = conn.createStatement();
		
		//4. SQL 실행
		//4.1 반환값이 없는 쿼리
		//	- stat.executeUpdate()
		//4.2 반환값이 있는 쿼리
		//	- stat.executeQuery()
		
		//execute() + 자동 커밋 발생
		stat.executeUpdate(sql); // DBMS 쿼리 전달 + 실헹 > Ctrl+Enter
		
			
		//5. 접속 종료
		stat.close();
		util.close();
		
		System.out.println("완료");
		
		} catch (Exception e) {
			System.out.println("Ex03_Statement.main()");
			e.printStackTrace();
		}
		
		
		
	}

}
