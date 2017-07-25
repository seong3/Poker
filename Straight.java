import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Straight extends PokerHand{
	
	
	int leadValue;

	
	
	public Straight(List<Card> cardsIn, String handNameIn, int handValueIn, int leadValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		
		handName = "Straight"
		handValue = 4;
		leadValue = leadValueIn;
		
	}

	public int getLeadValue(){
		return leadValue;
	}

}