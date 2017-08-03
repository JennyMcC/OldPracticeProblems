package people;

public abstract class Person {

	int hours;
	double rate;
	String pay;
	
public Person(double rate) {
	this.rate = rate;
}
	
public double getPaid() {
	return rate / 52;
}
}
