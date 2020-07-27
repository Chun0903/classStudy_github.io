package com.test.string;

public class Ex14_String_quastion_006 {

	public static void main(String[] args) {
		//요구사항.006
		//주어진 문자열에서 (사이의)공백을 제거 후 출력하시오
		//출력 - 원본 문자열 : "    하나    둘    셋    "
		//		 결과 문자열 : "    하나둘셋    "
		
		String input = "    하나    둘    셋    ";
		int i = 0;
		int k = 0;
		String sum = "";
		for (i=0;;i++) {
			if((input.substring(i,i+1)).equals(" ")) {
			}else {
				break;
			}
		} 
		//lastIndexOf
		
		String sum2 = "";
		for (k=input.length()-1;;k--) {
			if((input.substring(k-1)).equals(" ")) {
			}else {
				break;
			}
		} 
		
		
		for (int j= 1; j<=i; j++) {
			sum += " ";
		}
		
		for (int j= 1; j<=k; j++) {
			sum2 += " ";
		}
		
		
		System.out.printf("원본 문자열 : \"%s\"\n"
				+ "결과 문자열 : \"%s%s%s\"",input,sum, input.replace(" ", ""), sum2);
		
	}
	
}
