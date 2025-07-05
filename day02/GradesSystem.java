package day02;

import java.util.Scanner;

public class GradesSystem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Marks System
		System.out.println("  ");
		System.out.println("  ");
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();
		
		if(marks >= 90) {
			System.out.print("You have got A Grade");
		}
		else if(marks >= 80) {
			System.out.print("You have got B Grade");
		}
		else if(marks >= 70) {
			System.out.print("You have got C Grade");
		}
		else if(marks >= 50) {
			System.out.print("You have got D Grade");
		}
		else if(marks >= 35) {
			System.out.print("You have got E Grade");
		}
		else {
			System.out.print("Sorry you have Failed");
		}
	
	}
}
