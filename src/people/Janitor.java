package people;

public class Janitor extends Person {
	
	int hours = 36;
	
	public Janitor() {
		super(20);
	}
	
	@Override
	public double getPaid() {
		return hours * rate;
	}

}
