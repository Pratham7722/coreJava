package day05;

import java.util.Scanner;

public class StoreCheck {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size: ");
		
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter Product ID " +(i+1));
			arr1[i] = sc.nextInt();
			
		};
		
		System.out.println("Enter the product Id to check: ");
		int prod = sc.nextInt();
		
		boolean prod1 = false;
		
		for (int i = 0; i < size; i++) {
			
			if(prod == arr1[i]) {
				prod1 = true;
				break;
			} 
		};
		
		if(prod1 == true) {
			System.out.print("Available");
		}
		else {
			System.out.print("Not Available");
		}
		
	} 

}
