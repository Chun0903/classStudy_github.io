package com.test.util;

import java.util.Random;

//자바 클래스 전달(배포) -> 컴파일 결과 -> *class + 패키지 -> 압축(zip) -> *.jae
public class MyUtil {
	
	public int nextInt() {
		Random rnd = new Random();
		return rnd.nextInt(10) + 1;
				
	}
	
	public String nextColor() {
		
		Random rnd = new Random();
		String[] color = { "red","blue", "yellow"};
		return color[rnd.nextInt(color.length)];
		
	}
			
	

}
