package com.test.object;

public class Pencil {
	
	private String hardness;
	private String infor;
	
	
	public String getHardness() {
		return hardness;
	}
	public void setHardness(String hardness) {
		this.hardness = hardness;
		
	}
	
	
	public String getInfor() {
		return infor;
	}
	public void setInfor(String infor) {
		infor = this.hardness;
		this.infor = infor;
	}
	
	
	
	

}
