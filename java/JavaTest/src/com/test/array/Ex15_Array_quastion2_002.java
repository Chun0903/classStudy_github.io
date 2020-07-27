package com.test.array;

public class Ex15_Array_quastion2_002 {

	public static void main(String[] args) {
		
		//요구사항.002
		//아래와같이 출력하시오.. 
		//	25	~	21
		//	20	~	16
		//	15	~	11
		//	10	~	6
		//	5	~	1

		
		int[][] score = new int[5][5];
		int num = 25;
			
		for (int i=0; i<score.length; i++) {
			//가로
				for (int j=0; j<score.length; j++) {
					//세로
					score[i][j] =num;
					num--;
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
