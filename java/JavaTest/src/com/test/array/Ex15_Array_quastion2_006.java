package com.test.array;

public class Ex15_Array_quastion2_006 {
	//5행 5열
	//n값은 4행 4열
	//회색은 데이터, 녹,빨= sum
	public static void main(String[] args) {
	
		int[][] score = new int[5][5];
		int num = 1;
		int sum = 0;
			
		for (int i=0; i<score.length-1; i++) {
			//가로
				for (int j=0; j<score.length-1; j++) {
					score[i][j] =num;
					num++;
					
					if(i == score.length-1) {
						for(j=0; j<score.length-1; j++) {
							score[i][j] = sum;
							sum++;
						}
					}
					 
				}
				
		}
		for (int i=0;i<score.length; i++) {
			for (int j=0; j<score.length-1; j++) {
				score[i][score.length-1] = score[score.length-1][j];
				num++;
			}
		}
			

	
		
		for(int i=0 ; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				System.out.printf("%6d\t",score[i][j]);
			}
			System.out.println();
		}
		
		
	}//main
	
}//class
