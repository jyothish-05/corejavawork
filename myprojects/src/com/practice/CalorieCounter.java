package com.practice;

import java.util.Scanner;

public class CalorieCounter {
	int totalCalories = 0;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CalorieCounter c = new CalorieCounter();
		c.start();

	}

	void start() {
		showStatus();
		System.out.println("total calories added morning: ");
		int morning = sc.nextInt();
		addFood(morning);
		showStatus();

		System.out.println("total calories added afternoon: ");
		int afternoon = sc.nextInt();
		addFood(afternoon);
		showStatus();

		System.out.println("total calories burned at gym: ");
		int burned = sc.nextInt();
		burnCalories(burned);
		showStatus();

		System.out.println("total calories added evening: ");
		int evening = sc.nextInt();
		addFood(evening);
		showStatus();

	}

	void showStatus() {
		System.out.println("*****Calories status check*****");
		System.out.println("today's total calories: " + totalCalories);
	}

	void addFood(int calories) {
		totalCalories += calories;

	}

	void burnCalories(int calories) {
		totalCalories -= calories;

	}

}
