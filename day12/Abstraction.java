package day12;

public class Abstraction extends One {
	
	public void one1() {
		System.out.println("Without Body");
	}
	
	
	public static void main(String[] args) {
		One o = new Abstraction();
//		o.one();
		o.one1();
	}
	

}


abstract class One{
	public void one() {
		System.out.println("With Body");
	}
	public abstract void one1();
}

