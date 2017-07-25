import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {
	
	public static
	
	public static void main(String[] args){
		Deck deck = new Deck(new ArrayList<Card>());
		deck.setUp();
		List<Card> deck2 = deck.getDeckOfCards();
		
		System.out.println(deck2);

	}
}