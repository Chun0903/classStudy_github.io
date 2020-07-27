package com.test.string;

public class Ex14_String_basic {
	
	public static void main(String[] args) {
		
		//문자열, String
		// - 숫자, 문자, 논리, 문자열, 날짜시간
		
		//문자열 조작 기능
		// -> 메소드 제공
		
		
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		m10();
	}
	public static void m10() {
		
		//"10" -> 10
		String str = "10";
		
		System.out.println((Integer.parseInt(str)));
		
		//10 -> "10"
		int num = 10;
		
		System.out.println(String.valueOf(num));
		System.out.println(num + ""); //10 + "" ->"10"
		System.out.println("" + num); //10 + "" ->"10"
		
		
	}
	public static void m9() {
		
		//문자열 치환
		// - String replace(char old, char new)
		// - String replace(String old, String new)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replace("홍길동", "아무개"));
		System.out.println(txt);
		System.out.println(txt.replace("하하하", "아무개")); //못찾은건 변화 없이 출력
		
		txt = "     하나     둘     셋    ";
		System.out.println(txt.replace(" ", ""));			 //전체 공백 삭제
		
	}
	public static void m8() {
		
		//문자열 검색
		// - indexOf()
		// - lastIndexOf()
		// - boolean contains(String)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.indexOf("홍길동") > -1);
		System.out.println(txt.contains("아무개"));
		
		
	}
	public static void m7() {
		
		//문자열 추출
		// - char charAt(int index) :문자 추출
		// - String substring(int start, int end) :문자열 추출
		//		- start : inclusive
		//		- end 	: exclusive
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.substring(3, 8));
		System.out.println(txt.substring(3,3));
		System.out.println(txt.substring(3,4));
		
		System.out.println(txt.substring(3));
		System.out.println(txt.substring(3, txt.length()));
		
		
	}
	public static void m6() {
		
		//(패턴)검색
		// - boolean startsWith(String word)
		// - boolean endsWith(String word)

		String name = "홍길동";
		
		//'홍'씨?
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		
		//'동'으로 끝나느냐?
		System.out.println(name.charAt(2) == '동'); //일반
		System.out.println(name.charAt(name.length()-1) == '동'); //좋은
		System.out.println(name.indexOf('동') ==2 ); //일반
		System.out.println(name.indexOf('동') == name.length()-1);
		System.out.println(name.startsWith("동"));
		
		
		
	}
	public static void m5() {
		
		//대소문자 변환
		// - String toUpperCase()
		// - String toLowerCase()
		
		String txt = "Hello Hong";
		
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
	}
	public static void m4() {
		
		//문자열 검색
		// - 문자열 내에서 원하는 문자(문자열) 검색 -> 발견한 위치 반환
		// - int indexOf(char c)
		// - int indexOf(String s) *** 자주 사용
		// - int indexOf(char c, int index)
		// - int indexOf(String s, int index)
		
		String txt = "안녕하세요. 홍길동 입니다. 반갑습니다. 홍길동 입니다.";
		
		int index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf("홍");
		System.out.println(index);
		
		index = txt.indexOf("홍길동"); // 0~13
		System.out.println(index);
		
		index = txt.indexOf("아무개");
		System.out.println(index);  	//-1
		
		if (txt.indexOf("홍길동") > -1) {
			System.out.println("발견O");
		} else {
			System.out.println("없음;;");
		}
		System.out.println();
		
		//"안녕하세요. 홍길동 입니다. 반갑습니다. 홍길동 입니다."
		index = txt.indexOf("홍길동", 0); // ("", 0) = 0부터 검색 시작
		System.out.println(index);
		
		index = txt.indexOf("홍길동", 10);
		System.out.println(index);
			
		
		
	}
	public static void m3() {
		
		//문자열 공백 제거
		// - String trim()
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
		
		
	}
	public static void m2() {
		
		//문자열 추출
		// - 특정 위치의 문자를 반환
		// - char charAt(int index)
		// - Zero-based Index
		
		String txt = "안녕하세요. 홍길동님.";
		
		System.out.println(txt.charAt(0));
		System.out.println(txt.charAt(3));
		System.out.println(txt.charAt(11));
		System.out.println(txt.length());
		System.out.println(txt.charAt(txt.length()-1));// 최대 index
		
		// java.lang.StringIndexOutOfBoundsException 숫자 초과
//		System.out.println(txt.charAt(100));
		
		
		
	}
public static void m1() {
		
		//문자열 길이
		// - 문자열을 구성하는 문자의 갯수
		// - int length()
		
		String txt = "Hello";
		System.out.println(txt.length());
		System.out.println("Bye".length());
		System.out.println("안녕하세요".length());
		
		
	}

}
