package user_ip;

import java.util.Scanner;

public class print_integer_float_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
char y;
float z;
//x=1
//y='a';
//z=12.4f;
Scanner sc = new Scanner(System.in);
System.out.println("print a number");

x=sc.nextInt();
System.out.println("integer is "+x);

System.out.println("print a char");
y=sc.next().charAt(0);
System.out.println("character is "+y);
System.out.println("print a float");
z=sc.nextFloat();
System.out.println("float is "+z);
}

}
