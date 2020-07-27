package com.test.array;

public class Ex15_Array_quastion2_004 {

	public static void main(String[] args) {
		
		int[][] score = new int[5][5];
		int num = 1;
			
		for (int i=0; i<score.length; i++) {
			//가로
				for (int j=0; j< score[0].length-i; j++) {
					//세로
					score[i][j] =num;
					num++;
			}
		}
		
		for(int i=0 ; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				System.out.printf("%6d\t",score[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
