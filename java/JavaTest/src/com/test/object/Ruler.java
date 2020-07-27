package com.test.object;

public class Ruler {
	
	private int length;
	private String shape;
	private String info;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		info = this.length + this.shape;
		this.info = info;
	}
	

}
