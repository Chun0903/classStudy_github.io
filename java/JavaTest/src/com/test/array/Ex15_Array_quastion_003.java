package com.test.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex15_Array_quastion_003 {

	public static void main(String[] args) throws Exception{
		//요구사항.003
		//학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 : ");
		int num = Integer.parseInt(reader.readLine());
		int j=0;
		String []student = new String [num];
		for (j=0; j<num; j++) {
			System.out.print("학생명 : ");
			student[j] = reader.readLine();
		}
		System.out.printf("입력한 학생은 총 %d명입니다.\n",num);
		
		int i = 0;
		
		for (i=student.length-1, j=1; i>=0; i--,j++) {
			
			System.out.printf("%d. %s\n",j,student[i]);
		}
		
	}
	
}
