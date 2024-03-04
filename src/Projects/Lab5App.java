package Lab5;


/**
 * <h1> Lab 5 </h1>
 * 
 * <p> Description: Lab 5 App </p>
 * 
 * @author Chris O'Hea <n00908416@students.ncc.edu>
 */
public class Lab5App {

	public static void main(String[] args) {
		
		Dice dice = new Dice(); // Instance of Dice
		
		// Check initial dice values
		System.out.println("After instantiation: " + dice.toString());
		System.out.println("Value of Die 1: " + dice.getDie1());
		System.out.println("Value of Die 2: " + dice.getDie2());
		System.out.println("Value of Die 3: " + dice.getDie3());
		System.out.println();
		
		// Roll the dice and check again!
		dice.roll();
		System.out.println("After rolling the dice: " + dice.toString());
		System.out.println("Value of Die 1: " + dice.getDie1());
		System.out.println("Value of Die 2: " + dice.getDie2());
		System.out.println("Value of Die 3: " + dice.getDie3());
		System.out.println();
		
	}

}
