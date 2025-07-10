package day07_packagespractice;

public class Array {
	
	public void array1() {
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
		
		System.out.println("Number at 0,6 is: " +arr1[0][6]);
	}
	
	public void array2() {
		int arr1[] = {2, 4, 8, 7, 9, 31, 32, 55, 66};
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] %2 ==0) {
				System.out.println(arr1[i] +" is Even at Index " +i);
			}
			else {
				System.out.println(arr1[i] +" is Odd at Index " +i);
			}
		}
	
		System.out.println();
		System.out.println("The full array is: ");
	    for (int i = 0; i < arr1.length; i++) { 
	        System.out.print(arr1[i] + " ");
	    }
	    System.out.println();
		
	}
	
}
