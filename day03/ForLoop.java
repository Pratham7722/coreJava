package day03;

public class ForLoop {

	public static void main(String[] args) {
		
		for ( int i = 0; i<=10; i++ ) {
			System.out.print(i +" ");
		}
		
		
//		Even Odd identifier
		
		for ( int i = 0; i<=100; i++ ) {
			if( i %2 ==0) {
				System.out.println(i +" is Even ");
			} else {
				System.out.println(i +" is Odd ");
			}
		}
	}
	
}
