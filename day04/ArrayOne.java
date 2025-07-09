package day04;

public class ArrayOne {
	
	public static void main(String[] args) {
		
		int arr1[] = {2, 4, 8, 7, 9, 31, 32, 55, 66};
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] %2 ==0) {
				System.out.println(arr1[i] +" is Even at Index " +i);
			}
			else {
				System.out.println(arr1[i] +" is Odd at Index " +i);
			}
		}
		
//		for(int h = 0; h <= 24; h++) {
//			for (int m =0; m <= 59; m++) {
//				for (int s = 0; s<=59; s++) {
//					System.out.print(s);
//				}
//				System.out.print(m);
//			}
//			System.out.print(h);
//		}
		
		
	}

} 

