package day13_TryCatch;

import java.util.Scanner;

public class ArrayException2 {
	
	public static void m1(int i) {
		
		try {
			int arr1[] = {1,2,3,4,5,6,7,8,9};
			System.out.println("Value at index " +i +" is " +arr1[i]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter index : ");
		int i1 = sc.nextInt();
		m1(i1);
		
		
	};

}
