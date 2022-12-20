package week1.day1;

import week1.day2.AccessSpecifiers; //it is import of week1.day2 package

public class Car {
	public void driveCar() {
		System.out.println("The car is started succesfully");
	}

	public void applyBrake() {
		System.out.println("The car is stopped");
	}

	public void soundHorn() {
		System.out.println("Press the Horn");
	}

	public void isPuncture() {
		System.out.println("The car is  not Puncture");
	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		
		AccessSpecifiers a=new AccessSpecifiers(); //we need to import that package(public access specifier)
		a.name();

	}

}
