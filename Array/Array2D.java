package com.hefshine.Array;

import java.util.Scanner;

//7.	WAP to accept data in 2D array and print the data.
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the colmns");
		int cols = sc.nextInt();
		int array1[][] = new int[rows][cols];

		int array2[][] = new int[rows][cols];
		int i = 0;
		int j = 0;
		System.out.println("Enter elements of first matrix");
		
		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++)
				array1[i][j] = sc.nextInt();

		}
		System.out.println("Enter elements of second matrix");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++)
				array2[i][j] = sc.nextInt();

		}

		
		for (i = 0; i < rows; i++) {
			for (j = 0; j < cols; j++) {
				
			}
		}System.out.print("1st matrix "+array1[i][j]);
		System.out.print("2nd matrix "+array2[i][j]);
	}

}
