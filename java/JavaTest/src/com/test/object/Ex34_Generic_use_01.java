package com.test.object;

import java.util.Calendar;

public class Ex34_Generic_use_01 {
	public static void main(String[] args) {
		
		//일반 클래스, 추상클래스, 인터페이스, 열거형, 제네릭 클래스
		
		//제네릭 클래스,Generic class

		//m1();
		//m2();
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.getData() + 100);
		n1.setData(200);
		System.out.println(n1);
		
		WrapperObject n2 = new WrapperObject(200); //Boxing
		System.out.println((int)n2.getData() + 200);	//안에 무엇이 들어있는지 모른다. 모든걸 담을수 있지만 꺼내서 제대로 쓰려면 형변환 필요
		n2.setData(300);
		System.out.println(n2);
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.getData().length());
		s1.setData("아무개");
		System.out.println(s1);
		
		WrapperObject s2 = new WrapperObject("유재석");
		System.out.println(((String)s2.getData()).length());
		s2.setData("강호동");
		System.out.println(s2);
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.getData() ? "참" : "거짓");
		b1.setData(false);
		System.out.println(b1);
		
		WrapperObject b2 = new WrapperObject(true);
		System.out.println((boolean)b2.getData() ? "하하" : "호호");
		b2.setData(false);
		System.out.println(b2);
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.getData() + 300); //*** 다운캐스팅 필요 없다.
		n3.setData(400);
		System.out.println(n3);
		
		
	}//main

	private static void m2() {
		//2:30
		//2-30
		//230
		//2시간 30분
		UserTime t1 = new UserTime(2, 30);
		//객체를 호출하면 주소값 출력
		System.out.println(t1);//com.test.object.UserTime@15db9742
		System.out.println(t1.toString());//패키지명.클래스명@해시코드
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		System.out.println(c1.toString()); //메소드 오버라이드(재정의)
		
		//모든 자바 개발자는
		//객체.toString() -> 객체가 가지는 데이터를 문자열로 반환 -> 무조건 기대
	}
	
	public static void m1() {
		
		int a = 10; // 값형 -> 정수
		Integer b = new Integer(10); // 참조형 -> 정수 Wrapper Class, Util Class
		
		long c = 10;
		Long d = new Long(10);
		
		
		System.out.println(a + b);
		
		//1. static 변수
		//2. final 변수 -> 읽기 전용 
		System.out.println(Integer.MAX_VALUE);
		
	}

}//Ex

//요구사항
// - int -> Integer
//1. int 값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//2. String 값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//3. boolean 값 1개를 중심으로 그 값을 조작하는 클래스를 설계하시오.
//4. double
//5. char
//6. byte
//7. short
//8. float
//9. long
//10. Random
//11. Calendar
//12. UserTime

class WrapperInt {
	
	private int data; //중심데이터
	
//	public WrapperInt() { //기본생산자,생산자가 하나라도 있으면 적용안해준다 만들자
//		this.data = 0;
//	}

	public WrapperInt(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data +""; 
	}
	
}
class WrapperString {
	
	private String data; //중심데이터
	
	public WrapperString(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data +""; 
	}
	
}

class WrapperBoolean {
	
	private boolean data; //중심데이터
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}
	
	public boolean getData() {
		return data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data +""; 
	}
	
}


class WrapperObject {
	
	private Object data;

	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data +""; 
	}
	
	
	
}







class UserTime {
	private int hour;
	private int min;
	
	public UserTime(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
//toString() 재정의
	@Override
	public String toString() {
		return String.format("%d;%d" , this.hour , this.min);
	}
	
}


class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
















