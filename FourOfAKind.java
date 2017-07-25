import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class FourOfAKind extends PokerHand{
	
	
	int quadrupleValue;
	int kickerValue;
	
	
	public FourOfAKind(List<Card> cardsIn, String handNameIn, int handValueIn, int quadrupleValueIn, int kickerValueIn){
		super(cardsIn, handNameIn, handValueIn);
		
		handName = "Four of a kind";
		handValue = 7;
		quadrupleValue = quadrupleValueIn;
		kickerValue = kickerValueIn;
		
	}
	
	public int getQuadrupleValue(){
		return quadrupleValue;
	}
	
	public int getKickerValue(){
		return kickerValue;
	}

	public Comparison isStronger(FourOfAKind opposingHand){
		if (quadrupleValue > opposingHand.getQuadrupleValue()){return Comparison.better;}
			
		else if(quadrupleValue == opposingHand.getQuadrupleValue()){
			
			if( kickerValue > opposingHand.getKickerValue()){return Comparison.better;}
				
			
			else if(kickerValue == opposingHand.getKickerValue()){return Comparison.same;}
					
					
				
			else{return Comparison.worse;}
			
			}
		
		else{return Comparison.worse;}
			
	}


}