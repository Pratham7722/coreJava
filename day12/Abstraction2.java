package day12;

public class Abstraction2 extends Maths {
	
	public void operation() {
		System.out.println("Performs Mathematical Operations");
	}
	
	public static void main(String[] args) {
		
		Abstraction2 a = new Abstraction2();
		a.operation();
		
		Add ad = new Add();
		ad.operation();
		
		Sub su = new Sub();
		su.operation();
		
		Multi mu = new Multi();
		mu.operation();
		
		Div di = new Div();
		di.operation();
		
	}

}


abstract class Maths{
	
	public abstract void operation();
	
}


class Add extends Maths{
	public void operation() {
		int result = 10 + 20;
		System.out.println("Addition is " +result);
	}
}

class Sub extends Maths{
	public void operation() {
		int result = 10 - 20;
		System.out.println("Subtraction is " +result);
	}
}

class Multi extends Maths{
	public void operation() {
		int result = 10 * 20;
		System.out.println("Multiplication is " +result);
	}
}

class Div extends Maths{
	public void operation() {
		int result = 10 / 20;
		System.out.println("Division is " +result);
	}
}