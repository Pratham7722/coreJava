package day08_InheritanceDemo2;

public class ClassB extends ClassA {

	public void array1(int l1, int l2) {
		int arr1[][] = {
				{1, 2, 3, 4, 5, 8, 7, 9, 10, 6},
				{11, 55, 47, 62, 75, 62, 74, 36},
				
		};
		
		for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(); 
        }
		
		System.out.println("Number at location " +l1 +"," +l2 +" is: " +arr1[l1][l2]);
	}
	
}
 