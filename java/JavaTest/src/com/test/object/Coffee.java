	package com.test.object;

public class Coffee {

	//총 원두, 물, 얼음, 우유량
	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	
	//단가(원) 
	private static int beanUnitPrice;
	private static int waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	
	//퐁 판매액(원)
	private static int beanTotalPrice;
	private static int waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	
	//총 판매 개수(잔)
	private static int americano;
	private static int latte;
	private static int espresso;
	
	//==============================================================
	
	//총 원두, 물, 얼음, 우유량
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean = bean;
	}
	
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water = water;
	}
	
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice = ice;
	}
	
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk = milk;
	}
	
	//단가(원)
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static void setBeanUnitPrice(int beanUnitPrice) {
		Coffee.beanUnitPrice = beanUnitPrice;
	}
	
	public static int getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static void setWaterUnitPrice(int waterUnitPrice) {
		Coffee.waterUnitPrice = waterUnitPrice;
	}
	
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static void setIceUnitPrice(int iceUnitPrice) {
		Coffee.iceUnitPrice = iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static void setMilkUnitPrice(int milkUnitPrice) {
		Coffee.milkUnitPrice = milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	
	
	//퐁 판매액(원)
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice = beanTotalPrice;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(int waterTotalPrice) {
		Coffee.waterTotalPrice = waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice = iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice = milkTotalPrice;
	}
	
	//총 판매 개수(잔)
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano(int americano) {
		Coffee.americano = americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte(int latte) {
		Coffee.latte = latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso(int espresso) {
		Coffee.espresso = espresso;
	}
	
	
	
	
}
