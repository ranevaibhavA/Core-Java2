package com.hefshine.Array;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements");		

		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();

		}
		
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					int t;
					t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
		
		
		
		/*for(int k=0;k<size;k++)
		{
			System.out.print(array[k]+"\t");
		}
		*/

	}	


	}