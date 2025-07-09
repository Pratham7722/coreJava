package day05;

import java.util.Scanner;

public class ArrayTwo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size: ");
		
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Array Index " +i);
			arr1[i] = sc.nextInt();
			
		};
		
		
		
		System.out.print("Even and Positive numbers in Array are : ");
		
		for (int i = 0; i < size; i++) {
			if(arr1[i]>0) {
				if(arr1[i]%2 == 0) {
					System.out.print(arr1[i] +", ");	
				}	
			}
		};
		
		System.out.println();
		
		System.out.print("Odd and Negative numbers in Array are : ");
		for (int i = 0; i < size; i++) {
			if(arr1[i]<0) {
				if(arr1[i]%2 != 0) {
					System.out.print(arr1[i] +", ");	
				}	
			}
		};
	}
}
