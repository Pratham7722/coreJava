package day10;

import java.util.Scanner;

public class Overloading {
	
	public static void m1(int a , int b) {
		int result = a+b;
		System.out.print("Result : "+result);
	}
	
	public static void m1(float a, float b) {
		float result = a/b;
		System.out.print("Result : "+result);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter 1st no. : ");
//		int a =sc.nextInt();
//		System.out.print("Enter 2nd no. : ");
//		int b =sc.nextInt();
		
		
		System.out.print("Enter 1st no. : ");
		float c =sc.nextInt();
		System.out.print("Enter 2nd no. : ");
		float d =sc.nextInt();
		
//		m1(a,b);
		m1(c,d);
		
		
		
	}

}
