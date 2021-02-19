package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car corolla = new Toyota();
		corolla.start();
		corolla.stop();

		Car series5 = new Mercedes();
		series5.start();
		series5.stop();
		
		Car.weehl();
		
		Car car = null;
		
		car = new Toyota();
		car.start();
		
		car = new Mercedes();
		car.start();

		Toyota camry = new Toyota();
		camry.carBody();

		
		Mercedes series7 = new Mercedes();
		series7.safetryFeature();
		
		Vehicle vehicle = new AeroMobile();
		vehicle.drive();
		vehicle.fly();
		
		MotorCar motorCar = new AeroMobile();
		motorCar.flyingFeature();
		
		AeroMobile aeroMobile = new AeroMobile();
		aeroMobile.electricEngine();

			
	}

}
