package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_quastion_002 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//요구사항.002
		//숫자 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		
		int []list = new int[5];
		list[0] = Integer.parseInt(reader.readLine());
		list[1] = Integer.parseInt(reader.readLine());
		list[2] = Integer.parseInt(reader.readLine());
		list[3] = Integer.parseInt(reader.readLine());
		list[4] = Integer.parseInt(reader.readLine());
		for (int i=list.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n",i,list[i]);
		}
	
}

}
