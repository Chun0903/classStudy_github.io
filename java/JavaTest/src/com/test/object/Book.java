package com.test.object;

public class Book {
	
	//조건 
	//객체의 정보 - 제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
	//모든 멤버 변수의 접근 지정자는 private로 한다
	//멤버 접근을 위한 Setter와 Getter를 정의한다
	//	- 제목		: 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자)
	//	- 가격		: 읽기/쓰기, 0~1000000원
	//	- 저자		: 읽기/쓰기, 제한X
	//	- 출판사	: 쓰기전용
	//	- 발행년도 	: 읽기전용(2020년)
	//	- ISBN		: 읽기/쓰기
	//	- 페이지수 	: 읽기/쓰기, 1~무제한
	//Book개체의 모든 정보를 문자열로 변환하는 메소드 구현 = String infor()
	
	
	private String nameBook;
	private int price;
	private String nameWrite;
	private int page;
	private String company;
	private int year = 2020;
	private String isbn;
	
	//제목
	//최대 50자 이내(한글, 영어, 숫자)
	public String getNameBook() {
		return nameBook;
	}
	
	public void setNameBook(String nameBook) {
		
		if(checkNameBook(nameBook)) {
			this.nameBook	 = nameBook;
		}else {
			System.out.println("제목이 유효하지 않습니다.");
		}
	}
	
	private boolean checkNameBook(String nameBook) {
		//최대 50자 이내(한글, 영어, 숫자)
		
		if(nameBook.length() <0 || nameBook.length()>50) {
			return false;
		}
		
		for(int i=0; i<nameBook.length(); i++) {
			char c = nameBook.charAt(i);
			
			if((c < 'A' || c < 'Z')
					&& (c < 'a' || c > 'z')
					&& (c < '가' || c > '힣')
					&& (c < '0' || c > '9')
					&& (c != ' ')) {
				return false;
			}//if
		
		}
		return true;		
	}//checkNameBook
	
	//가격
	//읽기/쓰기, 0~1000000원
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		if(price >=0 && price<1000000) {
			this.price = price;
		}
	}
	
	
	//저자
	public String getNameWrite() {
		return nameWrite;
	}
	public void setNameWrite(String nameWrite) {
		this.nameWrite = nameWrite;
	}
	
	//출판사
	public void setCompany(String company) {
		this.company = company;
	}
	
	//발행년도
	//(2020년)
	public int getYear() {
		return year;
	}
	
	//ISBN
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//페이지수
	//1~무제한
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page >0) {
		this.page = page;
		}
	}

//public String getLevel() {
//		
//		if(this.price < 30000 && this.button >=5) {
//			return "상"; 
//		} else if(this.price < 50000 && this.button >4) {
//			return "중";
//		} else {
//			return "하";
//		}
//		
//	}

	
	public String Infor() {
		
		String infor = nameBook			+"\n" 
						+ (price +"")	+"\n" 
						+ nameWrite		+"\n" 
						+ (page +"")	+"\n" 
						+ (year + "" )	+"\n" 
						+ isbn;
		
		return infor;

		
		
		
	}
	
	
	
	
	
	
	
}
