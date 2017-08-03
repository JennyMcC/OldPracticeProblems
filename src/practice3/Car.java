package practice3;

public class Car extends Vehicle {
	
	private String make;
	private String model;

	public Car(int wheels, int doors, String make, String model) {
		super(wheels, doors);
		this.make = make;
		this.model = model;
	}

}
