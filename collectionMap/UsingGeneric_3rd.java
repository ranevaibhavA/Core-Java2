package com.hefshine.collectionMap;

import java.util.HashMap;

//3.	WAP add elements to HashMap without using generics, 0th location use String as key and Integer as value, 
//		on 1st location use String as key String and Integer as value.
public class UsingGeneric_3rd {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put("zeroth_pos", 1);
		hs.put(1, "firstPos");
		System.out.println(hs);
	
	
	}
}
