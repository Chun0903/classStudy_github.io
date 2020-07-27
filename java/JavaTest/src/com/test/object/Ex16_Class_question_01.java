package com.test.object;

public class Ex16_Class_question_01 {
	
	public static void main(String[] args) {
		
		//Ex16_Class_question_01 : 테스트 중심
		//Book.java :문제의 중심
		
		Book b1 = new Book();
		
		b1.setNameBook("바람과 함께 사라지다");
		b1.setPrice(25000);
		b1.setNameWrite("홍길동");
		b1.setCompany("문학사");
		b1.setPage(500);
		b1.setIsbn("5n13ss1513rr42");
		
		System.out.println(b1.getNameBook());
		System.out.println(b1.getPrice());
		System.out.println(b1.getNameWrite());
		System.out.println(b1.getPage());
		System.out.println(b1.getIsbn());
		System.out.println("===============================");
		System.out.println(b1.Infor());
		
		
	}

}
