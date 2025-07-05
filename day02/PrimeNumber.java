package day02;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Prime number 
		System.out.print("Enter a Number : ");
		int pnum = sc.nextInt();
		
		if (pnum <= 1) {
		    System.out.print("Entered number is not a Prime number");
		}
		else {

			for (int i = 2; i < pnum; i++) {
			    if (pnum % i == 0) {
			        System.out.print("Entered number is not a Prime number");
			        return;
			    }
			}

			System.out.print("Entered number is a Prime number");

		}
	}
}
