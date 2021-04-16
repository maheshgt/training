package com.java.training;

// HashMap with ConcurrentModificationException

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapException {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Sachin", 1);
		hashMap.put("Sourav", 2);
		hashMap.put("Yuvraj", 3);

		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Value:" + hashMap.get(key));
			if (key.equals("Sourav")) {
				hashMap.put("Rohit", 4);
			}
		}
		
	}

}
