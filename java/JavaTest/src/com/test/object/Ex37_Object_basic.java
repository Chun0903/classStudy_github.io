package com.test.object;

public class Ex37_Object_basic {
	
	public static void main(String[] args) {
		
		//this vs super 연산자
		ObjectParent p = new ObjectParent();
		
		System.out.println(p.a);
		//System.out.println(p.b);  //(X)
		
		ObjectChild c = new ObjectChild();
		
		System.out.println(c.a);
		//System.out.println(c.b);  //(X)
		
		System.out.println();
		c.test();
		
	}

}

class ObjectParent {
	public int a = 100;
	private int b = 20; //자식에게도 비공개!!
	
	public void chek() {
		System.out.println("부모");
	}
	
	
}

class ObjectChild extends ObjectParent{
	
	public int a = 200;
	private int c = 30;
	
	@Override
	public void chek() {
		System.out.println("자식");
	}
	
	public void test() {
		System.out.println(this.a);		//자식
		System.out.println(super.a); 	//부모
		//System.out.println(this.b);
		System.out.println(this.c);
		this.chek();
		super.chek();
	}
	
	public String toString() {
		return "재정의";
	}
}




















