package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_010 {

	public static void main(String[] args) throws Exception{
		
		//요구사항.010
		//금지어를 마스킹 처리 하시오.
		//입력 - 너랑 안놀아 바보야!!
		//출력 - 너랑 안놀아 **야!!
		//	       금지어를 1회 마스킹 했습니다.
		//입력 - 그것도 모르다니 멍청이;;
		//출력 - 그것도 모르다니 ***;;
		//	       금지어를 1회 마스킹 했습니다.
		//입력 - 잘 생각해봐 바보 멍청이
		//출력 - 잘 생각해봐 ** ***
		//	       금지어를 2회 마스킹 했습니다.
		//조건 - 금지어 :바보, 멍청이
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String word = "바보";
		String word2 = "멍청이";
		String input = "";
		while (true) {
			System.out.print("입력 : ");
			input = reader.readLine();
			
			if(input.indexOf(word) == -1 && input.indexOf(word2) == -1) {
				break;
			}if(input.indexOf(word) != -1){
				System.out.println(input.replace(word, "**"));
//				int miss = // 몇회 어떻게 구하는거???
				System.out.println("금지어를 마스킹 했습니다.");
			} else if(input.indexOf(word2) != -1) {
				System.out.println(input.replace(word2, "***"));
				System.out.println("금지어를 마스킹 했습니다.");
			} else if(input.indexOf(word) != -1 && input.indexOf(word2) != -1){
				System.out.println(input.replace(word, "**"));
				System.out.println(input.replace(word2, "***"));
				System.out.println("금지어를 마스킹 했습니다.");
			}
		}//while
		
		System.out.println("글쓰기 진행...");
		
	}
	
	
	
}
