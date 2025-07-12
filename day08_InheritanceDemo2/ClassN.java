package day08_InheritanceDemo2;

public class ClassN extends ClassO {

	public void star2() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
