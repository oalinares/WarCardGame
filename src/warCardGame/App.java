package warCardGame;

public class App {

	public static void main(String[] args) {
		
		Player playerUno = new Player("Jackie", 0);
		
		
		
		playerUno.describePlayer();
		Player playerDos = new Player("Daytona", 0);
		playerDos.describePlayer();
			Deck deck = new Deck();
			deck.shuffle();
			
			for(int i = 0; i < 52; i++) {
				if(i % 2 == 0) {
					playerUno.drawCard(deck);
				}
				else {
					playerDos.drawCard(deck);
				}
			}
			
		/*	for(int i = 0; i < 52; i++) {
				Card card = new Card(i);
				deck.addCard(card);
				card.describeCard();
			}*/
	
			
		
		//deck isn't shuffling
//		deck.shuffle();
		
		//Printing out PlayerUno twice
	//	playerUno.describePlayer();
		
		
			
		}
		
		
	}

