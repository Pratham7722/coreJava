package day13_TryCatch;

public class ArrayException extends One {
	
	public static void main(String[] args) {
		
		m1();
	}

}


//
//class One {
//	public static void m1() {
//		
//		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(arr1[15]);
//		
//	}
//}

//ArrayIndexOutOfBoundsException for the above code


class One {
	public static void m1() {
		
		try {

			int arr1[] = {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr1[15]);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
}

