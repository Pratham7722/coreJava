package day16;

public class Thread_h4 extends Thread {
	
	public void run() {
        for (int i=10; i>=1; i--) {
            System.out.println("Count "+i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	Thread_h4 t = new Thread_h4();
        t.start(); 
    }


}
