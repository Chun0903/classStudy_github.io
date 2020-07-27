package com.test.collection;

import java.util.Arrays;

public class MyQueue {

	private String[] list;
	private int index;
	
	public  MyQueue() {
		this(10);
	}
	
	public  MyQueue(int capacity) {
		this.list = new String[capacity];
		this.index = 0;
	}
	
	public void add(String value) {
		
		checkLength();
		this.list[this.index] =value;
		this.index++;
		
	}
	
	private void checkLength() {
		if (this.index >= this.list.length) {
			
			String[] temp = new String[this.list.length * 2];//2배 크기 배열 생성
			
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;//배열 교체
			
		}
	}

	public String poll() {
				
		String temp = this.list[0];
				
				//좌측 시프트
				for (int i=0; i<this.index - 1; i++) {
					this.list[i] = this.list[i+1];
				}
				
				this.index--;
				
				return temp;
		
		
	}

	public int size() {
		return this.index;

	}

	public String peek() {
		return this.list[0];
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
