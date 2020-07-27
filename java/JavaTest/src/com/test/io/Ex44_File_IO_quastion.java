package com.test.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Ex44_File_IO_quastion {

	public static void main(String[] args) throws Exception{
		
//		quastion001();
//		quastion002();
		quastion003();
		quastion004();
		quastion005();
		quastion006();
		quastion007();
	}

	private static void quastion007() throws Exception{
		
	}//007

	private static void quastion006() throws Exception{
		
	}//006

	private static void quastion005() throws Exception{
		
	}//005

	private static void quastion004() throws Exception{
		
		//파일 내의 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		// - 리소스 : 성적.dat
		 /* - 출력 :      
							[합격자] 
							홍길동 
							하하하 
							아무개 
							[불합격자] 
							호호호 
							후후후 
		 */
		// - 조건 : 합격 조건: 3과목 평균 60점 이상
		// 				과락 조건 : 1과목 40점 미만
		
		/* - 데이터 형식 :
								    이름,국어,영어,수학
									홍길동,50,60,70
									아무개,100,80,50
									하하하,98,48,56
		 */
		
		File file = new File("D:\\파일_입출력_문제\\성적.dat");
		
		if(file.exists()) {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String contents = null;
			
			while ((contents = reader.readLine()) != null) {
				
				System.out.println(contents);
				
			}
			
			
			
		

			
			System.out.println("완료.");
			
			
		}else {
			System.out.println("파일 없음");
		}
		
		
		
	}//004

	private static void quastion003() throws Exception{
		
		//메모장을 구현하시오
		// - 조건 : 쓰기(이름, 작성시간, 메모내용(단일라인), 메모내용(다중라인))
		// - 읽기 : 메모를 목록으로 출력
		// - 추가: 최신 메모를 먼저 출력
		
	}//003
	
	private static void quastion002() throws Exception{
		
		// 아라비안 숫자를 찾아서 한글로 바꿔 다른이름으로 저장
		// - 리소스 : 숫자.dat
		// - 출력 : 변환 후 다른 이름으로 저장하였습니다.
		// - 조건 : 0 -> 영, 1 -> 일,.., 9 -> 구
		//	- 			저장할 파일명 : 숫자_변환.dat
		
		
		File file = new File("D:\\파일_입출력_문제\\숫자.dat");
		
		if(file.exists()) {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\파일_입출력_문제\\숫자_변환.dat"));
			
			String[] num = {"0","1","2","3","4","5","6","7","8","9"};
			String[] han = {"영","일","이","삼","사","오","육","칠","팔","구"};
			 
			 String contents = null;
			 String real = null;
			 
			 while ((contents = reader.readLine()) !=  null)  {
				 real=contents;
				 
				 for(int i = 0; i<num.length; i++) {
					 real = real.replace(num[i], han[i]);
				 }
				 
				 writer.write(real);
				 writer.newLine();
				 
			 }
			 
			 reader.close();
			 writer.flush();
			 writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		}else {
			System.out.println("파일 없음");
			
		}
		
		
		
	}//002

	private static void quastion001() throws Exception{
		
		// 특정 이름 찾기 > 다른 이름으로 변환 > 해당파일 다른이름으로 저장하기
		//  - 리소스 : 이름수정.dat
		//  - 출력 : 변환 후 다른 이름으로 저장하였습니다.
		//  - 조건:  '유재석' -> '메뚜기'
		//				 저장할 파일명 : 이름수정_변환.dat
		
		File file = new File("D:\\파일_입출력_문제\\이름수정.dat");
		
		if(file.exists()) {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\파일_입출력_문제\\이름수정_변환.dat"));
			
			String contents = null;
			String real = null;
			
			while ((contents = reader.readLine()) !=  null) {
				real = contents.replace("유재석", "메뚜기");
				writer.write(real);
			}
		
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		}else {
			System.out.println("파일 없음");
			
		}

	}//001
	
}












