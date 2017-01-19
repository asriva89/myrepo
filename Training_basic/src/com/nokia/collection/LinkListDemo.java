package com.nokia.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll=new LinkedList<>();
		
		
	
		
		
		ll.add("AAs");
		ll.add("BBs");
		ll.add("AA");
		ll.add("BB");
		ll.add("AA");
		ll.add("BB");
		ll.add("AA");
		ll.add("BB");
		ll.remove(2);
		
		Queue<String> qq=(Queue<String>)ll;
		
		//Queue<String> q2=ll;//Can only be initialised since Linked List extends deque and dequeue extends Queue
		//System.out.println(q2.peek());
		
		System.out.println(qq.peek());
		qq.remove();
		System.out.println(qq.peek());
		
		System.out.println(ll);

	}

}
