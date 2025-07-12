package day08_InheritanceDemo2;

public class ClassI extends ClassC {
	
	public int checkGrade(int marks) {
//		Marks System

		if(marks >= 90) {
			System.out.print("You have got A Grade");
		}
		else if(marks >= 80) {
			System.out.print("You have got B Grade");
		}
		else if(marks >= 70) {
			System.out.print("You have got C Grade");
		}
		else if(marks >= 50) {
			System.out.print("You have got D Grade");
		}
		else if(marks >= 35) {
			System.out.print("You have got E Grade");
		}
		else {
			System.out.print("Sorry you have Failed");
		}
		return marks;
	}

}
