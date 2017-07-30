
public class Arrays {

	public static void main(String[] args) {
		int[] cupValues = new int[5];
		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;

		System.out.println(cupValues[0]); // prints "42"
		System.out.println(cupValues[1]); // prints "86"
		System.out.println(cupValues[2]); // prints "23"
		System.out.println(cupValues[3]); // prints "8"
		System.out.println(cupValues[4]); // prints "91"
		
		//change value for index 2
		cupValues[2] = 82;
		System.out.println("Changing value of index 2");
		cupValues[2] = 67;
		System.out.println(cupValues[2]);
		
		System.out.println("The length of my array is " + cupValues.length);
		
		String[] giantWords = { "fee", "fie", "foe", "fum" };
		// or this: String[] giantWords = new String[4];
		giantWords[0] = "fee";
		giantWords[1] = "fie";
		giantWords[2] = "foe";
		giantWords[3] = "fum";
		
		
		
		String myName = "Sue";
		char[] letters = myName.toCharArray();

		System.out.println("The first letter of my name is " + letters[0]);
		
		int lastIndex = letters.length - 1;
		System.out.println("The last letter of the boy's name is " + letters[lastIndex]);
		
		
		
		
		
String[] classNames = {"Brent", "Trina", "Jamie", "Adam"};
		
		System.out.println(classNames[0].charAt(0));
		System.out.println(classNames[1].charAt(0));
		System.out.println(classNames[2].charAt(0));
		System.out.println(classNames[3].charAt(0));
		
		
		
		
		
String[] roygbivColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
		
		//if I need to know an index or count or...
		for(int index = 0; index < roygbivColors.length; index++) {
			System.out.println("The color for index is " + index + " is " + roygbivColors[index]);
		}
		
		System.out.println("With an enhanced for (for each):");
		//if I only need to do something with every element in my array
		//enhanced for
		for(String color: roygbivColors) {
			System.out.println("The color is " + color);
		}
		
		char[] alphabet = {'a', 'b', 'c'};
		for(char letter: alphabet) {
			System.out.println(letter);
		}
		
		
		
		
		String sports = "hockey, baseball, football & basketball";
		String[] elements = sports.split(", | & "); //can also put .split("[,&]");
		
		System.out.println(elements[0]); 
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		System.out.println(elements[3]);
		
		
		
		
		String source = "this, that, the other";
		String[] stuff = source.split(", ");

		System.out.println(stuff[0]); // prints "this"
		System.out.println(stuff[1]); // prints "that"
		System.out.println(stuff[2]); // prints "the other"
		
		System.out.println("Splitting on \'t\'.");
		String[] splitOnT = source.split("t");
		
		System.out.println("Number of things " + splitOnT.length);
		
		for(int index = 0; index < splitOnT.length; index++) {
			System.out.println("Element at index " + index + ": " + splitOnT[index]);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
