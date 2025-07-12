package day08_InheritanceDemo2;

public class ClassC extends ClassB {
	
	public void array2() {
		int arr1[] = {2, 4, 8, 7, 9, 31, 32, 55, 66};
		
		System.out.println("The full array is: ");
		for (int i = 0; i < arr1.length; i++) { 
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] %2 ==0) {
				System.out.println(arr1[i] +" is Even at Index " +i);
			}
			else {
				System.out.println(arr1[i] +" is Odd at Index " +i);
			}
		}
	
	}
	
}
 