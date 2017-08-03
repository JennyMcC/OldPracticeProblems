import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {

public static void main(String[] args) {
		
//		System.out.println("Two Questions! \nThink of an object and I'll try to guess it! \nQuestion 1.Is it an animal, vegetable or mineral?");
//		Scanner input = new Scanner(System.in);
//		String answer1 = input.next();
//		
//		System.out.println("Question 2.Is it bigger than a bread box?");
//		String answer2 = input.next();
//		
//		if((answer2.toLowerCase().equals("no")) && (answer1.toLowerCase().equals("animal"))){
//			System.out.println("Is it a mouse? If so, sweet. If not, whatever. I don't really care about this.");
//		} else if((answer2.toLowerCase().equals("yes")) && (answer1.toLowerCase().equals("animal"))){
//			System.out.println("Is it a semi-truck? If so, sweet. If not, whatever. I don't really care about this.");
//		} else if((answer2.toLowerCase().equals("no")) && (answer1.toLowerCase().equals("vegetable"))){
//			System.out.println("Is it a pepper? If so, sweet. If not, whatever. I don't really care about this.");
//		} else if((answer2.toLowerCase().equals("yes")) && (answer1.toLowerCase().equals("vegetable"))){
//			System.out.println("Is it a pumpkin? If so, sweet. If not, whatever. I don't really care about this.");
//		} else if((answer2.toLowerCase().equals("no")) && (answer1.toLowerCase().equals("mineral"))){
//			System.out.println("Is it a paperclip? If so, sweet. If not, whatever. I don't really care about this.");
//		} else if((answer2.toLowerCase().equals("yes")) && (answer1.toLowerCase().equals("mineral"))){
//			System.out.println("Is it a truck? If so, sweet. If not, whatever. I don't really care about this.");
//		} else {
//			System.out.println("That wasn't an option, nerd.");
//		}
//		input.close();
		
//		Scanner input = new Scanner(System.in);
//	
//		System.out.println("I'm thinking of a number from 1-100. Try to guess it.");
//		int guess1 = input.nextInt();
//		int r = (int)(Math.random() * 100);
//	
//		if(guess1 == r) {
//			System.out.println("Holy shit, you were right on the first guess!");
//		} else if(guess1 < r) {
//			System.out.println("Nope. You're too low. I was thinking " + r);
//		} else if(guess1 > r) {
//			System.out.println("Nope. You're too high. I was thinking " + r);
//		}
//		input.close();
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("I will add up the numbers that you give me:");
//	do {
//		int num = input.nextInt();
//		System.out.println(num + num);
//	
//		
//	} while (input.nextInt() != 0);
//		
//		input.close();
//	}
//	
//}
		
//		System.out.println("JJJJJJJ");
//		System.out.println("   J   ");
//		System.out.println("   J   ");
//		System.out.println("   J   ");
//		System.out.println("J  J   ");
//		System.out.println("J  J   ");
//		System.out.println(" JJJ   ");

		
		
//		int age;
//		String name;
//		double weight;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("What is your name?");
//		name = input.next();
//		
//		System.out.println("How old are you?");
//		age = input.nextInt();
//		
//		System.out.println("What is your weight?");
//		weight = input.nextDouble();
//		
//		System.out.println("Hello, " + name + ".");
//		System.out.println(name + " is " + age + " years old, weighing " + weight + " lbs.");

		
//		int age;
//		String name;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("What is your name?");
//		name = input.next();
//		
//		System.out.println("How old are you?");
//		age = input.nextInt();
//		
//		if(age < 18) {
//			System.out.println(name + " cannot vote or buy smokes or booze.");
//		} else if(age >= 21) {
//			System.out.println(name + " can vote and buy smokes AND booze.");
//		} else if(18 <= age && age <= 21) {
//			System.out.println(name + " can vote and buy smokes but no booze.");
//		}
		
		
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Welcome to Jenny's Tiny Adventure");
//		System.out.println("You are in a spooky house! Would you like to go upstairs or into the kitchen?");
//		
//		String option1 = input.next();
//		switch (option1) {
//		case "kitchen": {
//			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the refrigerator or look in a cabinet.");
//				String option2 = input.next();
//				if (option2.toLowerCase().equals("refridgerator")) {
//					System.out.println("Inside the refridgerator you see food and stuff. It looks pretty nasty. Would you like to eat the food?");
//						String option3 = input.next();
//						if (option3.toLowerCase().equals("yes")) {
//							System.out.println("You die of food poisoning.");
//						} else if (option3.toLowerCase().equals("no")) {
//							System.out.println("You die of starvation...eventually.");
//						}
//				} else if (option2.toLowerCase().equals("cabinet")) {
//					System.out.println("Inside the cabinet you see a HUGE snake. Do you run out of the house screaming?");
//						String option4 = input.next();
//						if (option4.toLowerCase().equals("yes")) {
//							System.out.println("Good call. Snakes are The Worst.");
//						} else if (option4.toLowerCase().equals("no")) {
//							System.out.println("WTF is wrong with you? The snake eats you and you die.");
//						}
//				}
//		}
//		break;
//		
//		case "upstairs": {
//			System.out.println("Upstairs you see a hallway. At the end of the hallway is the bedroom. There is also a bathroom off the hallway.  Where would you like to go?");
//				String option5 = input.next();
//				if (option5.toLowerCase().equals("bedroom")) {
//					System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door?");
//						String option6 = input.next();
//						if (option6.toLowerCase().equals("no")) {
//							System.out.println("Well, I guess you'll never know what's in there you COWARD.");
//						} else if (option6.toLowerCase().equals("yes")) {
//							System.out.println("IT'S A GHOST! THIS IS A SPOOKY HOUSE REMEMBER!? RUN, YOU IDIOT!");
//						}
//				} else if (option5.toLowerCase().equals("bathroom")) {
//					System.out.println("You are in a filthy bathroom. There is a dark shower curtain hiding the tub. Do you want to look behind it?");
//						String option7 = input.next();
//						if (option7.toLowerCase().equals("no")) {
//							System.out.println("Well, I guess you'll never know what's in there you COWARD.");
//						} else if (option7.toLowerCase().equals("yes")) {
//							System.out.println("IT'S FULL OF BONES! BONES! FUCKING RUN. CLEARLY THERE'S A MANIAC LIVING IN THIS HOUSE.");
//						}
//				}
//		}
//		
//		}
		
		
		
		
		String bowsers[] = new String[6];
		bowsers[0] = "Amy";
		bowsers[1] = "Kevin";
		bowsers[2] = "Max";
		bowsers[3] = "Alex";
		bowsers[4] = "Kasey";
		bowsers[5] = "Lew";
		System.out.println(bowsers[0]);
		
		String ferriells[] = {"Linda", "Pete", "Megan", "Daniel"};	
		System.out.println(ferriells[2]);
		
		String tinstmans[] = {"Marilyn", "Dave", "Molly", "Mike", "Andy"};
		for(int i = 0; i < tinstmans.length; i++)
			System.out.println(tinstmans[i]);
		
		String kings[] = {"Dave", "Brandee", "Justin", "Jessica", "Elise"};
		for(int j = 4; j > -1; j--)
			System.out.println(kings[j]);
		
		int numbers[] = {6, 8, 2, 7, 0, 1, 3, 11, 67, 82};
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		int count[] = {1, 2, 3, 4, 5};
		for(int i = 4; i > -1; i--)
			System.out.println(count[i]);
		
		
		
	}
}
