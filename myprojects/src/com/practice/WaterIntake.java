package com.practice;

import java.util.Scanner;

public class WaterIntake {
	double litersDrunk = 0;
	double dailylimit = 4000;
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		WaterIntake water = new WaterIntake();
		water.start();
		

	}
	void start() {
		showIntake();
		
		System.out.println("total water drunk morning: ");
		double morning = sc.nextInt();
		drinkWater(morning);
		showIntake();
		
		System.out.println("total water drunk afternoon: ");
		double afternoon = sc.nextInt();
		drinkWater(afternoon);
		showIntake();
		
		System.out.println("total water drunk evening: ");
		double evening = sc.nextInt();
		drinkWater(evening);
		showIntake();
		
		sc.close();
		
	}
	void showIntake() {
		System.out.println("***today's hydration check***");
		if(litersDrunk>dailylimit) {
			System.out.println("your daily limit is reached stay hydrate");
		}else {
			double remaining = dailylimit - litersDrunk;
			System.out.println("still "+remaining+" ml of water is remained to drink");
		}
	}
	void drinkWater(double ml) {
		litersDrunk+=ml;
		
	}

}
