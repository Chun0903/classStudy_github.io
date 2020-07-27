package com.test.object;

public class User {

	//클래스 => 객체를 만들어내는 틀
	//객체 = 데이터(멤버변수) + 행동(멤버메소드)
	
	//멤버변수 private
	private String name;
	private String id;
	private int gender;
	
	
	//getter, setter ->인터페이스
	public void setName(String name) {
		
		if((name.length()>=2 && name.length()<=5) && checkName(name)) {
			
			//this : 객체 자신을 가르키는 키워드(자신의 주소값 참조)
			this.name = name;
		}else {
			System.out.println("이름은 한글 2~5자 이내로 입력");
		}
		
		
	}
	public String getName() {
		
		return this.name;
	}
	
	private boolean checkName(String name) {
		
		for(int i=0; i< name.length(); i++) {
			//한문장씩 추출
			//1. 문자코드값?-> cjharAt()
			//2. 단숭히 문자 1개 필요? -> substring()
			char c = name.charAt(i);
			
			if(c < '가' || c>'힣') {
				return false; //값 변환 + 메소드 중단
			}
		}	
		return true;
		
//			String s = "홍";
//			chae c = '홍';
//			
//			(int)c; //숫자 -> 숫자
//			(int)s; //주소값(참조형) -> 데이터(값형)
//			//**** 참조형과 값형간에는 형변환이 불가능!!!
	}
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		//길이: 4~12자 이내
		//영문자 + 숫자 +_
		//숫자로 시작X
		
		if(checkID(id)) {
			this.id = id;
		}else {
			System.out.println("아이디 유효하지 않음");
		}
	}
	private boolean checkID(String id) {
		
		//길이: 4~12자 이내
		//영문자 + 숫자 +_
		//숫자로 시작X
		if(id.length() <4 || id.length()<15) {
			return false;
		}
		
		for(int i=0; i<id.length();i++) {
			char c = id.charAt(i);
			
			if((c < 'A'|| c > 'Z') 
					&& (c< 'a' || c> 'z') 
					&& (c <'0' || c >'0')
					&& c !='_') {
				return false;
			}
					
		}
		
		if(id.charAt(0) >= '0' && id.charAt(0)<='9') {
			return false;
		}
		
		return true;
	}
	
	
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		
		if(gender == 1 || gender == 2) {
			this.gender = gender;
		}else {
			System.out.println("성별은 1과 2만 가능");
		}
		
	}
	
	
}
