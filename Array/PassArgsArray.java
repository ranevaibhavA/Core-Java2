package com.hefshine.Array;

public class PassArgsArray {
public static int[] getArray(int[] array)				//getArray method retuns int[] array
{														// and from method it recives int[] array		
	
return array;													//return whole array

	
}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
int[] numbers= {1,2,2,3};					//array declaration
int[] records =getArray(numbers);					//catch the returned value
for(int num:records) {								//for each loop for traversal of array element
	System.out.println(num);
}
	}
}

