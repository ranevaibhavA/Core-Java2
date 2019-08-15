package com.hefshine.collectionMap;
//1.	WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. 
//      Use Integer as Key and String as Value. 
//      In second HashMap add elements of String type as Key and Integer as Value.
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
HashMap hs=new HashMap();
System.out.println("Enter the key(Integer),value(String) in hashmap");
int key;
String value;
for(int i=0;i<5;i++) {
	key=sc.nextInt();
	value=sc.next();
hs.put(key, value);

}
System.out.println(hs);
HashMap hs1=new HashMap();
System.out.println("Enter the key(String),value(integer) in hashmap");
String key1;
int value1;
for(int i=0;i<5;i++) {
	key1=sc.next();
	value1=sc.nextInt();
	hs1.put(key1, value1);
	
}

System.out.println(hs1);
	}

}
