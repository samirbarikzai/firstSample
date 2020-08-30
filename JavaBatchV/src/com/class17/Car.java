package com.class17;

public class Car {

	// define attributes/features-->variable
	String make, model, color;
	int year, wheels, windows, speed;

	// adding behavior/action-->methods():
	void drive() {
		System.out.println("car " + make + "can drive");

	}

	void start() {
		System.out.println("car " + make + "can start");

	}

	void accelerate() {

		System.out.println("car" + make + " can accelerate");

	}
}