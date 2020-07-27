package com.test.array;

public class Ex15_Array_quastion2_005 {
	//피라미드 하나 짜고 역피라미드 하나 짜기
	// i,j -> 0, 2
	//		  1, 1~3
	//		  2, 1~5
	public static void main(String[] args) {
		int[][] num = new int[5][5];
		int numStart = 1;
		String gray="";
		
		int a = 1;
		int b = 3;
		
		int i =0;
		int j = 0;
		for(i=0; i<num.length; i++) {
			if(i<3) { 
				for(j=b; j>0;j-- ) {
					gray =" ";
					System.out.print("\t"+gray);
				}
				for(j=0; j<a ;j++) {
					num[i][j] =numStart;
					numStart++;
					System.out.printf("%6d\t",num[i][j]);
				}
				for(j=b;j>0;j--) {
					gray =" ";
					System.out.print(gray);
				}
				a+=2;
				b--;
				System.out.println();
			}else {
			
				for(j=0; j<b+2 ;j++ ) {
					gray =" ";
					System.out.print("\t"+gray);
				}
				for(j= a-4; j>0 ;j--) {
					num[i][j] =numStart;
					numStart++;
					System.out.printf("%6d\t",num[i][j]);
				}
				for(j=0;j<b+2;j++) {
					gray =" ";
					System.out.print(gray);
				}
				System.out.println();
				a-=2;
				b++;
			}
		}
		
//				for(i=0 ; i<num.length; i++) {
//					for(j=0; j<num.length; j++) {
//						System.out.printf("%6d\t",num[i][j]);
//					}
//					System.out.println();
//				}
		
	}
}
