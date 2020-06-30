package com.test.project;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class TinsentiveView {
	//스캐너
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		TLogin Tlogin = new TLogin();	//메소드 재 선언
		Tlogin.tLogin();	
		insentiveView();
	}
	
	
	
	public static void insentiveView() {

		String teacherSeq = TLogin.tseqLogin.get(0);
		String tname = TLogin.tnameLogin.get(0);


		Connection conn = null;
		CallableStatement stat = null;
		DBUtil util = new DBUtil();
		
		try {
			
			conn = util.open("211.63.89.59","project","java1234");

			
			String sql = "";
			
			//과정 + 질문 가져오기			
			sql =  "{ call procIncentiveView(?,?,?,?) }";
			
			stat = conn.prepareCall(sql);
			
			stat.setString(1, teacherSeq);
			stat.registerOutParameter(2, OracleTypes.NUMBER);
			stat.registerOutParameter(3, OracleTypes.NUMBER);
			stat.registerOutParameter(4, OracleTypes.NUMBER);
			
			stat.executeQuery();
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("\t\t\t과정 평가 총첨");
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println();
			System.out.printf("\t\t\t[%s]님의 과정 평가 총첨은\n", tname);
			System.out.printf("\t\t\t[%s]점 입니다.\n",(int)(stat.getFloat(3) * 100));
			
			while(true) {
				
				System.out.println("\t\t\t1. 교사평가 조회");
				System.out.println("\n");
				System.out.println("\t\t\t" + "a. 뒤로가기");
				System.out.println("\t\t\t" + "b. 처음으로가기");
				System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.print("\t\t\t입력 : ");
					
				String backHome = scan.nextLine();
					
				if(backHome.equals("1")) {
					TassView tassView = new TassView();	//메소드 재 선언
					tassView.TAssView();	
					insentiveView();
				}
				else if(backHome.equals("a")) {
					//joo 뒤로가기 만들기
					break;

				} else if(backHome.equals("b")) {
						
//					home();
					break;
						
					
				} else {
						
					System.out.println("\t\t\t" + "잘못된 입력입니다. 다시입력하세요");
			
				}
			}
			
			

			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println();
			
			stat.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
