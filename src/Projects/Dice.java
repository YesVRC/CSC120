/**
 * 
 */
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
		roll();
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
		die1 = rand.nextInt(1, 7);
		die2 = rand.nextInt(1, 7);
		die3 = rand.nextInt(1, 7);
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
	 * <h1> getTotal </h1>
	 * <p> Gets total of die values </p>
	 * @return Total of dice as an integer
	 */
	public int getTotal() {
		return die1 + die2 + die3;
	}
	
	/**
	 * <h1> getMax</h1>
	 * <p> Gets Max value of die values </p>
	 * @return Max die value as an integer
	 */
	public int getMax() {
		return Math.max(Math.max(die1, die2),die3);
	}
	
	/**
	 * <h1> getMin</h1>
	 * <p> Gets Min value of die values </p>
	 * @return Min die value as an integer
	 */
	public int getMin() {
		return Math.min(Math.min(die1, die2),die3);
	}
	
	/**
	 * <h1> toString </h1>
	 * <p> Gets the value as a string </p>
	 * @return String representing the Dice
	 */
	public String toString() {
		return String.format("%d %d %d", die1, die2, die3);
	}
	
	/**
	 * <h1> toArray </h1>
	 * <p> Gets the dice as an array </p>
	 * @return An array of the values
	 */
	public int[] toArray() {
		int[] dice = {die1, die2, die3};
		return dice;
	}

}
