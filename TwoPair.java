import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class TwoPair extends PokerHand{
	
	
	int highestPairValue;
	int secondHighestPairValue;
	int kickerValue;
	
	public TwoPair(List<Card> cardsIn, String handNameIn, int handValueIn, int highestPairValueIn, int secondHighestPairValueIn, int kickerValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Two pair"
		handValue = 2;
		highestPairValue = highestPairValueIn;
		secondHighestPairValue = secondHighestPairValueIn;
		kickerValue = kickerValueIn;
		
	}

	public int getHighestPairValue(){
		return highestPairValue;
	}
	
	public int getSecondHighestPairValue(){
		return secondHighestPairValue;
	}
	
	public int getKickerValue(){
		return kickerValue;
	}

}