package day10;

import java.util.Scanner;

public class Overriding {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter 1st no. : ");
//		int a =sc.nextInt();
//		System.out.print("Enter 2nd no. : ");
//		int b =sc.nextInt();
		
		
		System.out.print("Enter 1st no. : ");
		int c =sc.nextInt();
		System.out.print("Enter 2nd no. : ");
		int d =sc.nextInt();
		
		
//		One.m1(a,b);
		
		Two.m1(c, d);
		
		
	}

	
}



class One{
	
	public static void m1(int a , int b) {
		int result = a+b;
		System.out.print("Result : "+result);
	}
	
}

class Two{
	
	public static void m1(int a, int b) {
		int result = a-b;
		System.out.print("Result : "+result);
	}
	
}