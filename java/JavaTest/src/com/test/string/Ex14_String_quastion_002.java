package com.test.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14_String_quastion_002 {

	public static void main(String[] args) throws Exception{
		//요구사항.002
		//이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String mail = reader.readLine();
		
		int index = mail.indexOf("@"); 
		String id = mail.substring(0, index);
		System.out.println(id);
		
		index = mail.indexOf("@"); 
		String domail = mail.substring(index+1);
		System.out.println(domail);
		
	}
	
	
}
