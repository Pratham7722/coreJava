package day16;

import java.util.Scanner;

public class Threading2 extends Thread {
	
	public void run() {
		
		try {
			
			System.out.print("Enter the 10 values below in ");
			Thread.sleep(1000);
			System.out.print("3..");
			Thread.sleep(1000);
			System.out.print("2..");
			Thread.sleep(1000);
			System.out.print("1..");
			Thread.sleep(1000);
			System.out.println("Go =>");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			
			
			int arr1[] = new int[10];
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Enter " +(i+1) + " value ");
				arr1[i] = sc.nextInt();
				
			};
			
			System.out.println();
			
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println("Entered Value is " +arr1[i]);
				
			};
			
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage() +" Enter only numbers");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Threading2 t = new Threading2();
		t.start();
		
	}

}
