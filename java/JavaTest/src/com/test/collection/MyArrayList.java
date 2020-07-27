
package com.test.collection;

import java.util.Arrays;

public class MyArrayList {
	
	private String[] list; //중심 데이터
	private int index; //현재 데이터를 넣은 방의 위치
	
	public MyArrayList() {
		this(10);
	}
	
	public MyArrayList(int capacity) {
		this.list = new String[capacity];
		this.index = 0;
	}
	
	//append
	public void add(String item) {
		
		//1. 배열 검사 > 확장
		//2. 순차적인 대입
		
		//1. 방이 모자름
		checkLength();
		
		//2.
		this.list[this.index] = item;
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
	
	public String get(int index) {
		
		if (index >= 0 && index < this.index) {
			
			return this.list[index];		
		} else {
			
			throw new IndexOutOfBoundsException();
		}
	}
	
	public int size() {
		
		return this.index;
	}
	
	@Override
	public String toString() {
		
		return String.format("length: %d\nindex: %d\n%s\n"
							, this.list.length
							, this.index
							, Arrays.toString(this.list));
	}
	
	
	public void set(int index, String value) {
		
		if (index >= 0 && index < this.index) {
			
			this.list[index] = value; //수정			
		} else {
			
			throw new IndexOutOfBoundsException();
		}
		
	}
	
	public void remove(int index) {
		
		if (index >= 0 && index < this.index) {
			
			//좌측 시프트
			for (int i=index; i<this.index - 1; i++) {
				this.list[i] = this.list[i+1];
			}
			
			//this.list[index] = null;
			this.index--;
			
		} else {
			
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	public void add(int index, String value) {
		
		if (index >= 0 && index < this.index) {
			
			//방이 모자란지 확인
			checkLength();
			
			//우측 시프트
			for (int i=this.index-1; i>=index; i--) {
				this.list[i+1] = this.list[i];
			}
			
			this.list[index] = value;//삽입
			this.index++;
			
		} else {
			
			throw new IndexOutOfBoundsException();
		}
		
	}
	
	public int indexOf(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}	
		}
		
		return -1;		
	}
	
	public int lastIndexOf(String value) {
		
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}	
		}
		
		return -1;		
	}


	public void clear() {
		
		//for()
		
		this.index = 0;
	}
	
	public boolean contains(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void trimToSize() {
		
		String[] temp = new String[size()];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;//교체				
	}
	
	
	public boolean isEmpty() {
		
		return this.index == 0 ? true : false;
	}
	
	//부분 집합 추출
	public MyArrayList subList(int fromIndex, int toIndex) {
		
		MyArrayList temp = new MyArrayList(toIndex - fromIndex);
		
		for (int i=fromIndex; i<toIndex; i++) {
			
			//temp[i] = this.list[i];
			//temp.list[i] = this.list[i];
			temp.add(this.list[i]);
		}
		
		return temp;		
	}
	
	
	
}



























