package day14;

import java.util.Scanner;

public class CustomExceptionMarks extends Exception {
    public CustomExceptionMarks(String msg) {
        super(msg);
    }
    
    public static void main(String[] args) throws CustomExceptionMarks {
        Scanner sc = new Scanner(System.in);

        try {
        	One o = new One();
            System.out.print("Enter Marks : ");
            int mark = sc.nextInt();

            o.checkMarks(mark);
            
        } catch (CustomExceptionMarks e) {
            System.out.println(e.getMessage());
        }
        
    }
}

class One {
	
    public void checkMarks(int mark) throws CustomExceptionMarks {
        if (mark < 0 || mark > 100) {
            throw new CustomExceptionMarks("Marks should be between 0 to 100");
        } else {
            System.out.println("Marks is Valid");
        }
    }

}

