package day15_1;

public class AccessModifiers_1 extends One {
	
	public static void main(String[] args) {
		
		One o = new One();
//		o.m1();
//		o.m2();
//		o.m3();
		System.out.println(o.no1);
		System.out.println(o.no2);
		System.out.println(o.no4);
		
	}

}


class One {
	
	public int no1 = 5;
	int no2 = 10;
	private int no3 = 15;
	protected int no4 = 20;
	
	public void m1() {
		
		System.out.println(no1 +" ");
		System.out.println(no2 +" ");
		System.out.println(no3 +" ");
		System.out.println(no4 +" ");
		
	}
	
	protected void m2() {
		
		System.out.println(no1 +" ");
		System.out.println(no2 +" ");
		System.out.println(no3 +" ");
		System.out.println(no4 +" ");
		
	}

	 void m3() {
	
		System.out.println(no1 +" ");
		System.out.println(no2 +" ");
		System.out.println(no3 +" ");
		System.out.println(no4 +" ");
	
	}

	private void m4() {
	
		System.out.println(no1 +" ");
		System.out.println(no2 +" ");
		System.out.println(no3 +" ");
		System.out.println(no4 +" ");
	
	}
	
}
