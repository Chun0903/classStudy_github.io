package com.test.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex08_Method_quastion_04 {

	/*
	 * public static void main(String[] args) throws Exception{
	 * 
	 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * System.out.print("이름 : "); String name = reader.readLine();
	 * 
	 * getName(name); return String = "님";
	 * 
	 * }
	 * 
	 * public static String getName(String name) {
	 * 
	 * System.out.printf("고객 : %s\n", name); return name;
	 * 
	 * 
	 * }
	 */
	
	public static void main(String[] args) throws Exception{
		
		
		
		String name = getName();
		
		System.out.printf("고객 : %s\n", name);
				
	}
	
	public static String getName() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		String name = reader.readLine();
		
		
		return name + "님";		
	}
}
