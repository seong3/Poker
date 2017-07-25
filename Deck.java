import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Deck{
	
	List<Card> deckOfCards;
	
	// constructor
	
	public Deck(List<Card> deckOfCardsIn){
		deckOfCards = deckOfCardsIn;
		
	}
	
	public void setUp(){
		String [] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for( String name : names){
			for( String suit: suits){
				int index = Arrays.asList(names).indexOf("name");
				Card card = new Card(name + " of " + suit, index, suit);
				deckOfCards.add(card);
			}
		}
		
	}
	
	public List<Card> getDeckOfCards(){
		return deckOfCards;
	}
	
	
	
	
}