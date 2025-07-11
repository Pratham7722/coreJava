package day08_InheritanceDemo;

public class Class10 extends Class11{
	
	public void ascii1() {
		
		for(char i = 'A'; i<= 'Z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}
	
	public void ascii2() {
		
		for(char i = 'a'; i<= 'z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}
	
	public void ascii3() {
		
		for(int i = 33; i<= 47; i++) {
			char j = (char) i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}

}
