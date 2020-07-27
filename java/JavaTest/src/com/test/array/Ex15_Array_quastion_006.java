package com.test.array;

public class Ex15_Array_quastion_006 {
	public static void main(String[] args) {
		//요구사항.006
		//1~20 사이의 난수를 20개 담고 있는 배열을 생성한 뒤 아래의 조건을 적용해 출력하시오.
		//입력 - 최대범위 : 15
		//	   - 최소범위 : 5
		
		int[] num = new int[20];
		String nums = "";

		int i = 0;
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * num.length);
			nums = nums + num[i] + ", ";
		}
		System.out.printf("원본 : %s\n", nums);
		
		int max = 15;
		int min = 5;
		String numss = "";
		
		System.out.print("결과 : ");
		for (i = 0; i < num.length; i++) {
			if (num[i] <= max && num[i] >= min) {
				numss = numss + num[i] + ", ";
			}
		}
		System.out.printf("결과 : %s\n", numss);
		
		
	}

}
