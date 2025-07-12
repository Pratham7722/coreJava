package day08_InheritanceDemo2;

public class ClassA extends ClassD {
	
	public static void evenOdd() {
		for(int i= 0; i<=50; i++) {
			
				if(i %2 == 0) {
					System.out.println( i +" is Even Number");
				}
				else {
					System.out.println(i +" is Odd Number");
				}
			
		}
	}
	
}

 