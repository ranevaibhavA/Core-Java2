package com.hefshine.Array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int buble[]=new int [size];
System.out.println("Enter numbers");
	
	for (int i=0;i<size;i++)
	{
		buble[i]=sc.nextInt();
		
	}
	for (int i=0;i<size;i++) {
		
		for(int j=1;j<size-i;j++) {
			if (buble[j-1]>buble[j])
			{
				int temp;
				temp=buble[j-1];
				buble[j-1]=buble[j];
				buble[j]=temp;
				
			}
			
		}
					
	}
	for(int k=0;k<size;k++)
	{
		System.out.print(buble[k]+"\t");
	}

	}

}
