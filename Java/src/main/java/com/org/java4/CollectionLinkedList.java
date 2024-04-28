package com.org.java4;

import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add(10);
		l.add(10.87);
		l.add("Ganu");
		l.add('A');
		l.add(null);
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
