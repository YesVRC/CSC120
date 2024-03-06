package Lab5;
import java.util.Random;

/**
 * 
 * <p> Description: A collection of dice values </p>
 * 
 * @author Chris O'Hea
 */
public class Dice {
	private int die1 = 0; // First Die
	private int die2 = 0; // Second Die
	private int die3 = 0; // Third Die
	
	/**
	 * <h1> Dice </h1>
	 * <p> Default Dice Constructor </p>
	 * @return Instance of Dice
	 */
	public Dice() {
	}
	
	/**
	 * <h1> Dice </h1>
	 * <p> Parameterized Dice Constructor </p>
	 * @param die1 First die
	 * @param die2 Second die
	 * @param die3 Third die
	 * @return Instance of Dice
	 */
	public Dice(int die1, int die2, int die3){
		this.die1 = die1;
		this.die2 = die2;
		this.die3 = die3;
	}
	
	
	/**
	 * <h1> roll </h1>
	 * <p> Rolls the Dice </p>
	 */
	public void roll() {
		Random rand = new Random();
		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;
		die3 = rand.nextInt(6) + 1;
	}
	
	/**
	 * <h1> rollOneDie </h1>
	 * <p> Rolls one Die</p>
	 *	@param die Which die to roll
	 */
	public void rollOneDie(int die) {
		Random rand = new Random();
		if (die == 1) {
			die1 = rand.nextInt(6) + 1;
		}
		else if (die == 2) {
			die2 = rand.nextInt(6) + 1;
		}
		else if (die == 3) {
			die3 = rand.nextInt(6) + 1;
		}
		else {
			System.out.println("Invalid die number... try again.");
		}
		
		
		
	}
	
	/** 
	 * <h1> getDie1</h1>
	 * <p> Gets the first die </p>
	 * @return Die1 as integer
	 */
	public int getDie1() {
		return die1;
	}
	
	/**
	 * <h1> getDie2 </h1>
	 * <p> Gets the second die </p>
	 * @return Die2 as integer
	 */
	public int getDie2() {
		return die2;
	}
	
	/**
	 * <h1> getDie3 </h1>
	 * <p> Gets the third die</p>
	 * @return Die3 as integer
	 */
	public int getDie3() {
		return die3;
	}
	
	/**
	 * calcTotalRoll
	 * This method will calculate the sum of the values rolled
	 * on the three dice
	 * @return the sum of the three dice
	 */
	public int calcTotalRoll() {
		return die1 + die2 + die3;
	}
	
	/**
	 * threeOfAKind method
	 * this method will determine if all three of the dice
	 * have the same value
	 * @return true if they have the same value, false otherwise
	 */
	public boolean threeOfAKind() {
		return die1 == die2 && die2 == die3;
	}
	
	/**
	 * findHighestDie
	 * This method will determine the highest value on the
	 * three dice
	 * @return the highest value
	 */
	public int findHighestDie() {
		return Math.max(Math.max(die1, die2),die3);
	}
	
	/**
	 * <h1> toString </h1>
	 * <p> Gets the value as a string </p>
	 * @return String representing the Dice
	 */
	public String toString() {
		return String.format("%d %d %d", die1, die2, die3);
	}

}
