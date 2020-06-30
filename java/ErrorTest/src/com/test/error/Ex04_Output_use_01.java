package com.test.error;

public class Ex04_Output_use_01 {
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		double pi = 3.14;
		char c = 'A';
		
		System.out.printf("제 이름은 %s입니다.\n", name); 	//단어는 %s를 쓴다.
		System.out.printf("나이는 %d살입니다.\n", age); //앞 뒤가 같지 않다. pi는 제거
		System.out.printf("소문자 %c의 대문자는 %c입니다.\n", c+32 ,c); //%로 대체하지 않으면 그냥 프린트 된다.
		System.out.printf("원주율은 %.1f입니다.\n", pi); //','소수점 이하 표시는 % 다음에 온다. / 상수표시는 %f
		System.out.printf("제가 제일 좋아하는 문자는 %c입니다.\n", c); //%s ->%c
		System.out.printf("오늘 3개의 에러를 발견하고 수정했습니다.\n");
		
		
	}

}











