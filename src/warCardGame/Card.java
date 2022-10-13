package warCardGame;

public class Card {
	//These are the fields of Card: value can be seen as rank hierarchy, and the name are just the suits of the card.
	private int value;
	private int name; 
	
	/*Since, there is 52 cards in a deck, you can divide by 13, which will give you the 4 suits, the operand
	 * operates in the same manner, except prints out the index of the array in a circular manner.
	 */
	public Card(int card) {
		this.name = card/13;
		this.value = card%13;
	}
	//Method used to get the suits
	public int getName() {
		return name;
	}
	//Method used to get the rank
	public int getValue() {
		return value;
	}
	//I am able to use this toString method to print out the 26 cards of a hand, and was originally being used for the describe()**
	/*public String toString() {
		String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		return "This card is the: " + values[this.getValue()] + " of " + names[this.getName()];
}*/
	
	public void describeCard() {
		String [] names = {"Clubs", "Spades", "Diamonds", "Hearts"};
		String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		System.out.println("This card is the: " + values[this.getValue()] + " of " + names[this.getName()]);
	}
	
}
