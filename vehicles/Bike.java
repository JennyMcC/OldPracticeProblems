package vehicles;

public class Bike extends Vehicle {
	double tod;
	double rest;
	double speed;
	double distance;

	public Bike() {
		super(2, 1, 15, 2, 100, 60, 0, 0, 0);
	}

	public String getVehicleType() {
		return "Huffy Cruiser";
	}

	@Override
	public double travelOverDistance() {
		tod = distance / speed;
		rest = tod * .1;
		return tod + rest;
	}
}
