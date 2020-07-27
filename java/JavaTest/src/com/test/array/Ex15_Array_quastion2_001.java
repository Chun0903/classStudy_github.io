package com.test.array;

public class Ex15_Array_quastion2_001 {

	public static void main(String[] args) {
		
		//요구사항.001
		//아래와같이 출력하시오.. 
		//	1	~	5
		//	10	~	6
		//	11	~	15
		//	20	~	16
		//	21	~	25
		
		
		int[][] score = new int[5][5];
		int num = 1;
			
		for (int i=0; i<score.length; i++) {
			//가로
			if(i%2==0) {
				for (int j=0; j<score.length; j++) {
					//세로
					score[i][j] =num;
					num++;
				}
			} else {
			for (int j=score.length-1; j>=0; j--) {
				//세로
				score[i][j] =num;
				num++;
				}
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