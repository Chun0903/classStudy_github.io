package com.test.object;

import java.util.Calendar;

public class Bugles {
	
	private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;
    
    //용량
  	public void setWeight(int weight) {
  		
  		if (weight == 300
  			|| weight == 500
  			|| weight == 850) {
  			
  			this.weight = weight;
  			
  			if (weight == 300) {
  				this.price = 850;
  				this.expiration = 7;
  			} else if (weight == 500) {
  				this.price = 1200;
  				this.expiration = 10;
  			} else if (weight == 850) {
  				this.price = 1950;
  				this.expiration = 15;
  			}
  			
  		}
  	}
    
	//가격
	public int getPrice() {
		return price;
	}
    
	//생산일자
	public void setCreationTime(String date) {
		
		//2020-04-20
		Calendar c = Calendar.getInstance();
		
		c.set(Integer.parseInt(date.substring(0, 4))
			, Integer.parseInt(date.substring(5, 7)) - 1
			, Integer.parseInt(date.substring(8)));
		
		this.creationTime = c;
	}
		
	//유통기한
	public int getExpiration() {
		
		//this.expiration - 
		//this.creationTime
		
		Calendar now = Calendar.getInstance(); 
		
		return this.expiration - (int)((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);		
	}
    
    //먹기
	public void eat() {
		
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
		
	}
    
    
    
    

    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    //용량
	public void setWeight(int weight) {
		
		if (weight == 300
			|| weight == 500
			|| weight == 850) {
			
			this.weight = weight;
			
			if (weight == 300) {
				this.price = 850;
				this.expiration = 7;
			} else if (weight == 500) {
				this.price = 1200;
				this.expiration = 10;
			} else if (weight == 850) {
				this.price = 1950;
				this.expiration = 15;
			}
		}
	}
    
	//가격
	public int getPrice() {
		return price;
	}

	//생산일자
	public void setCreationTime(String date) {
		
		Calendar c = Calendar.getInstance();
		
		//2020-04-20
		c.set(Integer.parseInt(date.substring(0, 4))
			, Integer.parseInt(date.substring(5, 7)) - 1
			, Integer.parseInt(date.substring(8)));
		
		this.creationTime = c;
	}
	
	//유통기한
	public int getExpiration() {
		Calendar now = Calendar.getInstance();
		
		return this.expiration - (int)((now.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 / 24);
	}
    
    //먹기
	public void eat() {
				
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
		
		
	}

    */
}













