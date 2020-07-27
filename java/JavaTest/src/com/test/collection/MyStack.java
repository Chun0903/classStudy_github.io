package com.test.collection;

import java.util.Arrays;

public class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() {
		this(10);
	}
	
	public MyStack(int capacity) {
		this.list = new String[capacity];
		this.index = 0;
	}
	
	public void push(String value) {
		
		checkLength();
		this.list[this.index] = value;
		this.index++;
		
	}
	
	private void checkLength() {
		if (this.index >= this.list.length) {
			
			String[] temp = new String[this.list.length * 2];
			
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;
			
		}
	}
	
	public String pop() {
		
		this.index--;
		
		return this.list[this.index];
	}
	
	public int size() {
		
		return this.index;
	}
	
	public String peek() {
		
		return this.list[this.index-1];
	}
	
	public void clear() {
		
		this.index = 0;
	}
	
	public void trimToSize() {
		
		String[] temp = new String[size()];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;//교체				
	}
	
	@Override
	public String toString() {
		
		return String.format("length: %d\nindex: %d\n%s\n"
							, this.list.length
							, this.index
							, Arrays.toString(this.list));
	}

}
