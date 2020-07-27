package com.test.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex40_HashMap_basic {
	
	public static void main(String[] args) {
		
		//HashMap 컬렉션
		
		//ArrayList vs HushMap
		
		//1.ArrayList (=순수 배열)
		// - 요소 접근 -> 첨자(index)사용
		// - 방번호 존재 -> 요소의순서가 존재
		// - 스칼라 배열(Scalar Array)
		// - 일관 접근 -> 루프 탐색 가능
		// - 요소의 구분이 쉽지 않다.(방번호가 의미가 없다)
		
		//2.HashMap
		// - 사전 구조(Dictionary), 맵(Map), 연관 배열
		// - 첨자(index)가 존재하지 않음
		// - key + value
		// - 방번호 부재 -> 요소의 순서가 없음
		// - 요소 접근 -> 키(key) 사용
		// - 일괄 접근 -> 루프 탐색 불가능
		// - 요소의 구분이 쉽다. (방에 이름이 있어서)
		// - key는 유일해야 한다. (== String)
		// - value는 중복 가능하다.
		
//		m1();
		m2();
	}

	private static void m2() {
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//1. 요소 추가
		// - V fut(T krty, V value);
		map.put("국어" , 100);
		map.put("영어" , 90);
		map.put("수확" , 80);
		
		//요소 개수
		System.out.println(map.size());
		
		//3.요소 접근하기
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		System.out.println(map.get("과학")); //null
		
		//4.요소 수정하기
		int result = map.put("국어",98);
		System.out.println(map.get("국어"));
		System.out.println(result);
		
		//검색 하기
		// - key, value
		System.out.println(map.containsKey("국어"));
		System.out.println(map.containsKey("체육"));
		
		System.out.println(map.containsValue(100));
		System.out.println(map.containsValue(98));
		
		//6. 요소 삭제하기
		map.remove("국어");
		System.out.println(map.size());
		System.out.println(map);
		
//		//7. 초기화
//		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println();
		
		//8. keySet
		// - key + set 배열
		Set<String> set =  map.keySet();
		
		for (String item : set) {
			System.out.println(item + "," + map.get(item));
		}
	}

	private static void m1() {

//		HashMap map = new HashMap();
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		//요소 추가
		map.put("국어", 100);
		map.put("영어", 90);
		map.put("수학", 80);
		
		//요소 접근
		System.out.println(map.get("영어"));
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		
		//요소 개수
		System.out.println(map.size());
		
		HashMap<String,String> classroom = new HashMap<String, String>();
		classroom.put("반장","홍길동");
		classroom.put("부반장","아무개");
		classroom.put("총무","하하하");
		
		System.out.println(classroom.toString());
		
		HashMap<Integer,String> map2 = new HashMap<Integer, String>();
		
		map2.put(10, "열");
		map2.put(20, "스물");
		map2.put(30, "서른");
		
		System.out.println(map2);
		
		HashMap<Boolean,String> map3 = new HashMap<Boolean, String>();
		
		map3.put(true, "참");
		map3.put(false, "거짓");
		
		
	}

}










