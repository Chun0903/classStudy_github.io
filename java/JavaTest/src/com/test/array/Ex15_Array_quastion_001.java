package com.test.array;

public class Ex15_Array_quastion_001 {
	public static void main(String[] args) {
		
		//요구사항.001
		//1차원 int 배열을 매개변수로 해서 내용을 문자열로 반환하는 dump 메소드를 구현하시오
		//메소드 서명 - String dump(int[]list)
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		
		System.out.printf("nums = [%s]",result);
		
		
	}
	
	static String result = "";
	private static String dump(int[] list) {
		int i = 0;
		for (i=0; i<list.length; i++) {
			result = result + list[i] + ",";
		}
		return result;
	}

}
