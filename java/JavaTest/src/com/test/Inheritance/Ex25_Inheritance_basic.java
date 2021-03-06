package com.test.Inheritance;

public class Ex25_Inheritance_basic {
	
	public static void main(String[] args) {
		
		//상속, inheritance
		// - 클래스와 클래스간에 발생
		// - 부모 클래스 역할  <-> (상속) <-> 자식 클래스 역할
		// - 부모 클래스가 구현한 모든 맴버(변수, 메소드)를 자식 클래스에게 물려주는 기술
		// - 코드 재사용(*********)
		
		// - 상속 관계에 있는 클래스
		// -  부모 클래스 <-> 자식 클래스
		// - 슈퍼 클래스 <-> 서브 클래스
		// - 기본 클래스 <-> 확장(파생)클래스
		
		
		Child c = new Child();
		
		//상속된 멤버
		c.a = 10;
		c.b = 20;
		c.aaa();
		
		//구현한 멤버
		c.c = 30;
		c.d = 40;
		c.bbb();
		
		DDD d = new DDD();
		d.a = 10;
		d.b = 20;
		d.c = 30;
		d.d = 40;
		
		
		
	}//main
	

}//Ex25


class Parent { //부모는 자식이 누구인지 표현X
	public int a;
	public int b;
	
	public void aaa() {
		
	}
	
	
}

class Child extends Parent { 
	
	//상속된 멤버
	//a, b, aaa()
	
	//구현한 멤버
	public int c;
	public int d;
	
	public void bbb() {
		
	}
	
	
}

class AAA {
	public int a;
}

class BBB extends AAA{
	public int b;
}

class EEE extends AAA{
	public int e;
}

class CCC extends BBB{
	public int c;
}
class DDD extends CCC{
	public int d;
}










