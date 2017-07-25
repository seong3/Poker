import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Flush extends PokerHand{
	
	
	int highestValue;
	int secondHighestValue;
	int thirdHighestValue;
	int fourthHighestValue;
	int lowestValue;
	
	
	public Flush(List<Card> cardsIn, String handNameIn, int handValueIn, int highestValueIn, int secondHighestValueIn, int thirdHighestValueIn, int fourthHighestValueIn, int lowestValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Flush"
		handValue = 5;
		highestValue = highestValueIn;
		secondHighestValue = secondHighestValueIn;
		thirdHighestValue = thirdHighestValueIn;
		fourthHighestValue = fourthHighestValueIn;
		lowestValue = lowestValueIn;
		
	}


	public int getHighestValue(){
		return highestValue;
	}
	
	public int getSecondHighestValue(){
		return secondHighestValue;
	}
	
	public int getThirdHighestValue(){
		return thirdHighestValue;
	}
	
	public int getFourthHighestValue(){
		return fourthHighestValue;
	}
	
	public int getLowestValue(){
		return lowestValue;
	}
	
	
}


