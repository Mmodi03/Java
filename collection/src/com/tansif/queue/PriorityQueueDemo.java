package com.tansif.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> prior=new PriorityQueue<>();
		
		//fifo
		
		prior.add("python");
		prior.add("java");
		prior.add("dsa");
		prior.add("c");
		
		System.out.println(prior);
		
		prior.remove("c");
		System.out.println("after removed: "+prior);
		
		System.out.println("poll method: "+prior.poll());
		System.out.println("peek method: "+prior.peek());

	}

}
