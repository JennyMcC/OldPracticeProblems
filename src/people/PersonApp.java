package people;

public class PersonApp {
public static void main(String[] args) {
	
	Person janitor = new Janitor();
	System.out.println("Janitor's 2-week paycheck: $" + janitor.getPaid());
	
	Person manager = new Manager();
	System.out.println("Manager's 2-week paycheck: $" + manager.getPaid());
	
	Person developer = new Developer();
	System.out.println("Developer's 2-week paycheck: $" + developer.getPaid());
	
	Person hr = new HumanResources();
	System.out.println("Human Resources 2-week paycheck: $" + hr.getPaid());
}
}
