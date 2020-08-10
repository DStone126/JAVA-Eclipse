package com.syntax.class31;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		 Queue<Integer> q = new PriorityQueue<>();
		 q.add(100);
		 q.add(1110);
		 q.add(1);
		 q.add(10);
		 
		 System.out.println(q);
		 q.remove();
		 
		 System.out.println(q);
	}
}
