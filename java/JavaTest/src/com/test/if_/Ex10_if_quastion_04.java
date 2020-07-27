package com.test.if_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex10_if_quastion_04 {
	public static void main(String[] args) throws Exception{
		
		m1();
	}
	public static void m1() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String munja = reader.readLine();
		
		if(munja.equals("f") || munja.equals("F")) {
			System.out.println("Father");
		} else if(munja.equals("m") || munja.equals("M")) {
			System.out.println("Mather");
		} else if(munja.equals("s") || munja.equals("S")) {
			System.out.println("Sister");
		} else if(munja.equals("b") || munja.equals("B")) {
			System.out.println("Brother");
		} else {
			
		}
	}

}
