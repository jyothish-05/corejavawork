package com.practice;

import java.util.Scanner;

public class StepCounter {
	static int totalSteps = 0;
	int dailyGoal = 20000;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StepCounter step = new StepCounter();
		step.start();

	}
	void start() {
		showSteps();
		
		System.out.println("Enter the morning steps walked: ");
		int step = sc.nextInt();
		addSteps(step);
		showSteps();
		
		System.out.println("Enter the steps walked evening: ");
		int step1 = sc.nextInt();
		addSteps(step1);
		showSteps();
		
		System.out.println("if you want to reset steps for the next day press '1' for yes and '0' for no");
		int choice = sc.nextInt();
		if(choice==1) {
			resetSteps();
			showSteps();
		}
		sc.close();
	}
	void showSteps() {
		System.out.println("***Fitness check***");
		if(totalSteps>dailyGoal) {
			System.out.println("congrats you have achieved your goal");
			
		}else {
			int remaining = dailyGoal - totalSteps;
			System.out.println("today "+remaining+" steps are left hope you complete it");
		}
	}
	void addSteps(int steps) {
		totalSteps+= steps;
		System.out.println("steps walked: "+steps);
	}
	void resetSteps() {
		totalSteps= 0;
		System.out.println("your fitness track is reset to zero ");
	}

}
