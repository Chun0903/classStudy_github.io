package com.test.control;

public class Ex12_for_quastion_18 {

	//요구사항.018
	//2부터 100사이의 소수를 구하시오

		public static void main(String[] args) {
			
			for (int j=1; j<=100 ; j++) {
				boolean sosu = true;
				
				for(int i =2; i <j; i++) {
					if(j % i ==0 ) {
						sosu = false;
					}
				}
				if(sosu) {
					System.out.printf("%d ",j);
				}
			}
		}
	}
