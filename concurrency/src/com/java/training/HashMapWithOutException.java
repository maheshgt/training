package com.java.training;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// HashMap without ConcurrentModificationException

public class HashMapWithOutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hashMap = new ConcurrentHashMap<String, Integer>();
		hashMap.put("Sachin", 1);
		hashMap.put("Sourav", 2);
		hashMap.put("Yuvraj", 3);

		Iterator<String> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Value:" + hashMap.get(key));
			if (key.equals("Sourav")) {
				hashMap.put("Rohit", 4);
				hashMap.put("Kohli", 5);
			}
		}
		System.out.println(hashMap);
	}

}
