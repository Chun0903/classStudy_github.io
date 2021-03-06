package com.test.object;

public class Ex16_Class_basic {
	
	public static void main(String[] args) {
		
		
		/*	
		클래스, Class
		- 객체 지향 프로그래밍 (Object Oriented Programming) 
		- 프로그램을 객체으 행동과 상태 중심으로 풀어나가는 방식
		- 코드의 집합
		- 붕어빵틀
		
		 객체, Object
		 - 클래스로부터 실체화된 결과물
		 - 붕어빵
		 	
		 인스턴트, Instance
		 - 클래스로부터 실체화된 결과물
		 - 붕어빵
		 - 메모리에 실체화된 객체를 인스턴트
		 
		 속성, Property
		 - 객체가 가지는 데이터
		 - 멤버 변수
		 	
		 메소드, Method, 행동, Behavior
		 - 객체가 가지는 행동
		 - 멤버 메소드
			
		 
		 
		 자바에서 클래스 만들기
		 
		 class 클래스명
		 {
		 		//내용물-> 클래스 멤버, Class Member
		 		1. 멤버 변수
		 		2. 멤버 메소드
		 
		 }
				
				
				
		*/
			
		//요구사항] 지도 -> 우리집의 좌표표시 + 저장 + 불러오기 등등...
		
		//Case 1.
		
		//우리집
		String name = "우리집";
		int x = 100;
		int y = 200;
		
		//마트
		String name1 = "마트";
		int x2 = 300;
		int y2 = 400;
		
		
		//Case 2.
		int[] a1 = {100,200}; //x,y
		int[] a2 = {300,400}; //x,y
		
		System.out.println(a1[0]); //x? -> 몇변쩨 데이터인지(의미를) 알 수 없다
		System.out.println(a1[1]); //x?    다른타입의 자료형을 그룹안에 넣을 수 없다.
		
		
		//Case 3.
		// - 클래스 사용 => 클래스의 객체(인스턴스) 생성한다.
		Point p1 = new Point(); //x + y +name 변수 한번에 만들어 놓음
		
		p1.x = 100;
		p1.y = 200;
		p1.name = "우리집";
		
		Point p2 = new Point();//x+ y +name = '우리집'과 이름이 똑같을 뿐 다르다.
		p2.x = 300; 
		p2.x = 400;
		p2.name = "마트";
		
		
		Size s1 = new Size();
		s1.width = 100;
		s1.height = 100;
		
		System.out.println(s1.width);
		System.out.println(s1.height);
		
		//클래스 선언시 권장(필수) 사항
		//1. 하나의 클래스는 하나의 파일로 저장한다.
		//2. 선언된 클래스의 이름이 파일의 이름과 같아야한다.
		//3. 하나의 파일에 2개 이상을 클래스 선언시
		//	a. 반드시 public  키워드 클래스 딱 1개 존재
		//	b. public 키워드 클래스의 이름이 파일명이 된다.-> 대표 클래스
		
		Student2 st1 = new Student2();
		
		st1.name = "홍길동";
		st1.kor = 100;
		st1.eng = 100;
		st1.math = 100;
		st1.total= st1.kor + st1.eng + st1.math;
		st1.avg = (double) (st1.total / 3.0);
		
		//학생 정보 출력
		//A.
		System.out.printf("이름: %s\n",st1.name);
		System.out.printf("총점: %d\n",st1.total);
		System.out.printf("평균: %.1f\n",st1.avg);
		
		//B.
		print(st1);
		
		//C.
		st1.print();
		
		int a = 10;
		int b = 5;
		
		MyMath.add(a,b); //다른 클래스 내 메소드는 클래스명을 생략할 수 없다.
		Ex16_Class_basic.test(); //FM
		test(); //같은 클래스 내의 메소드는 클래스명 생략할 수 있다.
		
		
		Phone t1 = new Phone();
		
		t1.model = "아이폰";
		t1.number = "010-1234-5678";
		t1.owner = "홍길동";
		t1.infor();
		t1.call();
		
		Phone t2 = new Phone();
		
		t2.model = "갤럭시";
		t2.number = "010-2345-6789";
		t2.owner = "아무개";
		t2.infor();
		t2.call();
		
		
		
		
	}//main
	
	private static void print(Student2 st1) {
		
		
		
		System.out.printf("이름: %s\n",st1.name);
		System.out.printf("평균: %.1f\n",st1.avg);
		
	}

	public static void test() {
		
	}
	

}//Ex16


//클래스 선언하는 위치
// - 데이터 집합으로써 사용하기 위해 클래스를 선언함!!
class Point {
	
	//클래스 멤버 변수
	public int x;
	public int y;
	public String name;
}

class Size {
	
	public int width;
	public int height;
	
	
}

//클래스를 생성하는 목적
//1. 데이터 집합 = 멤버 변수
//2. 행동 집합 = 멤버 메소드 // 별로 안씀
//3. 데이터 + 행동집합 =  맴버 변수 + 맴버 메소드 //*********가장 많음

//행동 집합
class MyMath {
	
	public static void add(int a, int b) {
	
		System.out.println(a + b);
	}
	
	public static void substract(int a, int b) {
		
		System.out.println(a - b);
	}
	
}

//데이터 + 행동
class Phone {
	
	//멤버 변수
	public String model;
	public String number;
	public String owner;;
	
	//멤버 메소드: 항상 객체 메소드는 자신의 정보(데이터)를 바탕으로 행동해야 한다.
	public void infor() {
//		System.out.println("전화기 입니다.");
		System.out.printf("%s(이)가 소유하고 있는 전화기 입니다. 번호는 %s 입니다\n"
				,owner,number);
	}
	public void call() {
		System.out.printf("%s의 전화기로 전화를 겁니다.\n",owner);
	}
	
		

		
	
	
}










