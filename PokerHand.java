import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class PokerHand extends Hand{
	
	// handValue is used to determine the ranking of each PokerHand. leadingCardValue is the value of the highest card in the PokerHand that you made. kickerValue is the value of the highest card that is remaining and not in your PokerHand
	String handName;
	int handValue;

	
	public PokerHand(List<Card> cardsIn, String handNameIn, int handValueIn){
		super(cardsIn);
		
		handName = handNameIn;
		handValue = handValueIn;

		
	}
	
	public int getHandValue(){
		return handValue;
	}
	
	public boolean isEqual(PokerHand opposingHand){
		
		if (handValue == opposingHand.getHandValue()){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public boolean isBetter(PokerHand opposingHand){
		
		if (handValue >= opposingHand.getHandValue()){
			return true;
			
		}
		
		else{
			return false;
		}
	}
	
}