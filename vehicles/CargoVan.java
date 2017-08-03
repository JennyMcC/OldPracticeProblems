package vehicles;

public class CargoVan extends Vehicle {

	public CargoVan() {
		super(4, 7, 55, 2, 100, 60, 17, 15, .25);
	}

	public String getVehicleType() {
		return "shiny battered van with dark windows.";
	}
}
