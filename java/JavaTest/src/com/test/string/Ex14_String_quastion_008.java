package com.test.string;

public class Ex14_String_quastion_008 {

	public static void main(String[] args) {
		
		//요구사항.008
		//특정 단어가 문장내에 몇회 있어있는지 수를 세시오.
		//출력 - '길동'을 총 2회 발견했습니다.
		//조건 - String content = "안녕~ 길동아~ 잘가~ 길동아~";
		//	 - String word = "길동";
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int index = -word.length();
		int count = 0;
		
		while(true) {
			index = content.indexOf(word, index + word.length());
			
			if(index > -1) {
				count++;
			} else {
				break;
			}
		}
		System.out.printf("'%s'를 총 %d회 발견했습니다.",word,count);

				
	}

	
	
}
