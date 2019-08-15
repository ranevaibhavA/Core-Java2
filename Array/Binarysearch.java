
package com.hefshine.Array;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, last, middle, n, search, array[];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");
		n = sc.nextInt();

		array = new int[n];
		System.out.println("Enter " + n + " Integers");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Enter element to search");
		search = sc.nextInt();
		first = 0;
		last = n - 1;
		middle = (last + first) / 2;

		while (first <= last)

		{
				if(array[middle]<search) {
					
					first=middle+1;
					}else if(array[middle]==search)
					{
						System.out.println(search+" found in location "+(middle)+".");
						break;
					}else {
						last=middle-1;
						middle=(first+last)/2;
						
					}
		if(first>last)
		{
			System.out.println(search+"isn't present in list.");
		}
		
		}

	}

}
