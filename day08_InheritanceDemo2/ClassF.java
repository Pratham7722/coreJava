package day08_InheritanceDemo2;

import java.util.Scanner;

public class ClassF{
	
	public void arrayUser() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size: ");
		
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Array Index " +i);
			arr1[i] = sc.nextInt();
			
		};
		
		System.out.println();
		System.out.println("The full array is: ");
	    for (int i = 0; i < arr1.length; i++) { 
	        System.out.print(arr1[i] + " ");
	    }
	    System.out.println();
	}
	
}
