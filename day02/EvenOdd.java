package day02;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//		Even Odd with Sign identification
		System.out.println("  ");
		System.out.print("Enter a No. : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num %2 == 0) {
				System.out.print("Entered No. " +num +" is Positive and Even Number");
			}
			else {
				System.out.print("Entered No. " +num +" is Positive and Odd Number");
			}
		}
		else {
			System.out.print("Entered No. " +num +" is Negative");
		}
	}
}
