package oop.abstraction;

public abstract class MotorCar implements Vehicle {
	
	public void engine() {
		System.out.println("Engine runs on gasolin");
	}
	
	public void drive() {
		System.out.println("Car can drive on the road");
	}

	
	public void fly() {
		System.out.println("Car can fly in the sky");
		
	}

	public abstract void flyingFeature();
}
