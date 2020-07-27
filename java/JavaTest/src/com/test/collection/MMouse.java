package com.test.collection;

public class MMouse {
	
	public String name;
	public int button;
	
	public MMouse(String name, int button) {
		this.name = name;
		this.button = button;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%d)", this.name, this.button);
	}

	@Override
	public int hashCode() {
		return (this.name + this.button).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//m1.equals(m2)
		//MMouse m = (MMouse)obj;
		
		//주소값 비교O -> 상태값 비교O
		//return this.name.equals(m.name) && this.button == m.button;
		//return this.hashCode() == m.hashCode();
		return this.hashCode() == obj.hashCode();
	}
	
}












