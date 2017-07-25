import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class FullHouse extends PokerHand{
	
	
	int tripletValue;
	int pairValue;
	
	
	public FullHouse(List<Card> cardsIn, String handNameIn, int handValueIn, int tripletValueIn, int pairValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Full house"
		handValue = 6;
		tripletValue = tripletValueIn;
		pairValue = pairValueIn;
		
	}

	public int getTripletValue(){
		return tripletValue;
	}
	
	public int getPairValue(){
		return pairValue;
	}


}