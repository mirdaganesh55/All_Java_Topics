package com.org.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

//insertion order is not maintained
//dulicate(key) can be replaced by value
public class MapHashMap {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		map.put(101, "Ganesh");
		map.put(112, "Rahul");
		map.put(103, "Ayush");
		map.put(null, null);
		map.put(9, "Jitu");
		map.put("Java",3000);
		System.out.println(map);
		
		
		HashSet hs1 = new HashSet(map.keySet());
		System.out.println(hs1);
		
		HashSet hs2 = new HashSet(map.entrySet());
		System.out.println(hs2);
		
		Iterator i = hs2.iterator();
		while(i.hasNext()) {
//			System.out.println(i.next());
			Entry e =  (Entry)i.next();
			System.out.println(e.getKey() +"          "+ e.getValue());
		}
	}
	
}
