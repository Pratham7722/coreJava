package day14;

import java.util.Scanner;

public class CustomExceptionAge {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter age : ");
		int age = sc.nextInt();
		
		if (age < 0) {
			throw new ArithmeticException("Age is Invalid");
		}
		else {
			System.out.println("Age is invalid");
		}
		
	}

}
