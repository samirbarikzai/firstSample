package com.class29;

public abstract class Vehicle {

	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("vehicle can stop");
	}

	public abstract void start();

	public abstract void speed();
}
	abstract class Car extends Vehicle {
		public void speed() {
			System.out.println("Max car speed up to 400");
		}

		public abstract void breaking();
	}

	abstract class BMW extends Car {

		@Override
		public void start() {
		
			System.out.println("BMW starts remote");

		}

		public void Breaking() {
			System.out.println("BMW can break");

		}


	}

