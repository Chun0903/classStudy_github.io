package com.test.Inheritance;

public class Ex26_Overriding_basic {
	
	public static void main(String[] args) {
		
		//메소드 오버로딩, Method Overloading
		//메소드 오버라이딩 , Method Overriding
		
		// 메소드 오버라이드
		// - 메소드 재정의(다시 선언)
		// - 메소드의 시그너처(헤더)는 그대로 두고, 구현부를 다시 만드는 작업
		// - 상속 관계에서 나타나는 현상
		// - 상속 관계에 있는 클래스보다 그 클래스 사용하는 쪽에서 더욱 편하다. 
		// 	  여러 메소드명을 기억하지 앟아도 되기 떄문에..
		
		OverrideParent p = new OverrideParent();
//		p.hello();
		
		OverrideChild c = new OverrideChild();
//		c.hello();
		
		p.hello();
//		c.hi();
		c.hello();
		
		
	}//main

}//Ex26

class OverrideParent {
	
	public void hello() {
		System.out.println("안녕하세요");
	}
	
}


class OverrideChild extends OverrideParent {
	
//	public void hi() {
//		System.out.println("방가~");
//	}
	
	//오버라이드 발생
	// - 부모가 상속해준 메소드를 동일한 시그너처로 다시 만드는 작업
	// - 부모가 상속해준 메소드 감춰진다.(****)
//	public void hello() {
//		System.out.println("방가~");
//	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}


