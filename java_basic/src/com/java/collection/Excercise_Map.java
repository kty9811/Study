package com.java.collection;

import java.util.Map;
import java.util.TreeMap;

public class Excercise_Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("����ȣ", 123);
		map.put("���ȣ",456);
//		map.put("c",'A');
//		map.put("d","A");
//		map.put("e",true);
//		map.put("f",789f);
		System.out.println(map);


	}

}
