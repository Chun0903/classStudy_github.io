package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex15_Array_quastion_004 {
	public static void main(String[] args) throws Exception {
		// 요구사항.004\
		// 난수로 채워진 배열에서 첫번째 방부터 연속으로 2개씩 더한 결과를 출력하시오.

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열의 길이 : ");
		int longs = Integer.parseInt(reader.readLine());
		int[] num = new int[longs];
		int[] num2 = new int[longs / 2];
		String nums = "";

		int i = 0;
		for (i = 0; i < longs; i++) {
			num[i] = (int) (Math.random() * 10);
			nums = nums + num[i] + ", ";
		}
		System.out.printf("nums = [ %s ]\n", nums);
		
		for (int j = 0; j < longs; j+=2) {
			num2[j/2] = num[j] + num[j+1];
		}
		
		System.out.printf("result = %s\n",Arrays.toString(num2));

	}

}
