package day16;

public class Thread_h5 {

	public static void main(String[] args) {
		Alphabets a= new Alphabets();
		Numbers n = new Numbers();

		a.m1();
		n.m2();
	}
}

class Alphabets extends Thread {
	 public void m1() {
	     for (char c = 'A'; c <= 'Z'; c++) {
	         System.out.println("Alphabet: " + c);
	         try {
	             Thread.sleep(1000); 
	         } catch (Exception e) {
	        	 e.printStackTrace();
	         }
	     }
	 }
}


class Numbers extends Thread {
	 public void m2() {
	     for (int i = 1; i <= 26; i++) {
	         System.out.println("Number: " + i);
	         try {
	             Thread.sleep(1000); 
	         } catch (Exception e) {
	        	 e.printStackTrace();
	         }
	     }
	 }
}
