package com.tansif.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>();
		dq.add("a");
		dq.add("b");
		dq.add("c");
		
		dq.offer("f");
		
		dq.offerFirst("d");
		dq.offerLast("e");
		
		System.out.println(dq);

	}

}
