package com.test.array;

public class Ex15_Array_quastion_005 {
	public static void main(String[] args) {
		
		//요구사항.005
		//1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
		int[] num = new int[20];
		String nums = "";

		int i = 0;
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * num.length);
			nums = nums + num[i] + ", ";
		}
		System.out.printf("원본 : %s\n", nums);
		
		int min = num[0];
		int max = num[0];
		
		for (i=0; i<num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] >max) {
				max = num[i];
			}
		}
		System.out.println("최소값 : " + min + "\n최대값 : "+max);
		
		
	}

}



//int array[]=new int[10];
//int i;
//int min=51; //최소값을 저장하는 변수,최대값지정
//int max=0; //최대값을 저장하는 변수
//
//
//for(i=0;i<10;i++){
// array[i]=(int)Math.round(Math.random()*49+1); //배열에 랜덤정수 입력
// System.out.println((i+1)+"번째 값:"+array[i]);
// if(array[i]>max)
//  max = array[i]; //최대값보다 크면 최대값에 저장
// if(array[i]<min)
//  min = array[i]; //최소값보다 작으면 최소값에 저장
//  
//}
//
//System.out.println("가장 큰 값:"+max);
//System.out.println("가장 작은 값:"+min);
//
//
//}
//
//}
//
