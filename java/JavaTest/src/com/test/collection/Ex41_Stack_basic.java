package com.test.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex41_Stack_basic {
	
	public static void main(String[] args) {
		
		//Stack, 스텍
		// - 후입선출
		// - LIFO, Last Input First Output 
		
		//Queue, 큐
		// - 선입선출
		// - FIFI, First Output Last Input
		
		
//		m1();
		m2();
	}

	private static void m2() {

		Queue<String> queue = new LinkedList<String>();
		
		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		System.out.println(queue.size());

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.size());

		queue.add("빨강");
		queue.add("파랑");
		queue.add("노랑");
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		while (queue.size() >0) {
			System.out.println(queue.poll());
		}
	}

	private static void m1() {

		Stack<String> stack = new Stack<String>();
		
		stack.push("강아지");
		stack.push("고양이");
		stack.push("병아리");
		
		System.out.println(stack.size());
		
//		System.out.println(stack.pop());// index 사용 안함
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop()); //java.util.EmptyStackException

		System.out.println(stack.size());
	
		//모든 요소 꺼내기
		 while (stack.size()>0) {
			 System.out.println(stack.pop());
		 }
		
//		 if(stack.size() >0) {
		 if(!stack.isEmpty()) {
			 System.out.println(stack.pop());
		 }
		 	
		 	stack.push("강아지");
			stack.push("고양이");
			stack.push("병아리");
			stack.push("병아리");
			stack.push("병아리");
			
			System.out.println(stack);
			
			stack.clear();
			System.out.println(stack);
			
			stack.push("강아지");
			stack.push("고양이");
			stack.push("병아리");
			
			System.out.println(stack.peek()); 	//읽기만		(마지막 요소)
			System.out.println(stack.pop());		//읽기 + 삭제
			
			//vector: 거의 안쓴다. 옛날꺼  = ArrayList
	}

}
