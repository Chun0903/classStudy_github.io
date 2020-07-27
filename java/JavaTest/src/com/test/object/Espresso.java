package com.test.object;

public class Espresso {

	private int bean;
	private int count;
	private String drink;
	
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		this.bean = bean;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다."
				,this.bean);
	}
	
	
	
}
