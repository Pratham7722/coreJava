package day06;

import java.util.Scanner;

public class Functions {
	
	
	
	public static void evenOdd() {
		for(int i= 0; i<=50; i++) {
			
				if(i %2 == 0) {
					System.out.println( i +" is Even Number");
				}
				else {
					System.out.println(i +" is Odd Number");
				}
			
		}
	}
	
	public static void maths(int one, int two) {
		
//		Addition
		int result1 = one + two;
		
		System.out.println("Addition is : " +result1);
		
		
//		Subtraction
		int result2 = one - two;
		
		System.out.println("Subtraction is : " +result2);
		
//		Multiplication
		int result3 = one * two;
		
		System.out.println("Multiplication is : " +result3);
		
//		Division
		float result4 = one / two;
		
		System.out.println("Division is : " +result4);
		
//		Check Remainder
		int result5 = one % two;
		
		System.out.println("Remainder is : " +result5);
		
	}
	
	public static int marks(int m1) {
//		Marks System
		
		int marks = m1;
		
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
		return marks;
	
	}
	
	
	public static int prime(int pnum) {
		if (pnum <= 1) {
		    System.out.print("Entered number is not a Prime number");
		}
		else {
			if(pnum == 2) {
				System.out.println("Entered number is neither Prime number nor composite");
			}
			else {
				for (int i = 2; i < pnum; i++) {
					
					if (pnum % i == 0) {
				        System.out.println("Entered number is not a Prime number");
				        break;
				    }
				    System.out.println("Entered number is a Prime number");
				    break;
				}
			}
		}
		return pnum;
	}
	
	
	public static char ascii() {
		for(char i = 'A'; i<= 'Z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}
		return 0;
	}
	
	
	public static void pname() {
		int arr1[] = {80, 82, 65, 84, 72, 65, 77, 69, 83, 72};
		
		for (int n: arr1) {
			System.out.print((char)n);
		}
	}
	
	
	public static void star1() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	
	public static void star2() {
		
//		Half Diamond Pattern
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		for (int i = 1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void array() {
		
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
			if(arr1[i]>0 && arr1[i]%2 == 0) {
				System.out.print(arr1[i] +", ");	
			}
		};

	}
	
	
	
	public static void storeCheck(int size, int prod, int arr1[]) {
		
		
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
	
	
	
	public static void main(String[] args) {
		
//		evenOdd();
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("Enter 1st No. : ");
//		int a = s.nextInt();
//		
//		System.out.print("Enter 2nd No. : ");
//		int b = s.nextInt();
//		
//		maths(a, b);
		
		

//		System.out.print("Enter Marks : ");
//		int m = s.nextInt();
//		
//		marks(m);
		
		
//		System.out.print("Enter a Number : ");
//		int pnum = s.nextInt();
//		
//		prime(pnum);
		
//		ascii();
		
//		pname();
		
//		star1();
		
//		star2();
		
//		array();
		
		
		
		System.out.print("Enter a Size: ");
		
		int size = s.nextInt();
		
		int arr1[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter Product ID " +(i+1));
			arr1[i] = s.nextInt();
			
		};
		
		System.out.println("Enter the product Id to check: ");
		int prod = s.nextInt();
		
		storeCheck(size, prod, arr1);
	}

}
