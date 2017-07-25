import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ThreeOfAKind extends PokerHand{
	
	
	int tripletValue;
	int firstKickerValue;
	int secondKickerValue;
	
	public ThreeOfAKind(List<Card> cardsIn, String handNameIn, int handValueIn, int tripletValueIn, int firstKickerValueIn, int secondKickerValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Three of a kind"
		handValue = 3;
		tripletValue = tripletValueIn;
		firstKickerValue = firstKickerValueIn;
		secondKickerValue = secondKickerValueIn;
		
	}

	public int getTripletValue(){
		return tripletValue;
	}
	
	public int getFirstKickerValue(){
		return firstKickerValue;
	}
	
	public int getSecondKickerValue(){
		return secondKickerValue;
	}
	
}