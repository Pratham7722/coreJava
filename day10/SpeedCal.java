package day10;

import java.util.Scanner;

public class SpeedCal {
	
	public static void speedmeasure(float dist, float time) {
		
		float t = time/60;
		
		float speed = dist/t;
		
		
		System.out.println("Calculated Speed is " +speed +" Km/hr");
		
		float fair = dist*9;
		System.out.println("Total fair will be : ₹" +fair);

		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance in KM : ");
		float d = sc.nextFloat();
		System.out.print("Enter time in minutes : ");
		float t =sc.nextFloat();
		
		
		speedmeasure(d,t);
	}

}



