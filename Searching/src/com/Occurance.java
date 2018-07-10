package com;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="abcdeglkjd vefoidvhrgr";
		
		System.out.println("good job");
		String s=st.replaceAll("\\s", "");
		char[] charArr=s.toCharArray();
		HashMap<Character, Integer>map=new HashMap<>();
		for(Character c:charArr) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer>mw:map.entrySet()) {
			System.out.println(mw.getKey()+" "+mw.getValue());
		}
		System.out.println(",,,,,,,,,,,,,,,,,");
		System.out.println("only Keys");
		for(Character ch:map.keySet()) {
			System.out.println(map.get(ch));
		}

	}

}
