package day16;

public class Thread_h2 extends Thread {

	public void m1() {
		
		System.out.println("Even ");
		for(int i = 1; i<=20; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	public void m2() {
		
		System.out.println("Odd");
		for(int i = 1; i<=20; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Thread_h2 t = new Thread_h2();
		t.m1();
		System.out.println();
		t.m2();
		
	}
	
}
