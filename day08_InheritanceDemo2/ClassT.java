package day08_InheritanceDemo2;

public class ClassT extends ClassU {
	
	public void star4() {
		for (int i = 5; i>=1; i--) {
			for (int j= i; j>=1; j--) {
				System.out.print("   ");
			}
			for (int k = i; k <=5; k++) {
	            System.out.print(" * ");
	        }
			System.out.println();
		}
	}

}
