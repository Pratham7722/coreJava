package day08_InheritanceDemo;

public class Class8 extends Class9 {
	public void star1() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void star2() {
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public void star3() {
		
		for (int i = 1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
