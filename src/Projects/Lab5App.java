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
		
		// Roll total
		System.out.printf("The roll total is %d \n", dice.calcTotalRoll());
		System.out.println();
		
		// Three of a kind
		if(dice.threeOfAKind()) {
			System.out.println("Three of a kind.");
		}
		else {
			System.out.println("Not three of a kind.");
		}
		System.out.println();
		
		// Highest Value
		System.out.printf("The highest value of the three dice is %d \n", dice.findHighestDie());
		System.out.println();
		
		// Rolling only one
		dice.rollOneDie(1);
		System.out.println("Rolling die 1 only: " + dice.toString());
		dice.rollOneDie(2);
		System.out.println("Rolling die 2 only: " + dice.toString());
		dice.rollOneDie(3);
		System.out.println("Rolling die 3 only: " + dice.toString());
	}

}
