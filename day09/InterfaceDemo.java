package day09;

import java.util.Scanner;

public class InterfaceDemo implements A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, U, X, Y, Z{
	

	public void evenOdd() {
		for(int i= 0; i<=50; i++) {
			
				if(i %2 == 0) {
					System.out.println( i +" is Even Number");
				}
				else {
					System.out.println(i +" is Odd Number");
				}
		}
	}


	public void array1(int l1, int l2) {
		int arr1[][] = {
		{1, 2, 3, 4, 5, 8, 7, 9, 10, 6},
		{11, 55, 47, 62, 75, 62, 74, 36},
		
		};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(); 
		}

		System.out.println("Number at location " +l1 +"," +l2 +" is: " +arr1[l1][l2]);
	}



	public void array2() {
		int arr1[] = {2, 4, 8, 7, 9, 31, 32, 55, 66};
		
		System.out.println("The full array is: ");
		for (int i = 0; i < arr1.length; i++) { 
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] %2 ==0) {
				System.out.println(arr1[i] +" is Even at Index " +i);
			}
			else {
				System.out.println(arr1[i] +" is Odd at Index " +i);
			}
		}
		
	}
	
	
	



	
	public void checkPrime(int pnum) {
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
	}



	public void m1(int one, int two) {
//		Addition
		int result1 = one + two;
		
		System.out.println("Addition is : " +result1);
	}
	
	
	
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
	
	
	public void printName() {
		int arr1[] = {80, 82, 65, 84, 72, 65, 77, 69, 83, 72};
		
		for (int n: arr1) {
			System.out.print((char)n);
		}
	}
	
	
	public void star1() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	
	public int checkGrade(int marks) {
//		Marks System

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
	
	
	public void ascii1() {
		
		for(char i = 'A'; i<= 'Z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}


	public void m3(int one , int two) {
//		Multiplication
		int result3 = one * two;
		
		System.out.println("Multiplication is : " +result3);
	}
	
	
	public void m2(int one , int two) {
//		Subtraction
		int result2 = one - two;
		
		System.out.println("Subtraction is : " +result2);
	}
	
	
	public void star2() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}


	public void star3() {
		
		for (int i = 1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	
	public void m4(float one , float two) {
//		Division
		float result4 = one / two;
		
		System.out.println("Division is : " +result4);
		

	}
	
	
	public void m5(int one , int two) {
//		Check Remainder
		int result5 = one % two;
		
		System.out.println("Remainder is : " +result5);
	}
	
	
	public void ascii2() {
		
		for(char i = 'a'; i<= 'z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}

	
	public void ascii3() {
		
		for(int i = 33; i<= 47; i++) {
			char j = (char) i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}
	
	
	public void star4() {
		for (int i = 5; i>=1; i--) {
			for (int j= i; j>=1; j--) {
				System.out.print("   ");
			}
			for (int k = i; k <=5; k++) {
	            System.out.print(" * ");
	        }
			System.out.println();
		}
	}

	
	
	public void star5() {
		for (int i = 5; i>=1; i--) {
			for (int j= i; j>=1; j--) {
				System.out.print("   ");
			}
			for (int k = 1; k <=5; k++) {
	            System.out.print(" * ");
	        }
			System.out.println();
		}
	}
	
	
	public void checkList() {
		
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


	public void ascii4(int a) {
		char asciival = (char) a;
		
		System.out.print(a +" = " +asciival);
	}


	public void pname1(String name) {
		System.out.print("Welcome " +name);
	}

	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter your name: ");
//		String name = sc.next();
		
		InterfaceDemo i3 = new InterfaceDemo();
		
//		i3.evenOdd();
//		i3.array1(0, 0);
//		i3.array2();
//		i3.arrayUser();
//		i3.ascii1();
//		i3.ascii2();
//		i3.ascii3();
//		i3.ascii4(65);
//		i3.checkGrade(64);
//		i3.checkList();
//		i3.checkPrime(3);
//		i3.m1(6, 4);
//		i3.m2(5, 2);
//		i3.m3(52, 3);
//		i3.m4(9, 2);
//		i3.m5(64, 3);
//		i3.printName();
//		i3.pname1(name);
//		i3.star1();
//		i3.star2();
//		i3.star3();
//		i3.star4();
		i3.star5();
		
		
	}
}


interface A {
	void evenOdd();
}

interface B {
	void array1(int a,int b);
}

interface C {
	void array2();
}

interface D {
	void checkPrime(int a);
}

interface E {
	void m1(int one , int two);
}

interface F {
	void arrayUser();
}

interface G {
	void printName();
}

interface H {
	void star1();
}

interface I {
	int checkGrade(int marks);
}

interface K {
	void ascii1();
}

interface L {
	void m3(int one , int two);
}

interface M {
	void m2(int one , int two);
}

interface N {
	void star2();
}

interface O {
	void star3();
}

interface P {
	void m4(float one , float two);
}

interface Q {
	void m5(int one , int two);
}

interface R {
	void ascii2();
}

interface S {
	void ascii3();
}

interface T {
	void star4();
}

interface U {
	void star5();
}

interface X {
	void checkList();
}

interface Y {
	void ascii4(int a);
}

interface Z {
	void pname1(String name);
}



