package com.test.two;

import com.test.one.Student;

public class Item {
	
	public void test() {
		
		Student s1 = new Student();
		
		System.out.println("다은 패키지내의 다른 클래스내에서 접근");
		//System.out.println("private a : " + s1.a);
		System.out.println("public b : " + s1.b);
		//System.out.println("protected c : " + s1.c);
		//System.out.println("dafault d : " + s1.d);
		System.out.println();
	
		
	}
	

}
