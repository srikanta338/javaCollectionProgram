package com.otest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String, String>hmap=new HashMap<>();
	hmap.put("four", "black");
	hmap.put("Three", "yellow");
	hmap.put("two", "blue");
	hmap.put("one", "green");
	System.out.println(hmap);
	
	HashMap<String, String>map1=new HashMap<>(hmap);
	System.out.println(map1);
	
	HashMap<String, String>map2=new HashMap<>(hmap);
	map2=methodReturns(map2);
	System.out.println(map2);
	HashMap<String, String>map4=new HashMap<>(hmap);
	method4(hmap);
	System.out.println(hmap);
	

	}

	private static void method4(HashMap<String, String> hmap) {
		// TODO Auto-generated method stub
		
		HashMap<String, String>our=new HashMap<>();
		for(Map.Entry<String, String>entry:hmap.entrySet()) {
			if(!entry.getValue().contains("green")) {
				our.put(entry.getKey(), entry.getValue());
			}
		}
		hmap.clear();
		hmap.putAll(our);
		
	}

	private static HashMap<String, String> methodReturns(HashMap<String, String> hmap) {
		// TODO Auto-generated method stub
		HashMap<String, String>out=new HashMap<>();
		for(Map.Entry<String,String>map3:hmap.entrySet()) {
			if(map3.getKey().equals("two")) {
				System.out.println(map3.getValue());
			}
			if(!map3.getValue().contains("blue")) {
				out.put(map3.getKey(), map3.getValue());
			}
			
		}
		return out;
	}

}
