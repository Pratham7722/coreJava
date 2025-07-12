package day08_InheritanceDemo2;

public class ClassD extends ClassE{
	
	public void checkPrime(int pnum) {
		if (pnum <= 1) {
		    System.out.print("Entered number is not a Prime number");
		}
		else {
			if(pnum == 2) {
				System.out.println("Entered number is neither Prime number nor composite");
			}
			else {
				for (int i = 2; i < pnum; i++) {
					
					if (pnum % i == 0) {
				        System.out.println("Entered number is not a Prime number");
				        break;
				    }
				    System.out.println("Entered number is a Prime number");
				    break;
				}
			}
		}
	}
	 
}
