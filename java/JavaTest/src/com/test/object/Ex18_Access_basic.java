package com.test.object;

public class Ex18_Access_basic {
	
	public static void main(String[] args) {
		
		User hong = new User();
		hong.setName("홍길동");
		hong.setGender(1);
		hong.setId("hong");
		System.out.println(hong.getName());
		System.out.println(hong.getGender());
		System.out.println(hong.getId());
		
		
		User lee = new User();
		lee.setName("이순신");
		lee.setGender(2);
		lee.setId("lee22");
		System.out.println(lee.getName());
		System.out.println(lee.getGender());
		System.out.println(lee.getId());
		
		
		Mouse m1 = new Mouse();
		
		m1.setModel("로지텍 M705");
		System.out.println(m1.getModel());
		
		//읽기 전용 멤버
		//m1.setButton();
		
		m1.setPrice(50000);
		
		
		//계산된 프로퍼티(멤버), 가상멤버
		System.out.println(m1.getLevel());
		
		
	}//main
	

}
