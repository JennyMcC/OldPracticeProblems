package vehicles;

public abstract class Vehicle {

	private double speed;
	private int time;
	private int rateOfTravelPerHour; // mph
	private int milesPerGallon;
	private int currentFuelLevel;
	private int refuelingTimeInHours;
	private double distance;

	public Vehicle(int wheelNumber, int passengers, double speed, int time, double distance, int rate, int fuel,
			int mpg, double refuelingTime) {
		this.speed = speed;
		this.time = time;
		this.distance = distance;
		rateOfTravelPerHour = rate;
		currentFuelLevel = fuel;
		milesPerGallon = mpg;
		System.out.println("Vehicle info: " + wheelNumber + " wheels and can hold " + passengers + " passengers.");
	}

	// abstract means that vehicles must implement this method
	public abstract String getVehicleType();

	public double travelFor(double hours) {
		if (hours >= travelTimeBeforeRefueling()) {
			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
		}
		return hours * rateOfTravelPerHour;
	}

	public int currentRange() {
		return currentFuelLevel * milesPerGallon;
	}

	public double travelTimeBeforeRefueling() {
		return currentRange() / rateOfTravelPerHour;
	}

	public double travelOverTime() {
		return speed * time;
	}

	public double travelOverDistance() {
		return distance / speed;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
