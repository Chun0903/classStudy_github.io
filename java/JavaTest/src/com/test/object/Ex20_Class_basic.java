package com.test.object;

public class Ex20_Class_basic {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		
		Person p2 = new Person();
		p1.setName("아무개");
		
		Person p3 = new Person();
		p1.setName("하하하");
		
		//참조형 배열
		Person[] list = new Person[3]; //Person 객체가 몇개 생성되었습니까? 3개(X), 0개(O)
										//참조변수가 3개 만들어짐

		list[0] = new Person();  	//Person 자료형에 Person 객체를 생성
		list[1] = new Person();
		list[2] = new Person(); 	//배열 3개 다 만듦

		//java.lang.NullPointerException //null인 상태에서 무언가 들어있는 엑션을 취함
		list[0].setName("홍길동");		//이것만 쓰면에러!! "list[0] = new Person(); 를 쓰자"
	
		
		
		
		
		
		
		
	}//main

}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}