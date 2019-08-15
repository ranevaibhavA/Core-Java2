package com.hefshine.Array;

import java.util.Scanner;

class max{

public int max(int array[]) {
	int max=0;
	
	
	
	for (int i=0;i<array.length;i++) {
		if(array[i]>max) {
			max=array[i];
		}
	}
	return max;
	
}

public int min(int array[]) {
int min=array[0];

for(int i=0;i<array.length;i++) {
	if(array[i]<min) {
		min=array[i];
	}
}
return min;



}

public static class Max_minBymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int[] myarray=new int[size];
System.out.println("enter the element in array");

for (int i=0;i<size;i++) {
	myarray[i]=sc.nextInt();
}
max m=new max();

System.out.println("maximum value in the array is "+m.max(myarray));
System.out.println("minumum value of the array is "+m.min(myarray));
	}

}
}
