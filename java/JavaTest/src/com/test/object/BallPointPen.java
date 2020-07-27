package com.test.object;

public class BallPointPen {
	
	private double thickness;
	private String color;
	private String infor;
	
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getInfor() {
		return infor;
	}
	public void setInfor(String infor) {
		infor = this.thickness + this.color;
		
		this.infor = infor;
	}
	

}
