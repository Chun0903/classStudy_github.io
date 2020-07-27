package com.test.collection;

import java.util.Arrays;

public class MyHashMap {
	
//	private String[] keyList;
//	private String[] valueList;
	
	private MapItem[] list;
	private int index;
	
	public MyHashMap() {
		this(10);
	}
	
	public MyHashMap(int capacity) {
		this.list = new MapItem[capacity];
		this.index = 0;
	}
	
	public void put(String key, String value) {
		
		//공간 체크
		checkLength();
		
		//insert or update 
		
		if (!containsKey(key)) {
			//추가될 새 아이템
			MapItem item = new MapItem();
			item.key = key;
			item.value = value;
			
			this.list[this.index] = item;
			this.index++;
		} else {
			//수정하기
			for (int i=0; i<this.index; i++) {
				if (this.list[i].key.equals(key)) {
					this.list[i].value = value;
					break;
				}
			}
		}
		
	}
	
	public boolean containsKey(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean containsValue(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].value.equals(value)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
	
		return String.format("length: %d\nindex: %d\n%s\n"
				, this.list.length
				, this.index
				, Arrays.toString(this.list));
	}
	
	private void checkLength() {
		if (this.index >= this.list.length) {
			
			MapItem[] temp = new MapItem[this.list.length * 2];
			
			for (int i=0; i<this.list.length; i++) {
				temp[i] = this.list[i];
			}
			
			this.list = temp;//배열 교체
			
		}
	}
	
	public String get(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return this.list[i].value;
			}
		}
		
		return null;
	}
	
	public int size() {
		
		return this.index;
	}

	public void clear() {
	
		this.index = 0;
	}
	
	public void remove(String key) {
		
		int delIndex = -1;
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				delIndex = i;
				break;
			}
		}
		
		if (delIndex >= 0 && delIndex < this.index) {
			
			//좌측 시프트
			for (int i=delIndex; i<this.index - 1; i++) {
				this.list[i] = this.list[i+1];
			}
			
			this.index--;
			
		} else {
			
			throw new IndexOutOfBoundsException();
		}
		
	}
}

class MapItem {
	public String key;
	public String value;
	@Override
	public String toString() {
		return String.format("(%s,%s)", this.key, this.value);
	}
}
