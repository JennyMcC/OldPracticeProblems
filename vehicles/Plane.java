package vehicles;

public class Plane extends Vehicle {
	
	public Plane() {
		super(0, 100, 500, 2, 100, 60, 17, 15, .25);
	}
	
	public String getVehicleType() {
		return "Boeing 747";
	}
}
