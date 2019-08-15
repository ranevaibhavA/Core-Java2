package loop_3rd;

import java.util.Scanner;

public class mirrorImage_6th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
for (int i=1;i<=a;i++) {
	for(int j=i;j<=a;j++) {
		System.out.print(j);
	}System.out.println();
	
}
/*for(int i=a-1;i<=a;i--) {
	for(int j=i;j>=a;j--) {
		System.out.println(i);
	}System.out.println("Y");
}System.out.println("want same numbers opposite,using user input");

	
	*/
}

}
