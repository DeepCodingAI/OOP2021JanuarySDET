package oop.polymorphism;

public class TestPloymorphism {

	public static void main(String[] args) {
		LandCalculator cal = new LandCalculator();
		int straightLine = cal.areaOfLand(10, 12);
		System.out.println("StraightLine:"+straightLine);
		System.out.println("Triangle: "+cal.areaOfLand(10, 8, 20));
		System.out.println("Rectangle: "+cal.areaOfLand(10, 8, 20,15));
		
		
		ModernLandCalculator modernCal = new ModernLandCalculator();
		System.out.println("Modern Calculator measurement of Rectangle: "+ modernCal.areaOfLand(10, 8, 20,15));
			

	}

}
