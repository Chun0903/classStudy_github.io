package com.test.array;

import java.util.Arrays;

public class Ex15_Array_quastion_007 {
	public static void main(String[] args) {
		
		//요구사항.007
		//중복되지 않는 임의의 숫자 5개를 만드시오.
		//숫자의 범위: 1~9
		
		//추가 조건 - 숫자의 범위를 입력받으시오.
		//			- 숫자의 개수를 입력받으시오.
		
		//중복값 제거 난수
		int[] nums = new int[5];
		
		//난수 생성 -> (중복 체크) -> 배열 대입
		
		
		for (int i=0; i<nums.length; i++) {
			
			int n = (int)(Math.random() * 10) +1; //1~10
			
			
			if(!duplicate(i,n,nums)) {
				nums[i] = n;
			} else {
				i--;  //중복값일때 자리수 하나 복원
			}
			
		}//for
		System.out.println(Arrays.toString(nums));
		
	}
	public static boolean duplicate(int i, int n, int[] nums) {
		
		boolean duplicate = false;
		
		for (int j=0; j<=i; j++) {
			if (nums[j] ==n) {
				duplicate =true;
				break;
			}
		}
		
		return duplicate;
		
	}
	
}

