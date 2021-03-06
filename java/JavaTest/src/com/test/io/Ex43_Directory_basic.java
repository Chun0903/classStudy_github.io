package com.test.io;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Ex43_Directory_basic {
	
	private static int count = 0;

	public static void main(String[] args) {
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
//		m6();		//****
//		m7();		//****
//		m8();
		
	}

	private static void m8() {

		//정렬
		//D:\Class\java\JavaTest\src\com\test\object
		String path = "D:\\Class\\java\\JavaTest\\src\\com\\test\\object";
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		//정렬 : 이름 -> 크기
		//정령 알고리즘
		// - 버블 정렬 vs 퀵 정렬
		
//		뭔진 모르겠는 정렬....
//		for (int i=0; i <list.length-1;i++) {
//			for(int j= i; j<list.length; j++) {
//				
//				if(list[i].length() < list[j].length()) {
//					
//					File temp = list[i];
//					list[i] = list[j];
//					list[j] = temp;
//				}
//				
//			}
//		}
		
		//버블 정렬
		for (int i=0; i <list.length;i++) {
			for(int j= 0; j<list.length-i-1; j++) {
				
				if(list[j].length() < list[j+1].length()) {
					
					File temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
				
			}
		}
		
		for (File file : list) {
			if(file.isFile()) {
				System.out.printf("[%5dB] %s\n",file.length(),file.getName());
			}
		}
		
	}

	private static void m7() {

		//**************************************
		//m6() -> 재귀 호출 구조로 변경
		
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			
			counFile(dir);
			
		}
		
		System.out.println("총 파일 개수:" + count);
		
	}

	private static void counFile(File dir) {
		//1.자식 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수 세기
		for(File sub : list) {
			if(sub.isFile()) {
				count++;
			}
		}
		
		//자식 폴더를 대상으로 본인이 했던 행동을 다시하기
		for (File sub : list) {
			if(sub.isDirectory()) {
				//똑같은 행동을 반복
				counFile(sub); //재귀 호출
				
			}
		}
	}

	private static void m6() {

		//특정 폴더 -> 파일 개수?
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			
			int count = 0; //누적변수
			
			File[] list = dir.listFiles(); // 이클립스의 자식
			
			for(File sub : list) {
				if(sub.isFile()) {
					count++;
				}
			}//파일 개수
			
			//자식 폴더로 이동
			for(File sub : list) {
				
				if(sub.isDirectory()) {
					
					File[] sublist = sub.listFiles(); // 이클립스의 손자들
					
					for(File subsub : sublist) {
						if(subsub.isFile()) {
							count++;
						}
					}
					
					for (File subsub : sublist) {
						if(subsub.isDirectory()) {
							
							File[] subsublist = subsub.listFiles(); //이클립스의 증손자들
							
							for (File subsubsub : sublist) {
								if(subsubsub.isFile()) {
									count++;
								}
							}
							
						}
					}
					
					
				}
				
			}
			
			
			System.out.println("총 파일 개수 : "+ count);
			
			
			
		}
		
		
	}

	private static void m5() {

		//디렉토리 내용 보기(*********)
		// - 자식파일 + 디렉토리
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
			
			//Returns an array of strings naming the files and directories in thedirectory denoted 
			//	by this abstract pathname. 
//			String[] list = dir.list();
//			
//			for(String name : list) {
//				System.out.println(name);
//				File file = new File(path + "\\" + name);
//				System.out.println(file.length());
//			}
			
			File[] list = dir.listFiles();	//주로 사용
			
//			for (File file : list) {
//				System.out.println(file.getName());
////				System.out.println(file.isFile());
//				if(file.isFile()) {
//					System.out.println(file.length());
//				}
//				
//			}

			for(File sub : list) {
				if(sub.isDirectory()) {
					System.out.printf("[%s]\t",sub.getName());
					System.out.print("\t");
					System.out.print("파일폴더\t");
					Date date = new Date(sub.lastModified());
					System.out.printf("%tF %tT\n",date,date);
				}
			}
			
			for(File sub : list) {
				
				if(sub.isFile()) {
					System.out.print(sub.getName() + "\t");
					System.out.printf("%dKB\t",sub.length() /1024);
					System.out.print("파일\t");
					Date date = new Date(sub.lastModified());
					System.out.printf("%tF %tT\n",date,date);
				}
			}
			
			
		}
		
	}

	private static void m4() {

		//디렉토리 삭제하기
		//- 빈폴더만 삭제 가능하다.
		// - 내용물을 직접 지우면 폴더를 삭제할 수 있다. -> 해당 폴더내의 모든 파일 삭제 후 
		//		폴더를 빈폴더로 만들고 폴더를 삭제 x 반복
		String path = "D:\\class\\java\\io\\GGG";
		File dir = new File(path);
		
		if(dir.exists()) {
			
			System.out.println(dir.delete());
			
		}else {
			System.out.println("없음");
		}
		
		
		
	}

	private static void m3() {

		//디렉토리명 바꾸기 && 이동하가
		String path = "D:\\class\\java\\io\\BBB";
		File dir = new File(path);
		
		if(dir.exists()) {
			String path2 = "D:\\class\\java\\io\\GGG\\BBB";
			File dir2 = new File(path2);
			
			dir.renameTo(dir2);
			
			System.out.println("디렉토리명 바꾸기");
		}
		
		
	}

	private static void m2() {
		
		//디렉토리 조작
		// - 생성, 이름 바꾸기, 이동하기, 삭제하기 , 복사하기(X)		
		
		//새폴더 만들기
//		String path = "D:\\class\\java\\io\\CCC";	//희망 경로
		String path = "D:\\class\\java\\io\\DDD\\EEE\\FFF";	//희망 경로
		File dir = new File(path);
		
//		boolean result = dir.mkdir();		//마지막 목적폴더만 생성
		boolean result = dir.mkdirs();	//경로 안에 있는 폴더 모두 생성
		
		if(result) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
		
		
		//요구사항] 회원 -> 회원별 개인 폴더 작성하기
		String[] member = {"홍길동","아무개","하하하","호호호","후후후"};
		
		for (String name : member) {
			//폴더 생성
			path = String.format( "D:\\class\\java\\io\\AAA\\[개인폴더]%s님", name);
			dir = new File(path);
			dir.mkdir();
			
			System.out.printf("%s님의 개인폴더를 생성했습니다.\n",name);
			
		}
		
		//요구사함] 날짜별 폴더 생성하기
		// - 2020-01-01 ~ 2020-12-31 : 366개
		// - Calendar 사용
		
		Calendar c = Calendar.getInstance();
		c.set(2020,0,1);
		
//		System.out.println(c.get(Calendar.DAY_OF_YEAR));					//남은날
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));				//남은달
//		System.out.println(c.get(Calendar.DAY_OF_YEAR));					//
//		System.out.println(c.getMaximum(Calendar.DAY_OF_YEAR));	//한 해가 몇년인지
		
		for(int i =0; i<366; i++) {
			
			path = String.format("D:\\class\\java\\io\\BBB\\%tF", c) ;
			dir = new File(path);
			dir.mkdir();
			
			System.out.printf("%tF\n",c);
			c.add(Calendar.DATE, 1);
		}
	}

	private static void m1() {
		
		//디렉토리 정보 확인
		// - 디렉토리 참조 객체 -> 정보 or 조작
		
		//디렉토리 참조 객체
		String path = "D:\\class\\java\\io\\AAA";
		
		File dir = new File(path);
		
		if(dir.exists()) {
		
			//디렉토리 정보
			System.out.println(dir.getName());				//AAA, 폴더명
			System.out.println(dir.isFile());						//파일이냐?
			System.out.println(dir.isDirectory());				//폴더냐?
			System.out.println(dir.length());					//0
			
			System.out.println(dir.getAbsolutePath());	//절대경로
			System.out.println(dir.getPath());					//참조경로
			
			System.out.println(dir.getParent());				//부모폴더 경로 반환
			System.out.println(dir.getParentFile());			//부모폴더 참조 객체 반환
			
		}else {
			System.out.println("디렉토리 없음.");
		}
		
	}
	
}


































