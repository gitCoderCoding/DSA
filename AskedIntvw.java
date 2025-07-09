package com.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SeventhJuly {
public static void main(String[] args) {
	
	Map<Integer,String> m=new HashMap<>();
	String s="hanuma";
	m.put(1, "sriramaMama");
	m.put(2, "seetaAmma");
	m.put(3, "lakshmanaMama");
	m.put(4, "hanuma");
	
	List<Integer> l=new ArrayList<>();
	for(Entry<Integer, String> entry:m.entrySet())
	{
		if(entry.getValue().equals(s))
		{
			l.add(entry.getKey());
		}
	}
	for(Integer key : l)
	{
		m.remove(key);
	}
	System.out.println(m);
}
}
