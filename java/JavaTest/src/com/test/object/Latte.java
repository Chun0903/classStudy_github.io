package com.test.object;

public class Latte {
	
	private int bean;
	private int milk;
	private String drink;
	
	
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public String getDrink() {
		return drink;
	}
	public void setDring(String drink) {
		this.drink = drink;
		System.out.printf("원두 %dg, 우유 %dml로 만들어진 라테를 마십니다."
				,this.bean, this.milk);
	}
	

}
