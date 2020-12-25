package com.inetbanking.Utilities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrgm {

	public static void main(String[] args) {
		
		Map<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("Ram", 100);
		hm.put("Shyam", 101);
		hm.put("Vishu", 102);
		hm.put("Som", 103);
		hm.put("Vishal", 104);
		
		Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry= (Map.Entry<String, Integer>)itr.next();
			System.out.println("Key is "+entry.getKey()+" and  Value is "+entry.getValue());
		}
		





	}

}
