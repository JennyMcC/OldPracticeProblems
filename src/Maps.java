import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {


		public static void main(String[] args) {
			
			Map<String, Double> menu = new HashMap<String, Double>();
			
			menu.put("spaghetti", 8.97);
			menu.put("lasagna", 10.98);
			menu.put("pizza", 15.50);
			menu.put("caesar salad", 7.00);
			menu.put("kale salad", 7.00);
			System.out.println(menu);
			
			Double getItem = menu.get("spaghetti");
			System.out.println("The menu price of spaghetti is $" + getItem);
			
			System.out.println("There are " + menu.size() + " items on the menu.");
			
			menu.put("Bottle of Champagne", 200.00);
			menu.put("Bottle of Vintage Wine", 175.00);
			System.out.println(menu);
			
			if(menu.containsKey("Bottle of Champagne")) {
				System.out.println("There IS a bottle of Champagne on the menu.");
			} else {
				System.out.println("No, you lush.");
			}
			
			if(menu.containsValue(13.50)) {
				System.out.println("There is a menu item priced at $13.50.");
			} else {
				System.out.println("There is no menu item that costs $13.50. NOW GIVE ME MY $2.");
			}
			
			menu.remove("kale salad");
			System.out.println("Kale has been removed from the menu, the new menu is: " + menu);
			
			menu.clear();
			
			if(menu.isEmpty()) {
				System.out.println("The menu is empty.");
			}
			
			
			
			
			
			Map<String, String> students = new HashMap<String, String>();
			
			students.put("68Z29", "Jessica Jones");
			System.out.println("The hashcode for 68Z29 is: " + "68Z29".hashCode());
			System.out.println(students);
			
			students.put("23A52", "Harvey Dent");
			System.out.println("The hashcode for 23A52 is: " + "23A52".hashCode());
			System.out.println(students);
			
			String studentName = students.get("23A52");
			System.out.println("I found student " + studentName);
			
			String studentName2 = students.get("68Z29");
			System.out.println("I found student " + studentName2);
			
			//common map methods
			System.out.println("Student names (map values) are " + students.values());
			System.out.println("Student ids (map key) are " + students.keySet());
			//use entrySet() when you need both key and value
			System.out.println("Student entries (key value pairs) are " + students.entrySet());
			
			System.out.println("Iterating over student names:");
			for(String currentName: students.values()) {	
				System.out.println(currentName);
			}
		
			System.out.println("Iterating over entries:");
			for(Entry<String, String> entry: students.entrySet()) {
				String key = entry.getKey(); //student id
				String value = entry.getValue(); //student name
				System.out.println("key is " + key + ", value is " + value);
			}
			
			//sorting a list (sidebar)
			System.out.println("Sorting a list:");
			List<String> listOfClasses = new ArrayList<String>();
			listOfClasses.add("Philosophy");
			listOfClasses.add("Creative Writing");
			System.out.println(listOfClasses);
			Collections.sort(listOfClasses);
			System.out.println(listOfClasses);
			
			//is this a valid student id?
			if(students.containsKey("23A52")) {
				System.out.println("Yes, 23A52 is a valid student id.");
			}
			if(students.containsKey("1234")) { //bad one
				System.out.println("Found one"); //doesn't print
			}
			
			//is this a valid student name?
			if(students.containsValue("Harvey Dent")) {
				System.out.println("Found Harvey");
			}
			
			//do we have any students?
			if(!students.isEmpty()) {
				System.out.println("We have students!");
			}
			
			//sorry Harvey. You're DC
			students.remove("23A52"); //his id is the key
			System.out.println(students);
			
			//how many students are there?
			System.out.println("There are " + students.size() + " students.");
			
			
			
			
			
			ArrayList<Boolean> weather = new ArrayList<Boolean>();
			
			weather.add(true);
			weather.add(false);
			weather.add(false);
			weather.add(true);
			weather.add(false);
			
			for(boolean message: weather) {
			if(message) {
				System.out.println("Bring an umbella!");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}
	}
}
}

