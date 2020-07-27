package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_11 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		long num =  Long.parseLong(reader.readLine());
		String type = "";
		
		if (num >= (long)-9223372036854775808l  && num <= (long)9223372036854775807l) {
			}if (num >= -128 && num <= 127) {
				System.out.printf("%s\n%s\n%s\n%s","byte", "short", "int", "long");
			} else if (num >= -32768 && num <= 32767) {
				System.out.printf("%s\n%s\n%s\n","short", "int", "long");
			}else if (num >= -2147483648 && num <= 2147483647) {
				System.out.printf("%s\n%s\n","int", "long");
			}else if (num >= (long)-9223372036854775808l  && num <= (long)9223372036854775807l ) {
				System.out.printf("%s\n","long");
			}else {
				
			}
			System.out.println(type);
		}

}
