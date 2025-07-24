package day16;

public class Thread_h3 extends Thread {
	
	public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("Print "+i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	Thread_h3 t = new Thread_h3();
        t.start(); 
    }


}
