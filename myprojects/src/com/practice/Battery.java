package com.practice;

import java.util.Scanner;

public class Battery {
	static int batteryPercentage = 70;
	Scanner sc = new Scanner(System.in);

	void main() {

		System.out.println("Battery charged: ");
		int battery = sc.nextInt();
		charge(battery);

		state();

		System.out.println("Battery consumed: ");
		int batery = sc.nextInt();
		consumeBattery(batery);

		state();

	}

	void state() {
		if(batteryPercentage>100) {
			System.out.println("present battery percentage: 100%");
			if(batteryPercentage<0) {
				System.out.println("mobile switched off");
			}
		}else {
		System.out.println("present battery percentage: " + batteryPercentage + "%");
	}
	}

	void charge(int percent) {
		batteryPercentage = batteryPercentage + percent;
		if(batteryPercentage>=100) {
			System.out.println("mobile charge is 100%");
		}else {
			System.out.println("mobile charge: "+percent+"%");
		}
		
	}

	void consumeBattery(int percent) {
		batteryPercentage = batteryPercentage - percent;
		if(batteryPercentage<=0) {
			System.out.println("mobile battery is dead, switching off");
		}else {
			System.out.println("battery consumed: "+percent+"%");
		}
	}

}
