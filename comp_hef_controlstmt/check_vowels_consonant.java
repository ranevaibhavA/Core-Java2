package comp_hef_controlstmt;

import java.util.Scanner;

public class check_vowels_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char X;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character you want to check");
X=sc.next().charAt(0);
if((X=='a'|| X=='A') || (X=='e'|| X=='E')||(X=='i'||X=='I')||(X=='o'|| X=='O') || (X=='u'||X=='U')){

	System.out.println("Entered character is vowel");
}
else
	System.out.println("Entered character is Consonant");
	
	}

}
