import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class OnePair extends PokerHand{
	
	
	int pairValue;
	int firstKickerValue;
	int secondKickerValue;
	int thirdKickerValue;
	
	public OnePair(List<Card> cardsIn, String handNameIn, int handValueIn, int pairValueIn, int firstKickerValueIn, int secondKickerValueIn, int thirdKickerValue){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Pair"
		handValue = 1;
		pairValue = pairValueIn;
		firstKickerValue = firstKickerValueIn;
		secondKickerValue = secondKickerValueIn;
		thirdKickerValue = thirdKickerValueIn;
		
	}

	public int getPairValueIn(){
		return pairValue;
	}
	
	public int getFirstKickerValue(){
		return firstKickerValue;
	}
	
	public int getSecondKickerValue(){
		return secondKickerValue;
	}

	public int getThirdKickerValue(){
		return thirdKickerValue;
	}
}