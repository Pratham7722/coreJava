package day16;

public class Thread_h1 extends Thread {
	
	public void run() {
		
		for (int i = 1; i<=10 ; i++) {
			System.out.println(i);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Thread_h1 t = new Thread_h1();
		t.start();
		
	}

}
