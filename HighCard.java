import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class HighCard extends PokerHand{
	
	
	int firstKickerValue;
	int secondKickerValue;
	int thirdKickerValue;
	int fourthKickerValue;
	int lastKickerValue;
	
	
	public HighCard(List<Card> cardsIn, String handNameIn, int handValueIn, int firstKickerValueIn, int secondKickerValueIn, int thirdKickerValue, int fourthKickerValueIn, int lastKickerValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "High Card"
		handValue = 0;
		firstKickerValue = firstKickerValueIn;
		secondKickerValue = secondKickerValueIn;
		thirdKickerValue = thirdKickerValueIn;
		fourthKickerValue = fourthKickerValueIn;
		lastKickerValue = lastKickerValueIn;
		
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
	
	public int getFourthKickerValue(){
		return fourthKickerValue;
	}
	
	public int getLastKickerValue(){
		return lastKickerValue;
	}


}