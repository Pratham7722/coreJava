package day13_TryCatch;

import java.util.Scanner;

public class ArithmeticException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter 1st no. : ");
//		int a = sc.nextInt();
//		
//		System.out.print("Enter 2nd no. : ");
//		int b = sc.nextInt();
//		
//		Maths m = new Maths();
//		m.m1(a, b);
		
		
		try {
			System.out.print("Enter value : ");
			int c = sc.nextInt();
			System.out.println("Entered value : "+c);
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("InputMismatchException ");
		}
		
		
		
	}

}



class Maths{
	
	public void m1(int n1, int n2) {
		
		try {
			
			int result = n1 / n2;
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println("ArithmeticException:"+e.getMessage());
		}
	}
	
}







