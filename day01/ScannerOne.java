package day01;

import java.util.Scanner;

public class ScannerOne {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name ");
		System.out.println("Enter your Age");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		
		System.out.println("Welcome " +name);
		
		System.out.println("Your Age is " +age);
	}

}