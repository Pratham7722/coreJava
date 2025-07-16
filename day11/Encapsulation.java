package day11;
import java.util.Scanner;

public class Encapsulation {
	
	private String name;
	private int age;
	private double marks;
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0) {
			if(age >=18) {
				this.age = age;
				System.out.println("You are Eligible to Vote ! ");
			}
			else {
				this.age = age;
				System.out.println("You are Not Eligible to Vote ! ");
			}
		}
		else {
			System.out.print("Enter valid age.");
		}
	}
	
	

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your name: ");
		String n = sc.next();
		System.out.print("Enter Your age: ");
		int a = sc.nextInt();
		System.out.print("Enter marks: ");
		double m = sc.nextDouble();
		
		Encapsulation e = new Encapsulation();
//		e.setName(n);
//		System.out.print("Welcome " +e.getName());
		
		System.out.println();
		
		e.setAge(a);
		System.out.print("Your Age is : "+e.getAge());
		
		System.out.println();
		
//		e.setMarks(m);
//		System.out.print("Marks: " +e.getMarks());
		
		
	}

}
