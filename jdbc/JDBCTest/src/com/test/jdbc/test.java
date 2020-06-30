package com.test.jdbc;

import java.util.Random;

public class test {
	
	   static Random rnd;
	   
	   static {
	      rnd = new Random();
	   }


	public static void main(String[] args) {
		
		inTime();
		}
	
	   private static String inTime() {
		      
		      int year = 2018;
		      int month = 1;
		      int date = 1;
		      
		      String result = "";
		      
		      
		      
		      for(int i=0; i<2; i++) {
		         month = 0;
		         year ++;
		         for(int j=0; j<12; j++) {
		            date = 0;
		            month++;
		            for(int k=0; k<29; k++) {
		               date ++;
		               
		               //시
		               int hour = rnd.nextInt(2)+7;
		               //분
		               int minute = rnd.nextInt(59)+1;
		               //초
		               int second =rnd.nextInt(59)+1;
		   
		               result = (year+"") + "/" + (month + "/") + (date + " ") + "" +
		                     (hour+"") + ":" +(minute+"") + ":"+(second+"");
		               
		               System.out.println(result);
		               
		               
		            }
		            
		            
		         }
		            year = 2019;
		      }
		      
		      return result;
		      

		      
		      
		   }
}

	      
