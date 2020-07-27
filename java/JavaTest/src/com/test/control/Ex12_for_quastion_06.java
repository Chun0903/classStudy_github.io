package com.test.control;


public class Ex12_for_quastion_06 {
	
	public static void main(String[] args) {
		
		m1();
	}
	public static void m1() {
		// 1+ 2+3+ 4+ 5+ 6+7+8+9+10 =55
		
				//2.누적 변수를 생성한다.
				//1.루프를 생성한다.(for x 10회 ** i 누적 변수 사용) {
				//3. 숫자를 출력한다 + 숫자(i)를 누적한다.(부호를 번갈아가며)
				//1. }
				//4. 누적값을 출력한다.
				
				int sum = 0;
//				int place = 1;
				
				for (int i=1, place=1; i<=10; i++,place++) {//1.
					
					if (place % 2 == 1) {
						System.out.printf("%d -",i);//3
						sum += i; 
					}else {
						System.out.printf("%d +",i);
						sum -= i;
					}

				}
				System.out.printf(" = %d\n",sum);
		

		
	}

}
