package com.test.two;

import com.test.one.Student;

public class Student2  extends Student{
	
	public void test() {
		
		System.out.println("다른 패키지내의 자식 클래스에서 접근");
		//System.out.println("private a : " + this.a);
		System.out.println("public b : " + this.b);
		System.out.println("protected c : " + this.c);
		//System.out.println("dafault d : " + this.d);
		System.out.println();
		
	}

}
