package day02;

import java.util.Scanner;

public class ArithmeticOperators {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter 1st No. : ");
		int one = sc.nextInt();
		
		System.out.print("Enter 2nd No. : ");
		int two = sc.nextInt();
		
//		Addition
		int result1 = one + two;
		
		System.out.println("Addition is : " +result1);
		
		
//		Subtraction
		int result2 = one - two;
		
		System.out.println("Subtraction is : " +result2);
		
//		Multiplication
		int result3 = one * two;
		
		System.out.println("Multiplication is : " +result3);
		
//		Division
		int result4 = one / two;
		
		System.out.println("Division is : " +result4);
		
//		Check Remainder
		int result5 = one % two;
		
		System.out.println("Remainder is : " +result5);
	}
}
