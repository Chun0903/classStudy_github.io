package com.test.operator;

public class Ex07_Operator_use_01 {
	
	public static void main(String[] args) {
		
		//산술 연산자
		
		int a = 10;
		int b = 3;
		double c = 2.5;
		double d = 5;
		
		System.out.println(a + d);	//정수 + 정수 = 정수
		System.out.println(a + c);	//정수 + 실수 = 실수
		
		System.out.println(a - b); 	//정수 - 정수 = 정수
		System.out.println(a - c);	//정수 - 실수 = 실수
		System.out.println(c - d);	//실수 - 실수 = 실수
		
		System.out.println(a / b); 	//정수 / 정수 = 정수
		System.out.println(a / c); 	//정수 / 실수 = 실수
		System.out.println(b / d); 	//실수 / 실수 = 실수
		
		a = 10;
		b = 3;
		c = 3;
		
		//*** 산술 연산자는 연산의 결과를 두 피연산자 중 더 큰 자료형으로 반환한다.
		//정수와 실수를 나누기 연산을 하면 결과가 정수가 된다.
		//정수와 정수를 나누기 연산을 하면 결과가 실수가 된다.
		System.out.println(a / b); //3
		System.out.println(a / c); //3.33333333
		
		
		//***
		a = 2100000000;
		b = 2100000000;
		System.out.println((long)a + b);
		System.out.println(a + (long)b);
		System.out.println((long)a + (long)b);
		
		
		//나머지 연산자
		// - 패턴 생성에 많이 사용
		
		//달력 패턴
		//1.해당 년, 월 -> 2020년 4월 30일
		// - 마지막일 몇일? -> 30일
		//2.해당 년, 월 1일
		// - 요일?
		// - 기준일 = 1.서기 1년 1월 1일, 1970년 1월 1일(많이 사용)
		// - 			1일= 월요일			
		// - 			~2020.04.01 일수
		// - 			/7 -> 나머지 구하기
		// - 			수요일~ , 토요일만= println
		
		
		
		//비교연산자
		
		a = 10; 	//int
		c = 10.0;	//double
		
		System.out.println(a > c);
		System.out.println(a == c);
		System.out.println();
		
		
		int age = 25; //키보드 입력
		
		//자격
		//1. 19세 이상
		System.out.println(age >= 19);	//권장
		//System.out.println(19 <= age);	//비권장
		
		//2. 60세 미만
		System.out.println(age < 60);
		System.out.println();
		
		
		
		//유효성 검사
		// -  사용자가 데이터를 입력학 때 올바를 데이터를 입력했는지 검사하는 과정
		
		//아이디 -> 영어 소문자(a(97) ~ z(122))
		char id = 'j';
		
		System.out.println((int)id >= (int)'a');
		System.out.println((int)id <= (int)'z');
		
		
		a = 10;
		b = 10;
		
		System.out.println(a == b);
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		System.out.println(s3);
		
		//문자열의 비교는 ==, != 연산자는 사용할 수 없다.
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		//논리 연산자
		//나이 : 19세 이상~ 60세 미만
		//		 19 <= age <60
		age = 25;
		
			// System.out.println(19 <= age < 60);
			// -> System.out.println(true < 60); (X)
		
		System.out.println(19 <= age && age < 60);
		System.out.println((19 <= age) && (age < 60));
		System.out.println((age >= 19) && (age < 60));	//결론
		
		
		c = '홍';
		System.out.println(((int)c >= (int) 'a') && ((int)c <= (int)'z'));
		
		//영어 소문자
		System.out.println(c > 'a' && c<= 'z');	//암시적 형변환
		//영어 대문자
		System.out.println(c > 'A' && c<= 'Z');	
		//숫자
		System.out.println(c > '0' && c<= '9');	
		//한글
		System.out.println(c > '가' && c<= '힣');	
		
		int n = 10;
		int result = 0;
		
		//비권장(하나의 문장에 증감 연산자와 다른 연사자를 동시에 사용하지 말것)
		//result = 20 + ++n; //31, ++n: 소괄호 빼고는 1순위
		//result = 20 + n++; //30, n++: 대입 연산자 보다 낮은 순위
		
		//권장
		//result = 20 + ++n;
		++n;
		result = 20 +n;
		
		//result = 20 + n++;
		result = 20 +n;
		n++;
		
		System.out.println(result);
		System.out.println(n);
		
		
		int o = 10;
		System.out.println(--o-o--);
		
		
		
		
		
		
		
		
		
	}

}
