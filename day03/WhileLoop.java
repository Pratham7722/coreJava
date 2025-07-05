package day03;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i<=10) {
			System.out.print(i +" ");
			i++;
		}
		
		
		System.out.println();
		
		int j = 0;
		while (j%2 == 0 && j<= 20) {
			System.out.print(j +" ");
			j+=2;
		}
		
	}
	
}
