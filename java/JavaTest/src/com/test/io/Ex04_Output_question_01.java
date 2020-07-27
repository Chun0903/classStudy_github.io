package com.test.io;

public class Ex04_Output_question_01 {
	
	public static void main(String[] args) {
		
		//01
		System.out.printf("안녕하세요. 제 이름은 \'%s\'입니다.\n 나이는 %d살이고 %s입니다.\n "
				+ "저는 \'%s\'에 살고 있습니다.\n"
												,"홍길동"
												, 20
												, "남자"
												, "서울시 강남구 역삼동");
		
		//02
		String name1 = "홍길동";
		int kor1 = 80;
		int eng1 = 90;
		int math1 = 95;
		int average1 = 88;
		
		String name2 = "아무개";
		int kor2 = 76;
		int eng2 = 86;
		int math2 = 79;
		int average2 = 80;
		
		String name3 = "호호호";
		int kor3 = 89;
		int eng3 = 92;
		int math3 = 85;
		int average3 = 88;
		
		System.out.println("[학생]\t[국어]\t[영어]\t[수학]\t[평균]");
		System.out.println("--------------------------------------");
		System.out.printf("%s\t %4d\t %4d\t %4d\t %4d\n", name1, kor1, eng1, math1, average1);
		System.out.printf("%s\t %4d\t %4d\t %4d\t %4d\n", name2, kor2, eng2, math2, average2);
		System.out.printf("%s\t %4d\t %4d\t %4d\t %4d\n", name3, kor3, eng3, math3, average3);
		
		//03
		System.out.println("[날짜]\t\t [내역]\t\t\t[금액]");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t %s\t %,10d%c\n", "2020-01-01"
												, "카페라테"
												, 4800
												, '원');
		System.out.printf("%s\t %s\t %,10d%c\n", "2020-01-01"
												, "돼지불백"
												, 8500
												, '원');
		System.out.printf("%s\t %s\t %,10d%c\n", "2020-01-02"
												, "마트 장본것들"
												, 125840
												, '원');
		System.out.printf("%s\t %s\t %,10d%c\n", "2020-01-03"
												, "교통 카드 충전"
												, 45000
												, '원');
		System.out.printf("%s\t %s\t\t %,10d%c\n", "2020-01-03"
												, "편의점"
												, 16200 
												, '원');

	 			
	}

}
