package day08_InheritanceDemo2;

public class ClassR extends ClassS {

	public void ascii2() {
		
		for(char i = 'a'; i<= 'z'; i++) {
			int j = i;
			System.out.print(i +" " +j +"  ");
		}

		System.out.println();
	}
	
}
