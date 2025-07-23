package day16;

public class Threading1 extends Thread {
	
	public void run() {
		System.out.println("This is the example of Run-Start method");
	}
	
	
	public void m1() {
		
		try {
			Thread.sleep(4000);
			int arr[]= {12, 545, 548, 779, 12, 23, 449, 1651, 789, 986};
			
			for(int a : arr) {
				Thread.sleep(1000);
				System.out.println("Values from 1st array " +a);
			}
			System.out.println("This was the example of MultiThreading using time delay");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void m2() {
		
		try {
			Thread.sleep(3000);
			int arr[]= {514, 555, 61, 56564, 88, 2313, 544, 136, 7546, 3156, 5510};
			
			for(int a : arr) {
				Thread.sleep(1000);
				System.out.println("Values from 2nd array " +a);
			}
			System.out.println("This was the example of MultiThreading using time delay");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	Threading1(int a, int b){
		int result = a + b;
		System.out.println("Add is " +result);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Threading1 t = new Threading1(10,30);
		t.m1();
		System.out.println();
		t.m2();
		System.out.println();
		System.out.println("-----------------------------");
		t.start();
		
	}

}
