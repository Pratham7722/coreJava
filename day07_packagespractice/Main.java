package day07_packagespractice;
//import day7_packagespractice.Maths1;
//import day7_packagespractice.Maths2;
//import day7_packagespractice.EvenOdd;
//import day7_packagespractice.MarkSystem;
//import day7_packagespractice.Prime;
//import day7_packagespractice.StarPattern;
//import day7_packagespractice.NameASCII;
//import day7_packagespractice.Array;
import day06.Functions;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.print("Enter 1st No. : ");
//		int a = s.nextInt();
//		
//		System.out.print("Enter 2nd No. : ");
//		int b = s.nextInt();
		
//		Maths1 m = new Maths1();
//		m.m1(a, b);
//		m.m2(a, b);
		
//		Maths2 ma = new Maths2();
//		ma.m1(a, b);
//		ma.m2(a, b);
//		ma.m3(a, b);
		
		
		
//		System.out.print("Enter a No. : ");
//		int a = s.nextInt();
//		
//		EvenOdd e = new EvenOdd();
//		e.numberCheck(a);
		
		
		
//		MarkSystem mark = new MarkSystem();
//		System.out.print("Enter Marks : ");
//		int a = s.nextInt();
//		mark.checkGrade(a);
		
		
//		Prime p = new Prime();
//		System.out.print("Enter a No. : ");
//		int a = s.nextInt();
//		p.checkPrime(a);
		
		
//		StarPattern st = new StarPattern();
//		st.star1();
//		st.star2();
//		st.star3();
		
//		Functions f = new Functions();
//		f.ascii();
		

//		NameASCII n = new NameASCII();
//		n.printName();
		
		
		Array arr = new Array();
//		arr.array1();
		arr.array2();
		
		Demo1 d = new Demo1();
		d.hello();
		
	}

}

class Demo1 {
	
	public void hello() {
		System.out.print("Hello World!");
	}
	
}
