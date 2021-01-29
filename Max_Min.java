package work;

import java.util.Scanner;

public class Max_Min {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("please enter 3 number:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b && a>c) {
			System.out.println("maximum number is="+" "+a);
		}else if(b>a && b>c ) {
			System.out.println("maximum number is="+" "+b);
		}else {
			System.out.println("maximum number is="+" "+c);
			
		}if(a<b && a<c) {
			System.out.println("minimum number is="+" "+a);
		}else if(b<a && b<c ) {
			System.out.println("minimum number is="+" "+b);
		}else {
		System.out.println("minimum number is="+" "+c);
	}
	}
}
