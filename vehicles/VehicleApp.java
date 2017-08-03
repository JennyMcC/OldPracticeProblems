package vehicles;

public class VehicleApp {
	public static void main(String[] args) {

		Vehicle car = new Car();
		deliverStuffWith(car);

		Vehicle van = new Van();
		deliverStuffWith(van);

		Vehicle bike = new Bike();
		deliverStuffWith(bike);

		Vehicle plane = new Plane();
		deliverStuffWith(plane);

		Vehicle cargoVan = new CargoVan();
		deliverStuffWith(cargoVan);
	}

	public static void deliverStuffWith(Vehicle v) {
		System.out.println("Van can travel " + v.travelOverTime() + " miles in two hours.");
		System.out.println("Van will take " + v.travelOverDistance() + " hours to travel 100 miles.");
		System.out.println("My vehicle is a " + v.getVehicleType());
		System.out.println("My vehicles current range is: " + v.currentRange());
		System.out.println("I have enough gas for " + v.travelTimeBeforeRefueling());
		System.out.println("In three hours, I travel " + v.travelFor(3));
		System.out.println("I have enough gas for " + v.travelFor(6));
	}
}
