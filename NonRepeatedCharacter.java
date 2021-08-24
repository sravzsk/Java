package com.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";
		HashMap<Character,Integer> hasMap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hasMap.containsKey(ch)) {
				hasMap.put(ch, hasMap.get(ch)+1);
			}
			else {
				hasMap.put(ch, 1);
			}
		}
		
		for(Entry<Character,Integer> entry:hasMap.entrySet()) {
			if(entry.getValue()==1){
					System.out.println("nonRepeatedCharacter-->"+entry.getKey());
					return;
			}
		}

	}

}
