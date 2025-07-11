package day08_InheritanceDemo;

public class Class1 extends Class2 {
	
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
 